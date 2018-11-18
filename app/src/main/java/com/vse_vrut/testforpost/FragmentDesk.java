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

import java.util.ArrayList;
import java.util.List;

public class FragmentDesk extends Fragment {

    View v;
    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private List<DeskItem> mItems;

    public FragmentDesk() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.desk_fragment,container,false);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.desk_recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        return v;
    }


    public void updateUI(List<DeskItem> deskItems){
        mItems = deskItems;
        recyclerViewAdapter = new RecyclerViewAdapter(getContext(),mItems);
        mRecyclerView.setAdapter(recyclerViewAdapter);
    }

}
