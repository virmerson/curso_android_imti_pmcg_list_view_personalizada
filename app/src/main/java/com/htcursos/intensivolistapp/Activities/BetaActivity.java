package com.htcursos.intensivolistapp.Activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.htcursos.intensivolistapp.R;
import com.htcursos.intensivolistapp.adapters.ImageGridAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by mac on 29/07/15.
 */
public class BetaActivity extends AppCompatActivity {

    @Bind(R.id.my_grid)
    GridView myGrid;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_beta);

        ButterKnife.bind(this);

        //Carregando o Adapter com as imagens
        ImageGridAdapter adapter = new ImageGridAdapter(this, imageList);
        //Carregando o adapter no Layout
        myGrid.setAdapter(adapter);
    }

    private Integer[] imageList = {
            R.drawable.sample_2,
            R.drawable.sample_3,
            R.drawable.sample_4,
            R.drawable.sample_5,
            R.drawable.sample_6,
            R.drawable.sample_7,
            R.drawable.sample_0,
            R.drawable.sample_1,
            R.drawable.sample_2,
            R.drawable.sample_3,
            R.drawable.sample_4,
            R.drawable.sample_5,
            R.drawable.sample_6,
            R.drawable.sample_7,
            R.drawable.sample_0,
            R.drawable.sample_1,
            R.drawable.sample_2,
            R.drawable.sample_3,
            R.drawable.sample_4,
            R.drawable.sample_5,
            R.drawable.sample_6,
            R.drawable.sample_7
    };



}

