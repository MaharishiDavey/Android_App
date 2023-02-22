package android.example.vadodra_utara_alocation;

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

import java.util.ArrayList;

public class RoomAdapter extends ArrayAdapter<Rooms> {

    Activity context;
    public RoomAdapter(Activity context, ArrayList<Rooms> rooms){
        super(context,0,rooms);
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_floor, parent, false);
        }
        Rooms currentword = getItem(position);

        TextView Room_no = (TextView) listItemView.findViewById(R.id.room_no);
        Room_no.setText(currentword.getroom_no());

        TextView cap = (TextView) listItemView.findViewById(R.id.Capacity);
        cap.setText("Capaciy: " + currentword.getCapacity());

        TextView free = (TextView) listItemView.findViewById(R.id.free);
        free.setText("Free: " + currentword.getFree());



        LinearLayout room = (LinearLayout) listItemView.findViewById(R.id.floor_list);
        room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,Add_info.class);
                context.startActivity(i);
            }
        });

        return listItemView;

    }
}
