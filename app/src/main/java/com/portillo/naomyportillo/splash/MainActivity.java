package com.portillo.naomyportillo.splash;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView avatar;
    ImageView matrix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startMatrixAnimation();
        startAvatarAnimation();
    }

    public void startAvatarAnimation(){

        AnimationDrawable frameAnimation = new AnimationDrawable();
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.avatarwithcape1), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.avatarwithcape2), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.avatarwithcape3), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.avatarwithcape4), 100);

        avatar = (ImageView) findViewById(R.id.avatar_imageView);
        avatar.setBackgroundDrawable(frameAnimation);

        frameAnimation.start();
    }

    public void startMatrixAnimation(){

        AnimationDrawable frameAnimation = new AnimationDrawable();
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame1), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame2), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame3), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame4), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame5), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame6), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame7), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame8), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame9), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame10), 100);
        frameAnimation.addFrame(getResources().getDrawable(R.drawable.matrix_frame11), 100);

        matrix = (ImageView) findViewById(R.id.matrix_imageView);
        matrix.setBackgroundDrawable(frameAnimation);

        frameAnimation.start();
    }

}
