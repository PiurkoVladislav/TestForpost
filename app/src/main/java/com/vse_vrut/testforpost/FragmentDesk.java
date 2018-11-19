package com.vse_vrut.testforpost;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class FragmentDesk extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;    // Желательно придерживаться одного правила
    private List<DeskItem> mItems;                      // именования полей - с префиксом или без

    public FragmentDesk() {                         // Пустой конструктор
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.desk_fragment, container,false);

        mRecyclerView = view.findViewById(R.id.desk_recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        return view;
    }

    // Создавать адаптер каждый раз излишне, можно добавить в адаптер метод
    // update(List<DeskItem> elements), внутри которого сохранять ссылку на список и вызывать
    // notifyDataSetChanged(), что вызовет полную перерисовку списка.
    //
    // Метод обновляет только список элементов, так что возможно стоит переименовать его в
    // updateList?
    public void updateUI(List<DeskItem> deskItems){
        mItems = deskItems;
        recyclerViewAdapter = new RecyclerViewAdapter(getContext(), mItems);
        mRecyclerView.setAdapter(recyclerViewAdapter);
    }

}
