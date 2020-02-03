package com.andrezacampbell.adidevhighlanders.view.activity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import com.andrezacampbell.adidevhighlanders.R;
import com.andrezacampbell.adidevhighlanders.adapter.RvPublicStoriesAdapter;
import com.andrezacampbell.adidevhighlanders.adapter.RvStoriesIFollowAdapter;
import com.andrezacampbell.adidevhighlanders.interfaces.RvPublicStoriesOnClick;
import com.andrezacampbell.adidevhighlanders.interfaces.RvStoriesIFollowOnClick;
import com.andrezacampbell.adidevhighlanders.model.PublicStoriesModel;
import com.andrezacampbell.adidevhighlanders.model.StoriesIFollowModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RvPublicStoriesOnClick, RvStoriesIFollowOnClick {
    private SearchView searchView;
    public static final String POPSTORIES = "popstories";
    public static final String STORIESIFOLLOW = "storiesifollow";
    private RecyclerView recyclerViewPopStories;
    private RecyclerView recyclerViewStoriesIFollow;
    private RvPublicStoriesAdapter popStoriesAdapter;
    private RvStoriesIFollowAdapter storiesIFollowAdapter;
    private List<PublicStoriesModel> listPopStories = new ArrayList<>();
    private List<StoriesIFollowModel> listStoriesIFollow = new ArrayList<>();
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        initViews();
        ConfigButtomNavMenu();
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
            }
        });

        popStoriesAdapter = new RvPublicStoriesAdapter(this, returnListPopStories());
        storiesIFollowAdapter = new RvStoriesIFollowAdapter(this, returnListStoriesIFollow());
        recyclerViewPopStories.setAdapter(popStoriesAdapter);
        recyclerViewStoriesIFollow.setAdapter(storiesIFollowAdapter);
        recyclerViewPopStories.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewStoriesIFollow.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPopIntExp();
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPopIntExp();
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPopIntExp();
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPopIntExp();
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPopIntExp();
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPopIntExp();
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPopIntExp();
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPopIntExp();
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPopIntExp();
            }
        });
    }

    private List<PublicStoriesModel> returnListPopStories() {
        listPopStories.add(new PublicStoriesModel(R.drawable.pp1));
        listPopStories.add(new PublicStoriesModel(R.drawable.pp2));
        listPopStories.add(new PublicStoriesModel(R.drawable.pp4));
        listPopStories.add(new PublicStoriesModel(R.drawable.pp5));
        listPopStories.add(new PublicStoriesModel(R.drawable.pp3));
        listPopStories.add(new PublicStoriesModel(R.drawable.pp6));
        listPopStories.add(new PublicStoriesModel(R.drawable.pp7));
        listPopStories.add(new PublicStoriesModel(R.drawable.pp8));
        listPopStories.add(new PublicStoriesModel(R.drawable.pp9));
        listPopStories.add(new PublicStoriesModel(R.drawable.pp11));

        return listPopStories;
    }

    private List<StoriesIFollowModel> returnListStoriesIFollow() {
        listStoriesIFollow.add(new StoriesIFollowModel(R.drawable.p1));
        listStoriesIFollow.add(new StoriesIFollowModel(R.drawable.p2));
        listStoriesIFollow.add(new StoriesIFollowModel(R.drawable.p4));
        listStoriesIFollow.add(new StoriesIFollowModel(R.drawable.p5));
        listStoriesIFollow.add(new StoriesIFollowModel(R.drawable.p3));
        listStoriesIFollow.add(new StoriesIFollowModel(R.drawable.p6));
        listStoriesIFollow.add(new StoriesIFollowModel(R.drawable.p7));
        listStoriesIFollow.add(new StoriesIFollowModel(R.drawable.p8));
        listStoriesIFollow.add(new StoriesIFollowModel(R.drawable.p9));

        return listStoriesIFollow;
    }

    @Override
    public void onClick(PublicStoriesModel publicStoriesModel) {
        Intent intent = new Intent(MainActivity.this, DetailPopStories.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(POPSTORIES, publicStoriesModel);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void onClick(StoriesIFollowModel storiesIFollowModel){
        Intent intent = new Intent(MainActivity.this, DetailStoriesIFollow.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(STORIESIFOLLOW, storiesIFollowModel);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void initViews() {
        searchView = findViewById(R.id.actvtyLogin_searchView_id);
        recyclerViewPopStories = findViewById(R.id.main_rv_public_stories_id);
        recyclerViewStoriesIFollow = findViewById(R.id.main_rv_stories_ifollow_id);
        img1 = findViewById(R.id.main_popInt_grid_img_cv1_id);
        img2 = findViewById(R.id.main_popInt_grid_img_c2_id);
        img3 = findViewById(R.id.main_popInt_grid_img_c3_id);
        img4 = findViewById(R.id.main_popInt_grid_img_c4_id);
        img5 = findViewById(R.id.main_popInt_grid_img_c5_id);
        img6 = findViewById(R.id.main_popInt_grid_img_c6_id);
        img7 = findViewById(R.id.main_popInt_grid_img_c7_id);
        img8 = findViewById(R.id.main_popInt_grid_img_c8_id);
        img9 = findViewById(R.id.main_popInt_grid_img_c9_id);
    }

    private void setActivity(LoginActivity loginActivity) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    private void goToPopIntExp(){
        Intent intent = new Intent(MainActivity.this, PopInterestsGridActivity.class);
        startActivity(intent);
    }

    private void ConfigButtomNavMenu() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu_nav_chat_id:{
                        Log.d("teste", "chat");
                        setActivity(new LoginActivity());
                        break;
                    }
                    case R.id.menu_nav_circle_id:{
                        Log.d("teste", "circle");
                        setActivity(new LoginActivity());
                        break;
                    }
                    case R.id.menu_nav_home_id:{
                        Log.d("teste", "home");
                        setActivity(new LoginActivity());
                        break;
                    }
                    case R.id.menu_nav_profile_id:{
                        Log.d("teste", "profile");
                        setActivity(new LoginActivity());
                        break;
                    }
                    case R.id.menu_nav_search_id:{
                        Log.d("teste", "search");
                        setActivity(new LoginActivity());
                        break;
                    }
                }
                return true;
            }
        });
    }
}
