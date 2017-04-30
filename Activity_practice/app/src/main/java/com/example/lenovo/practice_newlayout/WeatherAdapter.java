package com.example.lenovo.practice_newlayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 2017/4/22.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {  //<>中将泛型指定为Weather类
    private List<Weather> myWeatherList;  //用于储存数据

    public WeatherAdapter (List<Weather> weatherlist) {  //初始化数据，传入数据源
        myWeatherList = weatherlist;
    }

    class ViewHolder extends RecyclerView.ViewHolder{  //储存View,从weather_item布局文件中取
        ImageView weather_image;
        TextView weather_name;
        TextView top_temperature;
        TextView low_temperature;

        public ViewHolder(View view){
            super(view);
            weather_image = (ImageView) view.findViewById(R.id.weather_image);
            weather_name = (TextView)view.findViewById(R.id.weather_type);
            top_temperature = (TextView)view.findViewById(R.id.top_temp);
            low_temperature = (TextView)view.findViewById(R.id.low_temp);
        }
    }

    @Override
    //给子项数据赋值,通过position得到当前实例，再将数据通过viewholder
    public void onBindViewHolder(ViewHolder holder, int position) {
        Weather weather = myWeatherList.get(position);
        holder.weather_image.setImageResource(weather.getImageId());
        holder.weather_name.setText(weather.getType());
        holder.top_temperature.setText(weather.getTop_temp());
        holder.low_temperature.setText(weather.getBottom_temp());
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {  //创建ViewHolder实例
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return myWeatherList.size();
    }


}
