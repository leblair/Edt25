package com.example.edt25;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Animals> animals = new ArrayList<>();

    public MyAdapter(Context context, ArrayList<Animals> animals) {
        this.context = context;
        this.animals = animals;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Picasso.get().load(animals.get(position).getUrlImage()).fit().centerCrop().into(holder.imageView);
        //poner imageView de MyAdapter.class interna
        holder.textType.setText(animals.get(position).getType());
        holder.textNickname.setText(animals.get(position).getNickname());
        holder.textAge.setText(String.valueOf(animals.get(position).getAge()));
        holder.textBirthYear.setText(String.valueOf(animals.get(position).getBirthdateyear()));
        holder.textMeals.setText(animals.get(position).getMeals());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textType;
        private TextView textNickname;
        private TextView textAge;
        private TextView textBirthYear;
        private TextView textMeals;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewCard);
            textType = itemView.findViewById(R.id.textType);
            textNickname = itemView.findViewById(R.id.textNickname);
            textAge = itemView.findViewById(R.id.textAge);
            textBirthYear = itemView.findViewById(R.id.textBirthYear);
            textMeals = itemView.findViewById(R.id.textMeals);


        }
    }



}
