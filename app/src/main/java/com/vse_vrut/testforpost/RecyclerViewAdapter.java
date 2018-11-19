package com.vse_vrut.testforpost;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
// Нужен пробел перед фигурной скобкой
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    // Лучше сделать приватными
    Context mContext;
    List<DeskItem> mItems;

    public RecyclerViewAdapter(Context context, List<DeskItem> items) {
        mContext = context;
        mItems = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;

        // Не хватает пробелов между аргументами
        view = LayoutInflater.from(mContext).inflate(R.layout.desk_item,viewGroup,false);
        // Можно не сохранять в локальную переменную, а сразу возвращать значение:
        // return new MyViewHolder(view);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        // Вот тут лишние пустые строки


        myViewHolder.mTitleTextView.setText(mItems.get(i).getTitle());
        myViewHolder.mDetailsTextView.setText(mItems.get(i).getDetails());
        myViewHolder.mImg.setImageResource(mItems.get(i).getImage());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    // Можно уменьшить доступ до package-private
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView mTitleTextView;
        private TextView mDetailsTextView;
        private ImageView mImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            // Кастование излишнее
            mTitleTextView = (TextView) itemView.findViewById(R.id.desk_title_text_view);
            mDetailsTextView = (TextView) itemView.findViewById(R.id.desk_details_text_view);
            mImg = (ImageView) itemView.findViewById(R.id.desk_image_view);

        }
    }
}
