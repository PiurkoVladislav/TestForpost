package com.vse_vrut.testforpost;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTable extends Fragment {
    // Замечания аналогичны замечаниям в FragmentTeams.

    View v;

    public FragmentTable() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.table_fragment,container,false);
        return v;
    }
}
