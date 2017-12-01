package com.example.toki.gredview_home;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by toki on 2017/11/30.
 */

public class ImageAdapter extends BaseAdapter {

    Context context;
    ImageAdapter(Context context)
    {
        this.context=context;
    }
    @Override
    public int getCount() {
        return grid.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ImageView imageView;
        if(convertView==null)
        {
            imageView=new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(300,400));
            imageView.setScaleType((ImageView.ScaleType.CENTER_CROP));
            imageView.setPadding(8,8,8,8);
        }
        else
        {
            imageView= (ImageView) convertView;
        }
        imageView.setImageResource(grid[position]);
        return imageView;
    }
    public Integer [] grid={R.drawable.btn,R.drawable.btn,R.drawable.btn,R.drawable.btn,R.drawable.btn,R.drawable.btn,R.drawable.btn,R.drawable.btn,R.drawable.btn,};
}
