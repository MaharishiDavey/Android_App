package com.example.roommanegment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

    public class AddActivity extends AppCompatActivity {

    Button allocate,add_room,del,cancel;
    DatabaseReference bkt_details;
    EditText bkt_name,bkt_smk,no_bkt;
    FirebaseFirestore fstore;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        fAuth = FirebaseAuth.getInstance();

        allocate = findViewById(R.id.Allocate);
        add_room = findViewById(R.id.Add_room);
        del = findViewById(R.id.delete);
        cancel =findViewById(R.id.cancel);
        fstore = FirebaseFirestore.getInstance();


//        bkt_details = FirebaseDatabase.getInstance().getReference("Vadodra_mandir");



        allocate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insertbktdata();

                Intent i = new Intent(AddActivity.this,MainActivity.class);
                startActivity(i);

                Toast.makeText(AddActivity.this, "Allocate", Toast.LENGTH_SHORT).show();

            }
        });

        add_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddActivity.this, "Add a room", Toast.LENGTH_SHORT).show();
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddActivity.this,MainActivity.class);
                startActivity(i);
                Toast.makeText(AddActivity.this, "Delete", Toast.LENGTH_SHORT).show();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddActivity.this,MainActivity.class);
                startActivity(i);
                Toast.makeText(AddActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void insertbktdata() {

        FirebaseUser user = fAuth.getCurrentUser();
        DocumentReference df = fstore.collection("Data").document(user.getUid());

        String name = bkt_name.getText().toString();
        String smk = bkt_smk.getText().toString();
        String num_member = no_bkt.getText().toString();

//        Customer customer = new Customer(name, smk, num_member);
        Map<String, Object> userinfo = new HashMap<>();
        userinfo.put("FullName", name);
        userinfo.put("UserEmail", smk);
        userinfo.put("PhoneNumber", num_member);

        df.set(userinfo);

    }


}