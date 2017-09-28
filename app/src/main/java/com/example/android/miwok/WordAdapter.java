package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SUMITABHA on 23-05-2017.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    private String mLanguage;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId, String language) {

        super(context, 0, words);
        mColorResourceId = colorResourceId;
        mLanguage = language;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView transTextView = (TextView) listItemView.findViewById(R.id.trans_text_view);

        if (mLanguage.equals("spanish")) {
            transTextView.setText(currentWord.getSpanishTranslation());
        }
        else {
            transTextView.setText(currentWord.getFrenchTranslation());
        }

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.getImageResourceId() > 0) {
            iconView.setImageResource(currentWord.getImageResourceId());
        } else

        {
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
