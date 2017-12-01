package com.example.toki.gredview_home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        GridView gridView=findViewById(R.id.imageGridView);
        gridView.setAdapter(new ImageAdapter(this));
        Random random=new Random();
        final int a =random.nextInt(9);
        final ImageAdapter imageAdapter = new ImageAdapter(this);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
             Intent intent=new Intent(getApplicationContext(),MainActivity.class);
             intent.putExtra("id",position);
             intent.putExtra("toki",a);
             startActivity(intent);
             //ImageView imageView=findViewById(imageAdapter.grid[position]);
                // imageView.setImageResource(R.drawable.button);
            }
        });
    }

}
