package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<words> words = new ArrayList<words>();
        words.add(new words("red", "weṭeṭṭi",R.drawable.color_red));
        words.add(new words("green","chokokki",R.drawable.color_green));
        words.add(new words("brown","ṭakaakki",R.drawable.color_brown));
        words.add(new words("gray","ṭopoppi",R.drawable.color_gray));
        words.add(new words("black","kululli",R.drawable.color_black));
        words.add(new words("white","kelelli",R.drawable.color_white));
        words.add(new words("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new words("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        WordAdapter itemadapter = new WordAdapter   (this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemadapter);
    }
}