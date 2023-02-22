package com.example.roommanegment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton add,more,admin,record;
    TextView txmore,txrec;
    int vis = 1;
    List<Customer> customerList = new ArrayList<Customer>();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);

        return true;

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.logoutbtn:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),Login.class));
                return true;

            case R.id.dis_user:

            default:
               return true;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        recyclerView = findViewById(R.id.customerList);

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new ListAdapter(customerList,this);
        recyclerView.setAdapter(mAdapter);

        fillCustomerList();

        add = findViewById(R.id.add);
        more = findViewById(R.id.more);
        record = findViewById(R.id.record);
        txmore = findViewById(R.id.txadd);
        txrec = findViewById(R.id.txrec);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vis++;
                if (vis%2==0){
                    add.setVisibility(View.VISIBLE);
                    record.setVisibility(View.VISIBLE);
                    txmore.setVisibility(View.VISIBLE);
                    txrec.setVisibility(View.VISIBLE);
                }
                else {
                    add.setVisibility(View.GONE);
                    record.setVisibility(View.GONE);
                    txmore.setVisibility(View.GONE);
                    txrec.setVisibility(View.GONE);
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {    
                Intent i = new Intent(MainActivity.this,AddActivity.class);
                startActivity(i);
            }
        });

        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,RecordActivity.class);
                startActivity(i);
            }
        });



    }

    private void fillCustomerList() {
        Customer c = new Customer("Maharishi Davey",4045 , 4, 9601293588L , true , true, true);
        customerList.add(c);
        Customer c1 = new Customer("Jay Davey",12422 , 2 , 9952674858L, true , true, true);
        customerList.add(c1);
        Customer c2 = new Customer("Bhavna Davey",4214 , 1 ,9884610588L, true , true, true);
        customerList.add(c2);
        Customer c3 = new Customer("Ganshyam Davey",2452 , 5 , 9587454568L , true , true, true);
        customerList.add(c3);
    }
}