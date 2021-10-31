package com.example.pertemuan4_recylrbin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.ItemViewHolder>{
    private ArrayList<item> dataList;
    public itemAdapter(ArrayList<item> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public itemAdapter.ItemViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_coin, parent, false);
        return new ItemViewHolder(view);
    }
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txt_namacoin.setText(dataList.get(position).getNamacoin());
        holder.txt_ranking.setText(dataList.get(position).getRanking());
        holder.txt_asal.setText(dataList.get(position).getAsal());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_namacoin, txt_ranking, txt_asal;
        private ImageView Logo;
        public ItemViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txt_namacoin = (TextView)
                    itemView.findViewById(R.id.txt_namacoin);
            txt_ranking = (TextView)
                    itemView.findViewById(R.id.txt_ranking);
            txt_asal = (TextView)
                    itemView.findViewById(R.id.txt_asal);
        }
    }
}
