package com.example.lenovo.activity_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu); //两个参数分别是：通过哪个资源文件创建菜单、指定菜单项添加到哪一个Menu对象中
        return true; //允许菜单显示
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //定义菜单响应事件
        switch (item.getItemId()){
            case R.id.A_item:
                Toast.makeText(this,"A",Toast.LENGTH_SHORT).show();
                break;
            case R.id.B_item:
                Toast.makeText(this,"B",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout); //给当前活动加载布局
        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Toast.makeText(FirstActivity.this,"You clicked Button1",Toast.LENGTH_SHORT).show();
                //用makeText静态方法创建Toast对象，再调用show显示；三个参数分别是：上下文、Toast显示的文本内容、显示时长
            }
        });


    }
}
