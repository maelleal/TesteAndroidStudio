package com.example.myapplication.ui.main;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //AQUI É SÓ REDIRECIONAR AS PAGINAS
        // 0 == NOTICIAS
        // 1 == Resultados
        // 2 == Jogos
        // 3 == Equipe
        switch (pageViewModel.getIndex()) {
            case 0:
                View root = inflater.inflate(R.layout.fragment_noticias, container, false);
                return root;
            case 1:
                root = inflater.inflate(R.layout.fragment_resultados, container, false);
                return root;
            case 2:
                root = inflater.inflate(R.layout.fragment_prox_jogos, container, false);
                return root;
            case 3:
                root = inflater.inflate(R.layout.fragment_team, container, false);
                return root;
            default:
                root = inflater.inflate(R.layout.fragment_home_page, container, false);
                final TextView textView = root.findViewById(R.id.section_label);
                pageViewModel.getText().observe(this, new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        textView.setText(s);
                    }
                });
                return root;
        }

    }
}