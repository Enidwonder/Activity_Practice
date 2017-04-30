package com.example.lenovo.practice_newlayout;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Weather> weatherList = new ArrayList<>();  //Weather类的list，来传入保存listview要用的数据
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ActionBar actionbar = getSupportActionBar(); //隐藏自带标题栏
//        if(actionbar != null){
//            actionbar.hide();
//        }
        initWeather(); //子函数，用于初始化List数据

        WeatherAdapter adapter = new WeatherAdapter(weatherList);  //实例化适配器
        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.recycler_view); //获取要应用的recyclerview实例
        LinearLayoutManager layoutManager = new LinearLayoutManager(this); //设置布局排列方式
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setAdapter(adapter); //为recyclerview实例设置（添加）适配器
    }
    private void initWeather(){
        int i;
        for(i=0;i<2;i++){  //数据重复展示2次
            Weather clear = new Weather("clear",R.drawable.art_clear2,"18","11");
            weatherList.add(clear); //向list数据中加入一项
            Weather rain = new Weather("rain",R.drawable.art_light_rain2,"12","5");
            weatherList.add(rain);
            Weather fog = new Weather("fog",R.drawable.art_fog2,"11","8");
            weatherList.add(fog);
            Weather clouds = new Weather("clouds",R.drawable.art_clouds2,"10","6");
            weatherList.add(clouds);
            Weather storm = new Weather("storm",R.drawable.art_storm2,"8","6");
            weatherList.add(storm);
            Weather snow = new Weather("snow",R.drawable.art_snow2,"5","-2");
        }
    }
}
