package com.example.doantruong.cardviewdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DOANTRUONG on 12/1/2016.
 */

public class MammalAdapter extends RecyclerView.Adapter<MammalAdapter.MammalViewHolder> {
    ArrayList<Mammal> mammals = new ArrayList<>();
    Context ctx;

    public MammalAdapter(ArrayList<Mammal> mammals, Context ctx) {
        this.mammals = mammals;
        this.ctx = ctx;
    }

    @Override
    public MammalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_layout, parent, false);
        return new MammalViewHolder(view, ctx, mammals);
    }

    @Override
    public void onBindViewHolder(MammalViewHolder holder, int position) {
        holder.animal_picture.setImageResource(mammals.get(position).getPictureAnimal());
        holder.animal_name.setText(mammals.get(position).getNameAnimal());
    }

    @Override
    public int getItemCount() {
        return mammals.size();
    }

    public static class MammalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView animal_picture;
        TextView animal_name;
        ArrayList<Mammal> mammals = new ArrayList<>();
        Context ctx;

        public MammalViewHolder(View view, Context ctx, ArrayList<Mammal> mammals) {
            super(view);
            this.mammals = mammals;
            this.ctx = ctx;
            view.setOnClickListener(this);
            animal_picture = (ImageView) view.findViewById(R.id.pictureAnimal);
            animal_name = (TextView) view.findViewById(R.id.nameAnimal);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Mammal mammal = this.mammals.get(position);
            Intent intent = new Intent(this.ctx, AnimalDetails.class);
            intent.putExtra("animal_pictures", mammal.getPictureAnimal());
            intent.putExtra("animal_name", mammal.getNameAnimal());
            this.ctx.startActivity(intent);
        }
    }

    public void setFilter(ArrayList<Mammal> newList) {
        mammals = new ArrayList<>();
        mammals.addAll(newList);
        notifyDataSetChanged();
    }
}