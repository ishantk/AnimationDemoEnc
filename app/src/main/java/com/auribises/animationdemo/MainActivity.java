package com.auribises.animationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button)findViewById(R.id.button);
        imageView = (ImageView)findViewById(R.id.imageView);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.roatate_animation);
        btnSubmit.startAnimation(animation);

        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();

        MyTask task = new MyTask();
        task.execute();
    }

    class MyTask extends AsyncTask{

        @Override
        protected void onPreExecute() {

        }

        @Override
        protected Object doInBackground(Object[] objects) {



            return null;
        }

        @Override
        protected void onPostExecute(Object o) {

        }
    }
}
