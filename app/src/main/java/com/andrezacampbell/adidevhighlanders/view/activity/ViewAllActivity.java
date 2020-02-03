package com.andrezacampbell.adidevhighlanders.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.andrezacampbell.adidevhighlanders.R;
import com.andrezacampbell.adidevhighlanders.adapter.RvViewAllAdapter;
import com.andrezacampbell.adidevhighlanders.interfaces.RVViewAllOnClick;
import com.andrezacampbell.adidevhighlanders.model.ViewAllModel;

import java.util.ArrayList;
import java.util.List;

public class ViewAllActivity extends AppCompatActivity implements RVViewAllOnClick {
//    @Override
    public void onClick(RVViewAllOnClick rvViewAllOnClick) {

    }
//    public static final String TITTLEKEY = "title_key";
//    public static final String DESCRIPKEY = "description_key";
//    private RecyclerView recyclerView;
//    private RvViewAllAdapter adapter;
//    private List<ViewAllModel> listStories = new ArrayList<>();


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_view_all);
//
//        recyclerView = findViewById(R.id.view_all_rv_actvt_id);
//        adapter = new RvViewAllAdapter(this, returnListStories());
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//    }

//    private List<ViewAllModel> returnListStories() {
//        listStories.add(new ViewAllModel("Alexa", R.drawable.alexa));
//        listStories.add(new ViewAllModel("Android", R.drawable.android));
//        listStories.add(new ViewAllModel("Skype", R.drawable.skype));
//        listStories.add(new ViewAllModel("Facebook", R.drawable.fb));
//        listStories.add(new ViewAllModel("Starbuck", R.drawable.starbucks));
//        listStories.add(new ViewAllModel("Intagram", R.drawable.insta));
//        listStories.add(new ViewAllModel("Google", R.drawable.google));
//        listStories.add(new ViewAllModel("WhatsApp", R.drawable.whats));
//
//        return listStories;
//    }

//    public void onClick(ViewAllModel viewAllModel) {
//        Intent intent = new Intent(ViewAllActivity.this, PopInterestsGridActivity.class);
//        Bundle bundle = new Bundle();
//        bundle.putParcelable(TITTLEKEY, );
//        intent.putExtras(bundle);
//        startActivity(intent);
//    }

}