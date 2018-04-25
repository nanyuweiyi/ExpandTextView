package com.lcodecore.expandtextview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lcodecore.extextview.ExpandTextView;

public class SampleTextListAdapter extends RecyclerView.Adapter<SampleTextListAdapter.MyViewHolder> {

    Context mContext;
    String[] sampleStrings;

    public SampleTextListAdapter(Context context, String[] datas) {
        mContext  = context;
        sampleStrings = datas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.expandableTextView.setText(sampleStrings[position]);
    }

    @Override
    public int getItemCount() {
        return sampleStrings.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ExpandTextView expandableTextView;

        private MyViewHolder(View itemView) {
            super(itemView);
            expandableTextView = (ExpandTextView) itemView.findViewById(R.id.tvTestItem);
        }
    }

}