package com.andrezacampbell.adidevhighlanders.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.andrezacampbell.adidevhighlanders.R;
import com.andrezacampbell.adidevhighlanders.model.PublicStoriesModel;

import static com.andrezacampbell.adidevhighlanders.view.activity.MainActivity.POPSTORIES;

public class DetailPopStories extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pop_stories);
        initViews();

        if (getIntent() !=null && getIntent().getExtras() !=null){
            PublicStoriesModel publicStoriesModel = getIntent().getExtras().getParcelable(POPSTORIES);

            Drawable drawable = getResources().getDrawable(publicStoriesModel.getPhoto());
            imageView.setImageDrawable(drawable);
        }
    }

    private void initViews() {
        imageView = findViewById(R.id.detail_pop_stories_image_id);
    }
}
