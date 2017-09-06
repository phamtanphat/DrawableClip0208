package com.ptp.phamtanphat.drawableclip0208;

import android.graphics.drawable.ClipDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btngif;
    int curent = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageview);
        btngif = (Button) findViewById(R.id.buttongif);
        imageView.setImageLevel(1000);
        // Lay gia tri tu imageview co chua gia tri cua file drawable
        final ClipDrawable clipDrawable = (ClipDrawable) imageView.getDrawable();
//        Log.d("AAA",clipDrawable.toString());
        btngif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                final Handler handler = new Handler();
//                Runnable runnable = new Runnable() {
//                    @Override
//                    public void run() {
//                        if (curent >= 10000){
//                            curent = 0;
//                        }
//                        imageView.setImageLevel(curent + 1000);
//                        handler.postDelayed(this,400);
//                    }
//                };
//                handler.postDelayed(runnable,2000);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        curent = clipDrawable.getLevel();
                        if (curent >= 10000){
                            curent = 0;
                        }
                        imageView.setImageLevel(curent + 1000);
                        handler.postDelayed(this,400);
                    }
                },1500);
            }
        });

    }
}
