package com.yosora.bucketlist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);

        RecyclerView list = findViewById(R.id.recycler_view_bucket_list);

        BucketList[] places = {
                new BucketList("Azores, Portugal", "Archipelago in the Atlantic Ocean", R.drawable.azores),
                new BucketList("Dolomites, Italy", "Mountain range in the Alps", R.drawable.dolomites),
                new BucketList("Krka National Park, Croatia", "Croatian national park. Named after the river Krka", R.drawable.krka),
                new BucketList("This is the title", "This is the description", R.drawable.placestogo),
                new BucketList("This is the title", "This is the description", R.drawable.placestogo),
                new BucketList("This is the title", "This is the description", R.drawable.placestogo),
                new BucketList("This is the title", "This is the description", R.drawable.placestogo),
                new BucketList("This is the title", "This is the description", R.drawable.placestogo)
        };

        BucketListAdapter adapter = new BucketListAdapter(places);

        list.setAdapter(adapter);
    }
}