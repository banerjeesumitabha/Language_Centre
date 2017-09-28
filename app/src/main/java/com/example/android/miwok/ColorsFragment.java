package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorsFragment extends Fragment {

    private String mLanguage;
    public ColorsFragment(String language) {
        // Required empty public constructor
        mLanguage = language;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "rojo","rogue", R.drawable.color_red));
        words.add(new Word("mustard yellow", "amarillo mostaza","jaune moutarde", R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "amarillo polvoriento","jaune poussiéreux", R.drawable.color_dusty_yellow));
        words.add(new Word("green", "verde","vert", R.drawable.color_green));
        words.add(new Word("brown", "marrón","marron", R.drawable.color_brown));
        words.add(new Word("gray", "gris","gris", R.drawable.color_gray));
        words.add(new Word("black", "negro","noir", R.drawable.color_black));
        words.add(new Word("white", "blanco","blanc", R.drawable.color_white));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_colors,mLanguage);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }


}
