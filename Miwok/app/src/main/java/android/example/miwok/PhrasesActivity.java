package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<words> words = new ArrayList<words>();
        words.add(new words("Where are you going?", "minto wuksus"));
        words.add(new words("What is your name?","tinnә oyaase'nә"));
        words.add(new words(" My name is...","oyaaset..."));
        words.add(new words("How are you feeling?","michәksәs?"));
        words.add(new words("I’m feeling good."," kuchi achit"));
        words.add(new words("Are you coming? ","әәnәs'aa?"));
        words.add(new words(" Yes, I’m coming.","hәә’ әәnәm\n"));
        words.add(new words(" I’m coming. ","әәnәm"));
        words.add(new words("Let’s go. ","yoowutis"));
        words.add(new words(" Come here.","әnni'nem"));

        WordAdapter itemadapter = new WordAdapter   (this, words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemadapter);    }
}