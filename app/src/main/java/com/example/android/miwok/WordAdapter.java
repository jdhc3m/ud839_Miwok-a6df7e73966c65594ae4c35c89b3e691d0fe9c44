package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jd158 on 22/08/2016.
 */


public class WordAdapter extends ArrayAdapter<Word>   {
    public int mColorResourceId;
    //We initialize the ArrayAdapter's internal storage for the context and the list.
    public WordAdapter(Activity context, ArrayList<Word> androidWords, int colorResourceId) {
        super(context, 0, androidWords);
        mColorResourceId = colorResourceId;

    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentAndroidWord = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the version name from the current AndroidFlavor object and

        if(currentAndroidWord.hasImage()) {
            // set this text on the name TextView
            imageView.setImageResource(currentAndroidWord.getImageResourceId());
            //Make sute that the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            //Otherwise hide the Image and the space that it supposed get
            imageView.setVisibility(View.GONE);
        }
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        defaultTextView.setText(currentAndroidWord.getDefaultTraslation());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokaTextView = (TextView) listItemView.findViewById(R.id.miwok_text_vire);
        // Get the version name from the current AndroidFlavor object and

        // set this text on the name TextView
        miwokaTextView.setText(currentAndroidWord.getMiwokTranslation());


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.words_list);
        // Find the color that the resource ID maps to
       int color = ContextCompat.getColor(getContext(), mColorResourceId);
       // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;




        //return super.getView(position, convertView, parent);
    }
}
