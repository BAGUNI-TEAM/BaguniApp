package com.eatx.baguni.Splash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;

import com.eatx.baguni.R;
import com.eatx.baguni.ui.login.LoginActivity;

import org.w3c.dom.Text;

public class SplashScreen extends AppCompatActivity {
    Animation anim;
    Animation textanim;
    LinearLayout linearLayout;
    ImageView ImageView;
    TextView TextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // 화면 가로 고정
        setContentView(R.layout.activity_splash);
        ImageView=(ImageView)findViewById(R.id.imageview); // Declare an imageView to show the animation.
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in); // Create the animation.
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        ImageView.startAnimation(anim);

    }
    @Override
    public void onBackPressed() {
        /* 뒤로가기. */
    }
    @UiThread
    private void splashanimation()
    {

    }

}
