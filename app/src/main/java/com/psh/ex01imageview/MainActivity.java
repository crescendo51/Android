package com.psh.ex01imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //액티비티가 보여주는 뷰들의 참조변수는 가급적 멤버변수에 선언
    ImageView iv;

    Button btn01, btn02, btn03, btn04;

    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.iv);
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);
        btn03 = findViewById(R.id.btn03);
        btn04 = findViewById(R.id.btn04);

        btn01.setOnClickListener(Listener);
        btn02.setOnClickListener(Listener);
        btn03.setOnClickListener(Listener);
        btn04.setOnClickListener(Listener);

        iv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //이미지뷰의 이미지를 변경해보기
                iv.setImageResource(R.drawable.panda1+num);
                num++;
                if(num>12)
                    num = 0;
            }
        });


    } //on create method

    View.OnClickListener Listener = new OnClickListener() { //파라미터 view : 클릭을 한 버튼을 참조하는 참조변수
        @Override
        public void onClick(View view) {
            //어떤 뷰(button)를 클릭하여서
            int id= view.getId();

            //id에 대입할 해당 버튼의 기능을 구현

            if (id == R.id.btn01)
                iv.setImageResource(R.drawable.panda1);
            else if (id == R.id.btn02)
                iv.setImageResource(R.drawable.panda2);
            else if (id == R.id.btn03)
                iv.setImageResource(R.drawable.panda3);
            else if (id == R.id.btn04)
                iv.setImageResource(R.drawable.panda4);

        }

    };


}//MainActivity