package com.andrezacampbell.adidevhighlanders.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.andrezacampbell.adidevhighlanders.R;
import com.andrezacampbell.adidevhighlanders.interfaces.RvPublicStoriesOnClick;
import com.andrezacampbell.adidevhighlanders.model.PublicStoriesModel;

import java.util.List;

public class RvPublicStoriesAdapter extends RecyclerView.Adapter<RvPublicStoriesAdapter.ViewHolder>{

    private RvPublicStoriesOnClick listener;
    private List<PublicStoriesModel> listStories;


    public RvPublicStoriesAdapter(RvPublicStoriesOnClick listener, List<PublicStoriesModel> listStories){
        this.listener = listener;
        this.listStories = listStories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int positon) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_rv_public_stories,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        
        final PublicStoriesModel publicStoriesModel = listStories.get(position);
        holder.onBind(publicStoriesModel);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(publicStoriesModel);
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
            image = itemView.findViewById(R.id.item_rv_imgV_id);
        }

        public void onBind(PublicStoriesModel publicStoriesModel) {
            Drawable drawable = itemView.getResources().getDrawable(publicStoriesModel.getPhoto());
            image.setImageDrawable(drawable);
        }
    }
}
