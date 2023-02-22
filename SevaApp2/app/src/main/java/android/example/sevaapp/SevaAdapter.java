package android.example.sevaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class SevaAdapter extends RecyclerView.Adapter<SevaAdapter.Viewholder> {

    private Context context;
    private ArrayList<SevaModel> sevaModelArrayList;

    // Constructor
    public SevaAdapter(Context context, ArrayList<SevaModel> sevaModelArrayList) {
        this.context = context;
        this.sevaModelArrayList = sevaModelArrayList;
    }

    @NonNull
    @Override
    public SevaAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SevaAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        SevaModel model = sevaModelArrayList.get(position);
        holder.bktNameTV.setText(model.getBkt_name());
        holder.bktSMKTV.setText("SMK : "+model.getBkt_smk());
        holder.bktIV.setImageResource(model.getBkt_image());
        holder.bktNumTV.setText("No. : "+model.getBkt_num());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return sevaModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView bktIV;
        private TextView bktNameTV, bktSMKTV, bktNumTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            bktIV = itemView.findViewById(R.id.idIVBhaktoImage);
            bktNameTV = itemView.findViewById(R.id.idTVBhaktoName);
            bktSMKTV = itemView.findViewById(R.id.idTVBhaktoSMK);
            bktNumTV = itemView.findViewById(R.id.idTVBhaktoNum);
        }
    }
}