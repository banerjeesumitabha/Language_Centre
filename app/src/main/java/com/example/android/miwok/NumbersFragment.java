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
public class NumbersFragment extends Fragment {

    private String mLanguage;

    public NumbersFragment(String language) {
        // Required empty public constructor
        mLanguage = language;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "uno","un", R.drawable.number_one));
        words.add(new Word("two", "dos","deux", R.drawable.number_two));
        words.add(new Word("three", "tres","trois", R.drawable.number_three));
        words.add(new Word("four", "las cuatro","quatre", R.drawable.number_four));
        words.add(new Word("five", "cinco","cinq", R.drawable.number_five));
        words.add(new Word("six", "seis","six", R.drawable.number_six));
        words.add(new Word("seven", "siete","sept", R.drawable.number_seven));
        words.add(new Word("eight", "ocho","huit", R.drawable.number_eight));
        words.add(new Word("nine", "nueve","neuf", R.drawable.number_nine));
        words.add(new Word("ten", "diez","dix", R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_numbers,mLanguage);

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
