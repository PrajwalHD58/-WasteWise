package com.example.WasteWise.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.WasteWise.Onboarding.OnboardingActivity;
import com.example.WasteWise.R;

public class SplashActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    Animation animationUptoDown, animationDownToUp;

    private String s1 = "username", s3 = "isCheck";
    private static final String PREF = "PREFS";
    private static String username = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView = findViewById(R.id.txt_v);
        imageView = findViewById(R.id.image_view);
        animationUptoDown = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.uptodownanim);
        animationDownToUp = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.downtotopanim);

        imageView.setAnimation(animationUptoDown);
        textView.setAnimation(animationDownToUp);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (loadData()) {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                } else {
                    startActivity(new Intent(SplashActivity.this, OnboardingActivity.class));
                }
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        }, 4000);
    }


    private Boolean loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(PREF, MODE_PRIVATE);
        username = sharedPreferences.getString(s1, "");
        Boolean temp = sharedPreferences.getBoolean(s3, false);
        return temp;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String userName) {
        username = userName;
    }
}