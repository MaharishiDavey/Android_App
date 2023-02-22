package com.example.notificationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button gen_notify,gen_notify2;
    Context MA = MainActivity.this;
    EditText time;
//    String a = "Jay Swaminarayan";
    int start = 0;
    int j=0;
    String []a = {"Jay Swaminarayan","Hari","Guruji"};
    Thread t1 = new Thread();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gen_notify = findViewById(R.id.gen_noti);
        time = findViewById(R.id.edi_time);
        gen_notify2 = findViewById(R.id.gen_noti2);




            gen_notify.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    gen_notify2.setVisibility(View.VISIBLE);
//                    gen_notify.setVisibility(View.GONE);

                    start=0;
                    Toast.makeText(MA, "Start", Toast.LENGTH_SHORT).show();
//                    if(start % 2 !=0){
//                        start++;
//                        gen_notify.setText("Stop");
//                    }
//                    else {
//                        start++;
//                        gen_notify.setText("Start");
//                    }
                        while ( start != 1 ){
                            try {
                                String x = a[j];
                                notification(x);
                                t1.sleep(1000L * Integer.parseInt(time.getText().toString()));
                                j++;
                                if(j == 3){
                                    j=0;
                                }
                            }
                            catch(InterruptedException ie){

                            }
    //                        notification();
                        }
                }
            });

            gen_notify2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    gen_notify.setVisibility(View.VISIBLE);
//                    gen_notify2.setVisibility(View.GONE);
                    start = 1;
                    t1.dumpStack();
                    Toast.makeText(MA, "stop", Toast.LENGTH_SHORT).show();


                }
            });


        }
        private void notification(String title) {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel("My Notification", "Hello", NotificationManager.IMPORTANCE_DEFAULT);
                NotificationManager notificationManager = getSystemService(NotificationManager.class);
                notificationManager.createNotificationChannel(channel);
            }


            //Notification Builder
            NotificationCompat.Builder builder = new NotificationCompat.Builder(MA , "My Notification");
            builder.setContentTitle(title);
//            builder.setContentText("Much longer text that cannot fit one line...");
//                builder.setStyle(new NotificationCompat.BigTextStyle()
//                        .bigText("Much longer text that cannot fit one line..."));
//                    builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
            builder.setSmallIcon(R.drawable.ic_launcher_background);
            builder.setAutoCancel(true);

            Toast.makeText(MA, time.getText().toString() + " " + start , Toast.LENGTH_SHORT).show();

            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(MA);
            managerCompat.notify(1,builder.build());


        }


}
