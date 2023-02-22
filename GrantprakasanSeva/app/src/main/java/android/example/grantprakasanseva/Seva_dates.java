package android.example.grantprakasanseva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Seva_dates extends AppCompatActivity {

    //    public static int day,month, year;
    Button from_date;
    DatePickerFragment date;
    TextView from;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva_dates);

        Button sub = (Button) findViewById(R.id.submit);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Seva_dates.this, "Submit", Toast.LENGTH_SHORT).show();
            }
        });

        from = (TextView) findViewById(R.id.From_date);
        from_date = (Button) findViewById(R.id.from_datePicker);
        try {
            from_date.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DialogFragment newFragment = new DatePickerFragment();
                    newFragment.show(getSupportFragmentManager(), "datePicker");
                    Toast.makeText(Seva_dates.this, "Hello From", Toast.LENGTH_SHORT).show();
//                from_date.setText("HI" + date.iday + "/" + date.imonth + "/" + date.iyear);
                    from.setText(date.iday + date.imonth + date.iyear);
//                System.out.println(date.iday + date.imonth + date.iyear);
                }
            });
        }catch (Exception e){
            System.err.println(e);
        }


//        to_date = (Button) findViewById(R.id.to_datePicker);
//        to_date.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               DialogFragment newFragment = new DatePickerFragment();
//               newFragment.show(getSupportFragmentManager(), "datePicker");
//            }
//        });

    }

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        public int iday, imonth, iyear;


        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(requireContext(), this, year, month, day);
        }

        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            iday = i;
            imonth = i1;
            iyear = i2;
        }
    }

}




