package com.example.android.music_app;

import android.content.Context;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class AladdinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        //Create an array of tracklists
        final ArrayList<Tracklist> tracklists = new ArrayList<Tracklist>();

        //tracklists.add("one");
        tracklists.add(new Tracklist("1. Watch that man"));
        tracklists.add(new Tracklist("String.2. Aladdin Sane"));
        tracklists.add(new Tracklist("3. Drive in saturday"));
        tracklists.add(new Tracklist("4. Panic in Detroit"));
        tracklists.add(new Tracklist("5. Cracked actor"));
        tracklists.add(new Tracklist("6. Time"));
        tracklists.add(new Tracklist("7. The prettiest star"));
        tracklists.add(new Tracklist("8. Let's spend the night together"));
        tracklists.add(new Tracklist("9. The Jean Genie"));
        tracklists.add(new Tracklist("10. Lady Grinning soul"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        TracklistAdapter adapter = new TracklistAdapter(this, tracklists, R.color.album_aladdin);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of tracklists.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Tracklist tracklist = tracklists.get(position);
            }

        });

    }
}


