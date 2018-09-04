
package com.example.android.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the album aladdin
        TextView aladdin = (TextView) findViewById(R.id.aladdin);



        // Set a click listener on that View
        aladdin.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the album aladdin sane is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AladdinActivity}
                Intent aladdinIntent = new Intent(MainActivity.this, AladdinActivity.class);

                // Start the new activity
                startActivity(aladdinIntent);
            }
        });

        // Find the View that shows the album blackstar
        TextView black = (TextView) findViewById(R.id.black);

        // Set a click listener on that View
        black.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the album blackstar is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BlackActivity}
                Intent blackIntent = new Intent(MainActivity.this, BlackActivity.class);

                // Start the new activity
                startActivity(blackIntent);
            }
        });

        // Find the View that shows the album david bowie
        TextView david = (TextView) findViewById(R.id.david);

        // Set a click listener on that View
        david.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the album david bowie is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DavidActivity}
                Intent davidIntent = new Intent(MainActivity.this, DavidActivity.class);

                // Start the new activity
                startActivity(davidIntent);
            }
        });

        // Find the View that shows the album diamond dogs
        TextView diamond = (TextView) findViewById(R.id.diamond);

        // Set a click listener on that View
        diamond.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the album diamond dogs is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DiamondActivity}
                Intent diamondIntent = new Intent(MainActivity.this, DiamondActivity.class);

                // Start the new activity
                startActivity(diamondIntent);
            }
        });

        // Find the View that shows the album heroes
        TextView heroes = (TextView) findViewById(R.id.heroes);

        // Set a click listener on that View
        heroes.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the album heroes is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HeoresActivity}
                Intent heroesIntent = new Intent(MainActivity.this, HeroesActivity.class);

                // Start the new activity
                startActivity(heroesIntent);
            }
        });
    }
}