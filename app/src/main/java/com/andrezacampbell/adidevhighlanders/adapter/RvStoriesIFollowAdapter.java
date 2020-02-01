package com.andrezacampbell.adidevhighlanders.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.andrezacampbell.adidevhighlanders.R;
import com.andrezacampbell.adidevhighlanders.interfaces.RvStoriesIFollowOnClick;
import com.andrezacampbell.adidevhighlanders.model.StoriesIFollowModel;


import java.util.List;

public class RvStoriesIFollowAdapter extends RecyclerView.Adapter<RvStoriesIFollowAdapter.ViewHolder>{

    private RvStoriesIFollowOnClick listener;
    private List<StoriesIFollowModel> listStories;


    public RvStoriesIFollowAdapter(RvStoriesIFollowOnClick listener, List<StoriesIFollowModel> listStories){
        this.listener = listener;
        this.listStories = listStories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int positon) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_rv_stories_ifollow,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        
        final StoriesIFollowModel storiesIFollowModel = listStories.get(position);
        holder.onBind(storiesIFollowModel);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(storiesIFollowModel);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listStories.size();
    }
    
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.item_rv_imgV_ifollow_id);
        }

        public void onBind(StoriesIFollowModel storiesIFollowModel) {
            Drawable drawable = itemView.getResources().getDrawable(storiesIFollowModel.getPhoto());
            image.setImageDrawable(drawable);
        }
    }
}
