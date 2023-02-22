package com.example.sevaapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView BhaktoRV;
    ArrayList<SevaModel> sevaModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BhaktoRV=findViewById(R.id.idRVBhakto);

        sevaModelArrayList=new ArrayList<>();
        sevaModelArrayList.add(new SevaModel("Rushi Sanjaybhai Patel", 3239, R.mipmap.bkt_photo, "9714174550"));
        sevaModelArrayList.add(new SevaModel("Bhavik Kantibhai Gohel", 5114, R.mipmap.bkt_photo, "9714174550"));
        sevaModelArrayList.add(new SevaModel("Rushi Sanjaybhai Patel", 3239, R.mipmap.bkt_photo, "9714174550"));
        sevaModelArrayList.add(new SevaModel("Bhavik Kantibhai Gohel", 5114, R.mipmap.bkt_photo, "9714174550"));
        sevaModelArrayList.add(new SevaModel("Rushi Sanjaybhai Patel", 3239, R.mipmap.bkt_photo, "9714174550"));
        sevaModelArrayList.add(new SevaModel("Bhavik Kantibhai Gohel", 5114, R.mipmap.bkt_photo, "9714174550"));
        sevaModelArrayList.add(new SevaModel("Rushi Sanjaybhai Patel", 3239, R.mipmap.bkt_photo, "9714174550"));
        sevaModelArrayList.add(new SevaModel("Bhavik Kantibhai Gohel", 5114, R.mipmap.bkt_photo, "9714174550"));
        /*sevaModelArrayList.add(new SevaModel("C++ COurse", 4, R.drawable.gfgimage));
        sevaModelArrayList.add(new SevaModel("DSA in C++", 4, R.drawable.gfgimage));
        sevaModelArrayList.add(new SevaModel("Kotlin for Android", 4, R.drawable.gfgimage));
        sevaModelArrayList.add(new SevaModel("Java for Android", 4, R.drawable.gfgimage));
        sevaModelArrayList.add(new SevaModel("HTML and CSS", 4, R.drawable.gfgimage));*/

        // we are initializing our adapter class and passing our arraylist to it.
        SevaAdapter sevaAdapter = new SevaAdapter(this, sevaModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        BhaktoRV.setLayoutManager(linearLayoutManager);
        BhaktoRV.setAdapter(sevaAdapter);
    }
}