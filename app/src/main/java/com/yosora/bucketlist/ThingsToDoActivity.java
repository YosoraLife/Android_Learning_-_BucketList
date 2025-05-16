package com.yosora.bucketlist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        RecyclerView list = findViewById(R.id.recycler_view_bucket_list);

        BucketList[] things = {
                new BucketList("Drive the Pan-American Highway", "The Pan-American Highway is a vast network of roads that stretches about 30,000 kilometers from Prudhoe Bay, Alaska, in the northernmost part of North America to Ushuaia, Argentina, at the southern tip of South America.", R.drawable.panamerica),
                new BucketList("Move to Portugal", "Buy a property and move to Portugal to live a life that is slower of pace and more meaningful.", R.drawable.portugal),
                new BucketList("Build my own house", "Build a house by myself. Either a shipping container based house or the restoration of a ruin.", R.drawable.shippingcontainer),
                new BucketList("Learn to dance", "Learn to dance the salsa together with my partner.", R.drawable.salsa),
                new BucketList("Learn to hang glide", "Lose weight so that ill be able to learn to hang glide.", R.drawable.thingstodo),
                new BucketList("This is the title", "This is the description", R.drawable.thingstodo),
                new BucketList("This is the title", "This is the description", R.drawable.thingstodo),
                new BucketList("This is the title", "This is the description", R.drawable.thingstodo)
        };

        BucketListAdapter adapter = new BucketListAdapter(things);

        list.setAdapter(adapter);
    }
}