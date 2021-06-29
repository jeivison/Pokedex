package com.example.pokedexje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private Object recyclerView;
    //private Object pokemonAdapter;

    private List<Pokemon> pokemonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_pokemons);

        PokemonAdapter pokemonAdapter = new PokemonAdapter(pokemonList);

        RecyclerView.LayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pokemonAdapter);

        addData();

        }

    private void addData() {
        Pokemon poke;

        poke = new Pokemon("Bulbasaur", "Grama");
        pokemonList.add(poke);

        poke = new Pokemon("Charmander", "Fogo");
        pokemonList.add(poke);

        poke = new Pokemon("Squirtle", "Água");
        pokemonList.add(poke);

        PokemonAdapter.notifyDataSetChanged();
    }

    }


///// Código 7 — Método addData//////