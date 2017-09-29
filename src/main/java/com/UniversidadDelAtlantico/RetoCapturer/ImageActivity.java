package com.UniversidadDelAtlantico.RetoCapturer;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import uk.co.senab.photoview.PhotoViewAttacher;

public class ImageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Button scam = (Button)findViewById(R.id.scam);
        Random rand = new Random();
        int n = rand.nextInt(20);

        ImageView imagen = (ImageView)findViewById(R.id.imagenrandom);
        PhotoViewAttacher photoView = new PhotoViewAttacher(imagen);

        switch (n) {
            case 0:
                imagen.setImageResource(R.drawable.ua1);
                photoView.update();
                break;
            case 1:
                imagen.setImageResource(R.drawable.ua2);
                photoView.update();
                break;
            case 2:
                imagen.setImageResource(R.drawable.ua3);
                photoView.update();
                break;
            case 3:
                imagen.setImageResource(R.drawable.ua4);
                photoView.update();
                break;
            case 4:
                imagen.setImageResource(R.drawable.ua5);
                photoView.update();
                break;
            case 5:
                imagen.setImageResource(R.drawable.ua6);
                photoView.update();
                break;
            case 6:
                imagen.setImageResource(R.drawable.ua7);
                photoView.update();
                break;
            case 7:
                imagen.setImageResource(R.drawable.ua8);
                photoView.update();
                break;
            case 8:
                imagen.setImageResource(R.drawable.ua9);
                photoView.update();
                break;
            case 9:
                imagen.setImageResource(R.drawable.ua10);
                photoView.update();
                break;
            case 10:
                imagen.setImageResource(R.drawable.ua11);
                photoView.update();
                break;
            case 11:
                imagen.setImageResource(R.drawable.ua12);
                photoView.update();
                break;
            case 12:
                imagen.setImageResource(R.drawable.ua13);
                photoView.update();
                break;
            case 13:
                imagen.setImageResource(R.drawable.ua14);
                photoView.update();
                break;
            case 14:
                imagen.setImageResource(R.drawable.ua15);
                photoView.update();
                break;
            case 15:
                imagen.setImageResource(R.drawable.ua16);
                photoView.update();
                break;
            case 16:
                imagen.setImageResource(R.drawable.ua17);
                photoView.update();
                break;
            case 17:
                imagen.setImageResource(R.drawable.ua18);
                photoView.update();
                break;
            case 18:
                imagen.setImageResource(R.drawable.ua19);
                photoView.update();
                break;
            default:
                imagen.setImageResource(R.drawable.ua20);
                photoView.update();
                break;
        }

        scam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this, UnityPlayerNativeActivity.class);
                startActivity(intent);
            }
        });
    }
}

