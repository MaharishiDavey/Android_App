package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<words> words = new ArrayList<words>();
        words.add(new words("father", "әpә",R.drawable.family_father));
        words.add(new words("mother","әṭa",R.drawable.family_mother));
        words.add(new words("son","angsi",R.drawable.family_son));
        words.add(new words("daughter","tune",R.drawable.family_daughter));
        words.add(new words("older brother","taachi",R.drawable.family_older_brother));
        words.add(new words(" younger brother","chalitti",R.drawable.family_younger_brother));
        words.add(new words("older sister","teṭe",R.drawable.family_older_sister));
        words.add(new words(" younger sister","kolliti",R.drawable.family_younger_sister));
        words.add(new words("grandmother","ama",R.drawable.family_grandmother));
        words.add(new words("grandfather","npaapa",R.drawable.family_grandfather));

        WordAdapter itemadapter = new WordAdapter   (this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemadapter);
    }
}