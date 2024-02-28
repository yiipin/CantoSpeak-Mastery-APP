package com.example.cantospeakmastery;

import java.util.ArrayList;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

//import static com.example.cantospeakmastery.R.id.vocabulary;

public class MyCustomBaseAdapter extends BaseAdapter {
    private static ArrayList<SearchResults> searchArrayList;

    private LayoutInflater mInflater;

    public MyCustomBaseAdapter(Context context, ArrayList<SearchResults> results) {
        searchArrayList = results;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return searchArrayList.size();
    }

    public Object getItem(int position) {
        return searchArrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.custom_row_view, null);
            holder = new ViewHolder();
            holder.txtvocabulary = (TextView) convertView.findViewById(R.id.c_vocabulary);
            holder.txtChinese = (TextView) convertView
                    .findViewById(R.id.c_Chinese);
            holder.txtspelling = (TextView) convertView.findViewById(R.id.c_spelling);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtvocabulary.setText(searchArrayList.get(position).getvocabulary());
        holder.txtChinese.setText(searchArrayList.get(position)
                .getChinese());
        holder.txtspelling.setText(searchArrayList.get(position).getspelling());

        return convertView;
    }

    static class ViewHolder {
        TextView txtvocabulary;
        TextView txtChinese;
        TextView txtspelling;
    }
}
