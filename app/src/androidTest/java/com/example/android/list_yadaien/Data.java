package com.example.android.list_yadaien;

/**
 * Created by RaoArsalan on 9/26/2016.
 */

public class Data {
    private String name  , place , imgaddress;
    Data(){}
    Data(String name,String place,String imgaddress){

        this.name = name ;
        this.place = place ;
        this.imgaddress = imgaddress ;

    }

                String getName(){
                    return name;
                }
            String getPlace(){
                return place;

            }
    String getImageAddress(){
        return imgaddress;
    }
}
