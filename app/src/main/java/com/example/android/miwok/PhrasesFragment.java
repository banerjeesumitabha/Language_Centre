package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhrasesFragment extends Fragment {

    private String mLanguage;
    public PhrasesFragment(String language) {
        // Required empty public constructor
        mLanguage = language;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Hello/ThankYou/Goodbye","Hola/Gracias/Adiós","Bonjour/Merci/Au revoir"));
        words.add(new Word("Good Morning","Buenos días","Bonjour"));
        words.add(new Word("How are you?","¿Cómo estás?","Comment allez-vous?"));
        words.add(new Word("I am fine","Estoy bien","Je vais bien"));
        words.add(new Word("My name is..","Me llamo..","Mon nom est.."));
        words.add(new Word("Nice to meet you","Encantada de conocerte","Ravi de vous rencontrer"));
        words.add(new Word("What are you doing?","¿Qué estás haciendo?","Qu'est-ce que tu fais?"));
        words.add(new Word("Let's meet up","Vamos a reunirnos","Rencontrons-nous"));
        words.add(new Word("I am not feeling well","no me estoy sintiendo bien","je ne me sens pas bien"));
        words.add(new Word("Come to my home","Ven a mi hogar","Viens chez moi"));
        words.add(new Word("I need help","necesito ayuda","j'ai besoin d'aide"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_phrases, mLanguage);

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
