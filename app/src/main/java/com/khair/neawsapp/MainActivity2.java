package com.khair.neawsapp;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {

    ImageView coverImage;
    TextView tvTittle,tvDes;

    FloatingActionButton floatingactionbutton;
    public  static String Tittle="";
    public  static String Des="";

    public  static Bitmap bitmap=null;

    TextToSpeech textToSpeech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        coverImage=findViewById(R.id.coverImage);
        tvTittle=findViewById(R.id.tvTittle);
        tvDes=findViewById(R.id.tvDes);
        floatingactionbutton=findViewById(R.id.floatingactionbutton);

        tvTittle.setText(Tittle);
        tvDes.setText(Des);
        if (bitmap!=null)coverImage.setImageBitmap(bitmap);


        textToSpeech=new TextToSpeech(MainActivity2.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });


        floatingactionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String string=tvDes.getText().toString();
                 textToSpeech.speak(string,TextToSpeech.QUEUE_FLUSH,null,null);
            }
        });













    }
}