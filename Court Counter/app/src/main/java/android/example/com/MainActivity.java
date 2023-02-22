package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counting=0;
    int bcounting=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void display(int x) {
        TextView c = findViewById(R.id.count);
        c.setText(""+x);
    }

    public void three(View view)
    {
        counting+=3;
        display(counting);
    }

    public void two(View view)
    {
        counting+=2;
        display(counting);
    }

    public void ft(View view)
    {
        counting+=1;
        display(counting);
    }

    // TEAM B

    private void bdisplay(int x) {
        TextView c = findViewById(R.id.bcount);
        c.setText(""+x);
    }

    public void bthree(View view)
    {
        bcounting+=3;
        bdisplay(bcounting);
    }

    public void btwo(View view)
    {
        bcounting+=2;
        bdisplay(bcounting);
    }

    public void bft(View view)
    {
        bcounting+=1;
        bdisplay(bcounting);
    }

    // Reset

    public void reset(View view)
    {
        counting=0;
        bcounting=0;
        display(counting);
        bdisplay(bcounting);
    }
}