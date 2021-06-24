package com.example.pokedexje;

public class Pokemon {

    private String nome;
    private String type;

    public Pokemon(){

    }

    public Pokemon(String nome, String type) {
        this.nome = nome;
        this.type = type;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
