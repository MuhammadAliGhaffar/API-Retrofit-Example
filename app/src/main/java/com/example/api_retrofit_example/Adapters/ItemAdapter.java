package com.example.api_retrofit_example.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.api_retrofit_example.Models.Item;
import com.example.api_retrofit_example.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<Item> itemList;

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        holder.product_name.setText(itemList.get(position).getProduct_name());
        holder.product_desc.setText(itemList.get(position).getProduct_desc());
        holder.product_price.setText("$"+String.valueOf(itemList.get(position).getProduct_price()));
        holder.product_image.setImageResource(itemList.get(position).getProduct_image());
        holder.relativeLL.setOnClickListener(view -> Toast.makeText(view.getContext(), "click on item: " + itemList.get(position).toString(), Toast.LENGTH_LONG).show());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView product_image;
        public TextView product_name, product_desc, product_price;
        public RelativeLayout relativeLL;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.product_image = itemView.findViewById(R.id.product_image);
            this.product_name = itemView.findViewById(R.id.product_name);
            this.product_desc = itemView.findViewById(R.id.product_desc);
            this.product_price = itemView.findViewById(R.id.product_price);
            this.relativeLL = itemView.findViewById(R.id.relativeLL);
        }
    }
}
