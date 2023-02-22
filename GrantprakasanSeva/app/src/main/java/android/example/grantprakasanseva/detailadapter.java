package android.example.grantprakasanseva;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class detailadapter extends ArrayAdapter<details>{
    int hidcount = 1;
    RelativeLayout activity_2;
    Activity context;
    public detailadapter(Activity context, ArrayList<details> words){
        super(context,0,words);
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }
        details currentword = getItem(position);

        TextView bktname = (TextView) listItemView.findViewById(R.id.bkt_name);
        bktname.setText("Name: " + currentword.getBkt_name());

        TextView bktsmk = (TextView) listItemView.findViewById(R.id.bkt_smk);
        bktsmk.setText("Smk: " + currentword.getBkt_smk());

        TextView bktnum = (TextView) listItemView.findViewById(R.id.bkt_num);
        bktnum.setText("Phone No.: " + currentword.getBkt_num());


        LinearLayout hidtxt = (LinearLayout) listItemView.findViewById(R.id.hidtxt_container);
        hidtxt.setVisibility(View.GONE);

        activity_2 = (RelativeLayout) listItemView.findViewById(R.id.Rl);
        activity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(context,Seva_dates.class);
                context.startActivity(i);
            }
        });

        ImageButton extend = (ImageButton) listItemView.findViewById(R.id.down);
                extend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context ,"Hello Button", Toast.LENGTH_SHORT).show();
                hidcount++;
                if (hidcount%2==0){
                    hidtxt.setVisibility(View.VISIBLE);
                }
                else{
                    hidtxt.setVisibility(View.GONE);
                }
            }
        });
        ImageView image = (ImageView) listItemView.findViewById(R.id.imageView);
        image.setImageResource(currentword.getImage());


        return listItemView;

    }
}
