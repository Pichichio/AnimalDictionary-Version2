package com.example.doantruong.cardviewdemo;

import android.net.Uri;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    int[] animal_pictures = {
            R.drawable.bat, R.drawable.bear, R.drawable.deer,
            R.drawable.elephant, R.drawable.orangutan, R.drawable.hedgehog,
            R.drawable.hyena, R.drawable.capebuffalo, R.drawable.rhino,
            R.drawable.squirrel
    };
    String[] animal_name;
    ArrayList<Mammal> mammals = new ArrayList<>();
    Toolbar toolbar;
    private MammalAdapter adapter;

    private SoundHelper mSoundHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // SoundHelper
        mSoundHelper = new SoundHelper();
        mSoundHelper.prepareMusicPlayer(this);
        mSoundHelper.playMusic();
        //
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        animal_name = getResources().getStringArray(R.array.animal_name);
        int count = 0;
        for (String Name : animal_name) {
            mammals.add(new Mammal(Name, animal_pictures[count]));
            count++;
        }
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        adapter = new MammalAdapter(mammals, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        newText = newText.toLowerCase();
        ArrayList<Mammal> newList = new ArrayList<>();
        for (Mammal mammal : mammals) {
            String name = mammal.getNameAnimal().toLowerCase();
            if (name.contains(newText))
                newList.add(mammal);
        }
        adapter.setFilter(newList);
        return true;
    }
}