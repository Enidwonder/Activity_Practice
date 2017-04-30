package com.example.lenovo.practice_newlayout;

/**
 * Created by lenovo on 2017/4/22.
 */

public class Weather  {
    private String type;
    private int imageId;
    private String top_temp;
    private String bottom_temp;
    public Weather(String type,int imageId,String top_temp,String bottom_temp){
        this.type = type;
        this.imageId = imageId;
        this.top_temp = top_temp;
        this.bottom_temp = bottom_temp;
    }
    public String getType(){
        return type;
    }
    public int getImageId(){
        return imageId;
    }
    public String getTop_temp(){return top_temp;}
    public String getBottom_temp(){return bottom_temp;}
}
