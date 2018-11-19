package com.vse_vrut.testforpost;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTeams extends Fragment {
    // Зачем сохранять View в поле? Почему не приватный уровень доступа?
    View v;

    // Конструктор по умолчанию генерит Java, т.к. у тебя нет других конструкторов(с параметрами),
    // так что явно можно не определять конструктор.
    public FragmentTeams() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //View нигде не используется, поэтому нет смысла сохранять View в локальную переменную,
        //чтобы затем просто вернуть её из метода. Вот так было бы лаконичней:
        //return inflater.inflate(R.layout.teams_fragment, container, false);

        // Так же обрати внимание на пробелы между аргументами
        v = inflater.inflate(R.layout.teams_fragment, container, false);
        return v;
    }
}
