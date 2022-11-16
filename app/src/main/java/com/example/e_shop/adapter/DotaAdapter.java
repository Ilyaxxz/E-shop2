package com.example.e_shop.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_shop.R;
import com.example.e_shop.model.Dota;

import java.util.List;

public class DotaAdapter extends RecyclerView.Adapter<DotaAdapter.DotaViewHolder> {

    Context context;
    List<Dota> dotan;
    DotaAdapter dotaAdapter;

    public DotaAdapter(Context context, List<Dota> dota2) {
        this.context = context;
        dotan = dota2;
    }

    @NonNull
    @Override
    public DotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View dotaItems = LayoutInflater.from(context).inflate(R.layout.dota_item, parent, false);
        return new DotaAdapter.DotaViewHolder(dotaItems);
    }

    @Override
    public void onBindViewHolder(@NonNull DotaAdapter.DotaViewHolder holder, int position) {
        holder.dotaBg.setBackgroundColor(Color.parseColor(dotan.get(position).getColor()));

        int imageId = context.getResources().getIdentifier("ic_" + dotan.get(position).getImg(), "drawable", context.getPackageName());
        holder.itemImage.setImageResource(imageId);

        holder.itemTitle.setText(dotan.get(position).getTitle());
        holder.itemPrice.setText(dotan.get(position).getPrice());
        holder.itemRare.setText(dotan.get(position).getRare());
    }


    @Override
    public int getItemCount() {
        return dotan.size();
    }

    public static final class DotaViewHolder extends RecyclerView.ViewHolder {

        LinearLayout dotaBg;
        ImageView itemImage;
        TextView itemTitle, itemPrice, itemRare;

        public DotaViewHolder(@NonNull View itemView) {
            super(itemView);

            dotaBg = itemView.findViewById(R.id.dotaBg);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemTitle = itemView.findViewById(R.id.itemTitle);
            itemRare = itemView.findViewById(R.id.itemRare);
            itemPrice = itemView.findViewById(R.id.itemPrice);
        }
    }

}
