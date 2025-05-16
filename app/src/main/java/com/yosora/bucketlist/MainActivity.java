package com.yosora.bucketlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView thingsToDoCard;
    CardView placesToGoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();

    }

    private void setupClickListeners() {
        thingsToDoCard = findViewById(R.id.card_view_things_to_do);
        placesToGoCard = findViewById(R.id.card_view_places_to_go);

        thingsToDoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent thingsToDoIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);
                startActivity(thingsToDoIntent);

            }
        });

        placesToGoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent placesToGoIntent = new Intent(MainActivity.this, PlacesToGoActivity.class);
                startActivity(placesToGoIntent);

            }
        });
    }
}