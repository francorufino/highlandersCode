package com.andrezacampbell.adidevhighlanders.view.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.andrezacampbell.adidevhighlanders.R;
import com.andrezacampbell.adidevhighlanders.model.PublicStoriesModel;
import com.andrezacampbell.adidevhighlanders.model.StoriesIFollowModel;

import static com.andrezacampbell.adidevhighlanders.view.activity.MainActivity.POPSTORIES;
import static com.andrezacampbell.adidevhighlanders.view.activity.MainActivity.STORIESIFOLLOW;

public class DetailStoriesIFollow extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_stories_ifolllow);
        initViews();

        if (getIntent() != null && getIntent().getExtras() != null) {
            StoriesIFollowModel storiesIFollowModel = getIntent().getExtras().getParcelable(STORIESIFOLLOW);

            Drawable drawable = getResources().getDrawable(storiesIFollowModel.getPhoto());
            imageView.setImageDrawable(drawable);
        }
    }

    private void initViews() {
        imageView = findViewById(R.id.detail_stories_ifollow_image_id);
    }
}
