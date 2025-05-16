package com.yosora.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.BucketListViewHolder> {

    private BucketList[] BucketListItems;

    public BucketListAdapter(BucketList[] bucketListItems) {
        BucketListItems = bucketListItems;
    }

    @Override
    public int getItemCount() {
        return BucketListItems.length;
    }

    @NonNull
    @Override
    public BucketListAdapter.BucketListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket_list, parent, false);
        return new BucketListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListAdapter.BucketListViewHolder holder, int position) {
        holder.bind(BucketListItems[position]);
    }

    static class BucketListViewHolder extends RecyclerView.ViewHolder {

        private ImageView itemImage;
        private TextView itemTitle;
        private TextView itemDescription;

        public BucketListViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.image_view_bucket_list_image);
            itemTitle = itemView.findViewById(R.id.text_view_bucket_list_title);
            itemDescription = itemView.findViewById(R.id.text_view_bucket_list_description);
        }

        public void bind(BucketList bucketlist) {
            itemTitle.setText(bucketlist.title);
            itemDescription.setText(bucketlist.description);
            itemImage.setImageResource(bucketlist.image);
        }
    }

}
