package com.abhi.recyclerviewverticlehorizontal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by abhijeet on 2/2/18.
 */

public class VerticalListAdapter extends RecyclerView.Adapter<VerticalListAdapter.ViewHolder> {

    public static Context mContext;

    public VerticalListAdapter(Context context){
        mContext=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.vertical_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        return 1000;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        RecyclerView horizontalRecyclerView;

        public ViewHolder(View itemView) {
            super(itemView);
            horizontalRecyclerView=itemView.findViewById(R.id.horizontal_recyclerview);
            LinearLayoutManager llmanager=new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false);
            horizontalRecyclerView.setLayoutManager(llmanager);
        }

        public void bindData(int position){

            HorizontalListAdapter listAdapter=new HorizontalListAdapter(mContext);
            horizontalRecyclerView.setAdapter(listAdapter);
        }
    }
}
