package com.andrezacampbell.adidevhighlanders.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.andrezacampbell.adidevhighlanders.R;
import com.andrezacampbell.adidevhighlanders.model.PublicStoriesModel;

import static com.andrezacampbell.adidevhighlanders.R.drawable.alexa;
import static com.andrezacampbell.adidevhighlanders.view.activity.MainActivity.POPSTORIES;

public class PopInterestsGridActivity extends AppCompatActivity {
    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_interests_grid_expand);
        initViews();

        if (getIntent() !=null && getIntent().getExtras() !=null){
            PublicStoriesModel publicStoriesModel = getIntent().getExtras().getParcelable(POPSTORIES);

            Drawable drawable = getResources().getDrawable(publicStoriesModel.getPhoto());
            imageView.setImageDrawable(drawable);
        }

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLoginActivity();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLoginActivity();
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLoginActivity();
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLoginActivity();
            }
        });
    }

    private void initViews() {
        t1 = findViewById(R.id.actvt_popInt_grid_exp_tv_follow_id);
        t2 = findViewById(R.id.actvt_popInt_grid_exp_tv_dairy_id);
        t3 = findViewById(R.id.actvt_popInt_grid_exp_tv_followers_id);
        t4 = findViewById(R.id.actvt_popInt_grid_exp_tv_similar_id);
        imageView = findViewById(R.id.actvt_popInt_grid_exp_image_view_id);
    }

    public void goToLoginActivity(){
        Intent intent = new Intent(PopInterestsGridActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
