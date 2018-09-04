package com.example.android.music_app;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class TracklistAdapter extends ArrayAdapter<Tracklist> {

    /**Resource ID for the background color for this list of songs*/
    private int mColorResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param tracklists A List of AndroidFlavor objects to display in a list
     * @param colorResourceId is the resource ID for the background color for this list of tracklists
     */
    public TracklistAdapter(Context context, ArrayList<Tracklist> tracklists, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, tracklists);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Tracklist currentTracklist = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songsTextView = (TextView) listItemView.findViewById(R.id.songs_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songsTextView.setText(currentTracklist.getSongs());


        //find the ImageView in the list_item.xml layout with the ID version_name
        ImageView imageView =(ImageView) listItemView.findViewById(R.id.image);


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
       // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
