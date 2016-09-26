package com.example.android.list_yadaien;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

import static android.R.attr.data;
import static android.R.attr.name;
import static android.R.attr.resource;
import static android.R.attr.value;
import static android.R.interpolator.linear;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.media.CamcorderProfile.get;

/**
 * Created by RaoArsalan on 9/26/2016.
 */


public class CustomAdapter extends ArrayAdapter<Data> {
    Context context;
    private int resourceId;
     List<Data> objects ;

    private TextView name , place;
    private ImageView img;

    public CustomAdapter(Context context, int resource, List<Data> objects) {
        super(context, resource, objects);

        this.context = context ;
        resourceId = resource ;
        this.objects = objects ;


    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       Log.i("getView","here");


       if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resourceId, parent,false);

          name = (TextView) convertView.findViewById(R.id.text);
          place = (TextView) convertView.findViewById(R.id.text2);
           img = (ImageView) convertView.findViewById(R.id.image);



            name.setText(objects.get(position).getName());

           place .setText(objects.get(position).getPlace());



           int imgRef = objects.get(position).getImageAddress();
                    //Log.i("ImageAddress",ab);

           use here img.setDrawableResource(imgRef) etc  or img.setImageResource(getResources().getDrawable(imgRef)) there will be some method just like these.
           //img.setImageResource(  img.getResources().getIdentifier(objects.get(position).getImageAddress(), "drawable", context.getPackageName()));
        }



        return convertView;


   }
    }

