package com.example.firebasetutorial1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
RelativeLayout myLayout;
AnimationDrawable mAnimationDrawable;
    CardView mCardView1;
    CardView mCardView5;
    CardView mCardView2;
    CardView mCardView3;
    CardView mCardView4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLayout=(RelativeLayout) findViewById(R.id.myLayout);
        mAnimationDrawable=(AnimationDrawable)myLayout.getBackground();
        mAnimationDrawable.setEnterFadeDuration(1000);
        mAnimationDrawable.setExitFadeDuration(2000);
        mAnimationDrawable.start();
        mCardView1=(CardView)findViewById(R.id.cardView1);
        mCardView1.setTranslationX(-1000f);
        ObjectAnimator animation = ObjectAnimator.ofFloat(mCardView1, "translationX", 0f);
        animation.setDuration(500);
        animation.start();
        mCardView2=(CardView)findViewById(R.id.cardView2);
        mCardView2.setTranslationX(-1000f);
        ObjectAnimator animation1 = ObjectAnimator.ofFloat(mCardView2, "translationX", 0f);
        animation1.setDuration(1000);
        animation1.start();
        mCardView3=(CardView)findViewById(R.id.cardView3);
        mCardView3.setTranslationX(-1000f);
        ObjectAnimator animation2 = ObjectAnimator.ofFloat(mCardView3, "translationX", 0f);
        animation2.setDuration(1500);
        animation2.start();
        mCardView4=(CardView)findViewById(R.id.cardView4);
        mCardView4.setTranslationX(-1000f);
        ObjectAnimator animation3 = ObjectAnimator.ofFloat(mCardView4, "translationX", 0f);
        animation3.setDuration(2000);
        animation3.start();
        mCardView5=(CardView)findViewById(R.id.cardView5);
        mCardView5.setTranslationX(-1000f);
        ObjectAnimator animation4 = ObjectAnimator.ofFloat(mCardView5, "translationX", 0f);
        animation4.setDuration(2500);
        animation4.start();



    }
}
