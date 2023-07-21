package com.example.hello2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
/*
   MainActivity 는 hello2 앱이 launch(실행) 될때 최초로 사용자를 대면하는 액티비티 이다.
   대체로 액티비티 하나는 화면 하나이다.
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //res//layout/activity.main.xml 문서를 전개(해석) 해서 화면 구성하기
        setContentView(R.layout.activity_main);
    }
    //버튼을 클릭했을때 호출되는 메소드( View 객체의 매게 변수에 전달된다.)
    public void clicked(View v){
        Toast.makeText(this, "버튼을 눌렀네요?", Toast.LENGTH_SHORT).show(); //Toast 에서 create new Toast선택
    }

    public void deleteClicked(View v){
        Toast.makeText(this, "삭제합니다.", Toast.LENGTH_SHORT).show();
    }
}