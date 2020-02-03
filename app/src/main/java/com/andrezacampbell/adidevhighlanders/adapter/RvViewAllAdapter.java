package com.andrezacampbell.adidevhighlanders.adapter;

import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.andrezacampbell.adidevhighlanders.R;
import com.andrezacampbell.adidevhighlanders.interfaces.RVViewAllOnClick;
import com.andrezacampbell.adidevhighlanders.model.ViewAllModel;

import java.util.List;

public class RvViewAllAdapter {


//    private RVViewAllOnClick listener;
//    private List<ViewAllModel> listStories;
//
//    public RvViewAllAdapter(RVViewAllOnClick listener, List<ViewAllModel> listStories) {
//        this.listener = listener;
//        this.listStories = listStories;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_rv_view_all, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        final ViewAllModel viewAllModel = listStories.get(position);
//        holder.onBind(viewAllModel);
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                listener.onClick((RVViewAllOnClick) viewAllModel);
//            }
//        });
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return listStories.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        private ImageView image;
//        private TextView title, description;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            image = itemView.findViewById(R.id.item_rv_viewAll_img_id);
//            title = itemView.findViewById(R.id.item_rv_viewAll_tv_title_id);
//            description = itemView.findViewById(R.id.item_rv_viewAll_tv_description_id);
//        }
//
//        public void onBind(ViewAllModel viewAllModel) {
//            Drawable drawable = itemView.getResources().getDrawable(viewAllModel.getPhoto());
//            image.setImageDrawable(drawable);
//            title.setText(viewAllModel.getTitle());
//            description.setText(viewAllModel.getDescription());
//        }
//    }
}

