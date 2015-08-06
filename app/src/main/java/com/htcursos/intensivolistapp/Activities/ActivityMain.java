package com.htcursos.intensivolistapp.Activities;

import android.os.Bundle;
import android.support.annotation.BinderThread;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.htcursos.intensivolistapp.R;
import com.htcursos.intensivolistapp.adapters.UserListAdapter;
import com.htcursos.intensivolistapp.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Virmerson on 24/07/15.
 */
public class ActivityMain extends AppCompatActivity {

    @Bind(R.id.lista)
    ListView lista;

    List<User> userList = new ArrayList<User>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        createUsers();
        //Carregando os dados no adapter
        UserListAdapter adapter = new UserListAdapter(this, userList);

        //Carregando o adapter no ListView
         lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ActivityMain.this, userList.get(position).name, Toast.LENGTH_SHORT ).show();
            }
        });

    }
    public void createUsers(){
        userList = Arrays.asList(new User(1, "Jao",R.drawable.sample_0 ),
                                new User(2, "Maria", R.drawable.sample_1),
                                new User(3,"Zé", R.drawable.sample_2));
    }



}
