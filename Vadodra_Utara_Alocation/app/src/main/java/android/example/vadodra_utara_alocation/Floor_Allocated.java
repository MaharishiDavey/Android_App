package android.example.vadodra_utara_alocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Floor_Allocated extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_allocated);

        Spinner floor = (Spinner) findViewById(R.id.floor_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Floor, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        floor.setAdapter(adapter);

        ArrayList<Rooms> rooms = new ArrayList<Rooms>();
        rooms.add(new Rooms("Room 101","10","4"));
        rooms.add(new Rooms("Room 102","12","6"));
        rooms.add(new Rooms("Room 103","6","2"));
        rooms.add(new Rooms("Room 104","4","4"));



        RoomAdapter adapter1 = new RoomAdapter(this , rooms);

        ListView listView = (ListView) findViewById(R.id.floor_list);

        listView.setAdapter(adapter1);


    }
}