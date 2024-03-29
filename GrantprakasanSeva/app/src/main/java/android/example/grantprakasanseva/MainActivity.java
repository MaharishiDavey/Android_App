package android.example.grantprakasanseva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<details> words = new ArrayList<details>();
        words.add(new details("one", 4045,R.drawable.ic_launcher_background,"9601293588"));
        words.add(new details("Two",5054,R.drawable.ic_launcher_foreground,"9601290000"));
        words.add(new details("mahae" , 7483 , R.drawable.ic_launcher_background, "3456376587"));
        words.add(new details("one", 4045,R.drawable.ic_launcher_background,"9601293588"));
        words.add(new details("Two",5054,R.drawable.ic_launcher_foreground,"9601290000"));
        words.add(new details("mahae" , 7483 , R.drawable.ic_launcher_background, "3456376587"));
        words.add(new details("one", 4045,R.drawable.ic_launcher_background,"9601293588"));
        words.add(new details("Two",5054,R.drawable.ic_launcher_foreground,"9601290000"));
        words.add(new details("mahae" , 7483 , R.drawable.ic_launcher_background, "3456376587"));




        detailadapter itemadapter = new detailadapter(this, words);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemadapter);
    }

    public void opentext(){
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
}