package com.example.cantospeakmastery;



import android.media.MediaPlayer;
import android.os.SystemClock;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;



public class podcasttest01 extends AppCompatActivity {
    private Button main_ib_button;
    private ImageView imageView;
    private MediaPlayer mediaPlayer;
    private SeekBar main_seekBar;
    private Boolean isplay=false;
    private Mythred mythred;
    private static TextView tv_progress,tv_total;
    private TextView songname;


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回播客選單", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcasttest01);


        imageView=findViewById(R.id.img);
        songname=findViewById(R.id.song_name);
        main_ib_button = (Button) findViewById(R.id.btn_play);
        main_seekBar = (SeekBar) findViewById(R.id.sb);
        tv_progress=(TextView)findViewById(R.id.tv_progress);
        tv_total=(TextView)findViewById(R.id.tv_total);
       String dl_name = getIntent().getStringExtra("detail_name");    //接收图片的id
        int img_id = getIntent().getIntExtra("detail_img",0);
        songname.setText(dl_name);
        imageView.setImageResource(img_id);




        //给进度条设置监听(以次来实现快进功能)
        main_seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int duration2 = mediaPlayer.getDuration() / 1000;//获取音乐总时长
                int position = mediaPlayer.getCurrentPosition();//获取当前播放的位置
                tv_progress.setText(calculateTime(position / 1000));//开始时间
                tv_total.setText(calculateTime(duration2));//总时长
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //首先获取seekbar拖动后的位置
                int progress=main_seekBar.getProgress();
                //跳转到某个位置播放
                mediaPlayer.seekTo(progress);
                tv_progress.setText(calculateTime(mediaPlayer.getCurrentPosition() / 1000));
            }
        });



    }

    public String calculateTime(int time){
        int minute;
        int second;
        if(time > 60){
            minute = time / 60;
            second = time % 60;
            //分钟再0~9
            if(minute >= 0 && minute < 10){
                //判断秒
                if(second >= 0 && second < 10){
                    return "0"+minute+":"+"0"+second;
                }else {
                    return "0"+minute+":"+second;
                }
            }else {
                //分钟大于10再判断秒
                if(second >= 0 && second < 10){
                    return minute+":"+"0"+second;
                }else {
                    return minute+":"+second;
                }
            }
        }else if(time < 60){
            second = time;
            if(second >= 0 && second < 10){
                return "00:"+"0"+second;
            }else {
                return "00:"+ second;
            }
        }
        return null;
    }
    public void playOrPause(View view){

        if(mediaPlayer==null) {
            isplay=true;
            //0.1 播放raw中的音乐（在项目的res下新建的文件夹raw）
            int song_id = getIntent().getIntExtra("detail_song",0);
            mediaPlayer = MediaPlayer.create(this,song_id);
         mediaPlayer.start();
          //改变图标（实现暂停）
          main_ib_button.setText("暫停播放");
         //获得音乐总时长
          int lengthoftime = mediaPlayer.getDuration();

          main_seekBar.setMax(lengthoftime);

          //开启线程\
          mythred = new Mythred();
          mythred.start();

         //播放完之后停止线程
          //设置媒体播放器的监听
         mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
              @Override
             public void onCompletion(MediaPlayer mp) {
                 isplay = false;
                  mythred = null;
                  main_ib_button.setText("繼續播放");
             }
         });





//

            //准备完成的监听
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mediaPlayer.start();
                    //改变图标（实现暂停）
                    main_ib_button.setText("暫停播放");
                    //获得音乐总时长
                    int lengthoftime = mediaPlayer.getDuration();
                    main_seekBar.setMax(lengthoftime);
                    //开启线程\
                    mythred = new Mythred();
                    mythred.start();
                    mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() {
                        @Override
                        public void onBufferingUpdate(MediaPlayer mp, int percent) {
                            //得到缓冲值
                            int secendProssed= mediaPlayer.getDuration()/100*percent;
                            //设置第二进度
                            main_seekBar.setSecondaryProgress(secendProssed);

                        }
                    });


                }
            });
            //播放完之后停止线程
            //设置媒体播放器的监听
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    isplay = false;
                    mythred = null;
                    main_ib_button.setText("開始播放");
                }
            });



        }else if (mediaPlayer.isPlaying()){
            isplay=false;
            mediaPlayer.pause();
            //改变图标（实现播放）
            main_ib_button.setText("開始播放");
            //当停止播放时线程也停止了(这样也可以减少占用的内存)
            mythred=null;

        }else {
            isplay=true;
            mediaPlayer.start();
            //改变图标（实现暂停）
            main_ib_button.setText("暫停播放");
            mythred = new Mythred();
            mythred.start();
        }

    }

    class Mythred extends Thread{
        @Override
        public void run() {
            super.run();
            while(main_seekBar.getProgress()<=main_seekBar.getMax()){
                //设置进度条的进度
                //得到当前音乐的播放位置
                int  currentPosition=mediaPlayer.getCurrentPosition();
                Log.i("test","currentPosition"+currentPosition);
                main_seekBar.setProgress(currentPosition);
                //让进度条每一秒向前移动
                SystemClock.sleep(1000);


                if (!isplay){
                    break;

                }

            }

        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        if(mediaPlayer != null){
            mediaPlayer.release();
            return;


        }
    }

}