package com.example.myapplication.ui.main;

import android.os.Bundle;
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
        if( pageViewModel.getIndex() == 0){
            View root = inflater.inflate(R.layout.fragment_noticias, container, false);
            ListView listaNot = (ListView) root.findViewById(R.id.lv_noticias);
            final ArrayList<String> noticias = preencheDadosNoticias();

            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, noticias);
            listaNot.setAdapter(arrayAdapter);

            listaNot.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(getContext(), "Noticia: "+ noticias.get(position).toString(), Toast.LENGTH_SHORT).show();
                }
            });
            return root;
        }else {
            View root = inflater.inflate(R.layout.fragment_home_page, container, false);
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

    public ArrayList<String> preencheDadosNoticias(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Quanto Toronto Raptors e Golden State Warriors gastaram para chegar às Finais da NBA");
        dados.add("Kawhi prega jogo coletivo dos Raptors antes do jogo 2 das finais da NBA");
        dados.add("Nike veste Air Max 90 com as cores do Toronto Raptors");
        dados.add("Drake quebra acordo, e comportamento do rapper vira problema para a NBA");
    return dados;
    }
}