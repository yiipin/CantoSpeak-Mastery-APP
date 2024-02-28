window.onload = function(){
    var slider = document.getElementsByClassName('slider')[0];
    var btn1 = document.getElementsByClassName('btn1')[0];
    var btn2 = document.getElementsByClassName('btn2')[0];
    var btn3 = document.getElementsByClassName('btn3')[0];
    var btn4 = document.getElementsByClassName('btn4')[0];
    var btn5 = document.getElementsByClassName('btn5')[0];

    btn1.onclick = function(){
        slider.style.transform = 'translateX(0)';
    }
    btn2.onclick = function(){
        slider.style.transform = 'translateX(-20%)';
    }
    btn3.onclick = function(){
        slider.style.transform = 'translateX(-40%)';
    }
    btn4.onclick = function(){
        slider.style.transform = 'translateX(-60%)';
    }
    btn5.onclick = function(){
        slider.style.transform = 'translateX(-80%)';
    }
}