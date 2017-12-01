package com.example.toki.gredview_home;

import android.content.Intent;
import android.graphics.Color;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Vibrator vibrator;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        int position = intent.getExtras().getInt("id");
        int boom = intent.getExtras().getInt("toki");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        ImageView imageView = findViewById(R.id.gridView);
        TextView textView = findViewById(R.id.game);
        button = findViewById(R.id.button);
        try {
            Thread.sleep(1000);
            if (boom == position) {
                vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                vibrator.vibrate(1000);
                imageView.setImageResource(R.drawable.boom);
                textView.setText("GAME OVER");
                textView.setTextColor(Color.rgb(250, 0, 0));
            } else {
                Main2Activity main2Activity = new Main2Activity();
//            main2Activity.good(position);
                imageView.setImageResource(R.drawable.safe);
                textView.setText("Continue!!");
                textView.setTextColor(Color.rgb(0, 0, 128));

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   finish();
                }
            });

    }
}

