package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<words> words = new ArrayList<words>();
        words.add(new words("one", "Lutti",R.drawable.number_one));
        words.add(new words("Two","Otiiko",R.drawable.number_two));
        words.add(new words("Three","Tolookosu",R.drawable.number_three));
        words.add(new words("Four","oyyis",R.drawable.number_four));
        words.add(new words("Five","massokka",R.drawable.number_five));
        words.add(new words("Six","Temmokka",R.drawable.number_six));
        words.add(new words("Seven","Kenekaku",R.drawable.number_seven));
        words.add(new words("Eight","Kawinta",R.drawable.number_eight));
        words.add(new words("Nine","wo’e",R.drawable.number_nine));
        words.add(new words("Ten","na’aacha",R.drawable.number_ten));

        WordAdapter itemadapter = new WordAdapter   (this, words , R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemadapter);
    }

}

