package android.example.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<words> {

    private int colorResorceId;

    public WordAdapter (Activity context, ArrayList<words> words,int d){
        super(context,0,words);
        colorResorceId = d;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        words currentword = getItem(position);

        TextView miwoktextview = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwoktextview.setText(currentword.getmiwoktranslator());

        TextView defaulttextview = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaulttextview.setText(currentword.getdefaulttranslator());



        ImageView image = (ImageView) listItemView.findViewById(R.id.imageView);
        if (currentword.hasimage()){
        image.setImageResource(currentword.getImage());
        image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),colorResorceId);
        textContainer.setBackgroundColor(color);


        return listItemView;

    }
}
