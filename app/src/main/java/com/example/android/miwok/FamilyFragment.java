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
public class FamilyFragment extends Fragment {

    private String mLanguage;

    public FamilyFragment(String language) {
        // Required empty public constructor
        mLanguage = language;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "padre","père", R.drawable.family_father));
        words.add(new Word("mother", "madre","mère", R.drawable.family_mother));
        words.add(new Word("son", "hijo","fils", R.drawable.family_son));
        words.add(new Word("daughter", "hija","fille", R.drawable.family_daughter));
        words.add(new Word("older brother", "hermano mayor","grand frère", R.drawable.family_older_brother));
        words.add(new Word("younger brother", "hermano más joven","frère cadet", R.drawable.family_younger_brother));
        words.add(new Word("older sister", "hermana mayor","sœur aînée", R.drawable.family_older_sister));
        words.add(new Word("younger sister", "hermana menor","sœur cadette", R.drawable.family_younger_sister));
        words.add(new Word("grandmother", "abuela","grand-mère", R.drawable.family_grandmother));
        words.add(new Word("grandfather", "abuelo","grand-père", R.drawable.family_grandfather));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_family, mLanguage);

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
