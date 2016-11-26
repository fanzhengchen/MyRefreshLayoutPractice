package com.fzc.refreshlayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanzhengchen on 10/24/16.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<String> data;
    private LayoutInflater mInflater;

    public Adapter() {
        data = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            data.add(i + "");
        }

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        mInflater = LayoutInflater.from(recyclerView.getContext());
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mInflater.inflate(R.layout.cell_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mCellTextView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView mCellTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mCellTextView = (TextView) itemView.findViewById(R.id.cell_text);
        }
    }
}
