package com.example.android.list_yadaien;

/**
 * Created by RaoArsalan on 9/26/2016.
 */

public class Data {
    private String name  , place;
    private int imageAddress ;
    Data(){}
    Data(String name,String place,int imgaddress){

        this.name = name ;
        this.place = place ;
        this.imageAddress = imgaddress ;

    }

                String getName(){
                    return name;
                }
            String getPlace(){
                return place;

            }
    int getImageAddress(){
        return imageAddress;
    }
}
