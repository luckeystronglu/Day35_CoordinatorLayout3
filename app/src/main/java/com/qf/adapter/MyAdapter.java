package com.qf.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qf.day35_coordinatorlayout.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ken on 2016/10/13.14:47
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHodler> {

    public Context context;
    public List<String> datas;

    public MyAdapter(Context context){
        this.context = context;
        this.datas = new ArrayList<>();
    }

    public void setDatas(List<String> datas){
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    @Override
    public MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new MyViewHodler(view);
    }

    @Override
    public void onBindViewHolder(MyViewHodler holder, int position) {
        holder.tv.setText(datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class MyViewHodler extends RecyclerView.ViewHolder{

        TextView tv;

        public MyViewHodler(View itemView) {
            super(itemView);
            this.tv = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
