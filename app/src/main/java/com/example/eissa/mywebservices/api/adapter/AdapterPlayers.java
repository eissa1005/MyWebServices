package com.example.eissa.mywebservices.api.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eissa.mywebservices.R;
import com.example.eissa.mywebservices.api.model.Players;

import java.util.List;

/**
 * Created by EISSA on 17/12/2017.
 */

public class AdapterPlayers extends RecyclerView.Adapter<AdapterPlayers.PlayerHolder> {

    public Context mContext;
   public List<Players> lstPlayers;

    public  AdapterPlayers(Context context,List<Players> lstPlayers){
        this.mContext=context;
        this.lstPlayers=lstPlayers;
    }

    @Override
    public PlayerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_items,parent,false);
        return  new PlayerHolder(view);
    }

    @Override
    public void onBindViewHolder(PlayerHolder holder, int position) {

        Players players=lstPlayers.get(position);
        holder.fName.setText(players.getFirstName());
        holder.lName.setText(players.getLastName());
        holder.eMAil.setText(players.getEmail());
    }

    @Override
    public int getItemCount() {
        return lstPlayers.size();
    }

    class  PlayerHolder extends RecyclerView.ViewHolder {
        TextView fName,lName,eMAil;
        public PlayerHolder(View itemView) {
            super(itemView);
            fName=(TextView)itemView.findViewById(R.id.tName);
            lName=(TextView)itemView.findViewById(R.id.tLastName);
            eMAil=(TextView)itemView.findViewById(R.id.tEmail);
        }
    }
}
