package com.example.roommanegment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {
    List<Customer> customerList;
    Context context;

    public ListAdapter(List<Customer> customerList, Context context) {
        this.customerList = customerList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText("Name: " + customerList.get(position).getName());
        holder.smk.setText("SMK No.: " + String.valueOf(customerList.get(position).getSmk()));
        holder.num_memb.setText("No.of members: " + String.valueOf(customerList.get(position).getNumber_of_members()));
        holder.phone_no.setText("Phone Number: " + String.valueOf(customerList.get(position).getPhone_no()));
//        Glide.with(context).load(customerList.get(position).g).into(imageView);
    }

    @Override
    public int getItemCount() {
        return customerList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView cust_img;
        TextView name;
        TextView smk;
        TextView num_memb;
        TextView phone_no;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cust_img = itemView.findViewById(R.id.cust_img);
            name = itemView.findViewById(R.id.cust_name);
            smk = itemView.findViewById(R.id.cust_smk);
            num_memb = itemView.findViewById(R.id.num_memb);
            phone_no = itemView.findViewById(R.id.phone_number);
        }
    }
}
