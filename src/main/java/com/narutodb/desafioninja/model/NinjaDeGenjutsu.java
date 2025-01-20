package com.narutodb.desafioninja.model;

public class NinjaDeGenjutsu extends Personagem implements Ninja {

    public NinjaDeGenjutsu(String nome, int idade, String aldeia, int chakra) {
        super(nome, idade, aldeia, chakra);
    }

    @Override
    public String usarJutsu() {
        return getNome() + " está atacando com seu Genjutsu!\n";
    }

    @Override
    public String desviar() {
        return getNome() + " está desviando com suas habilidades em Genjutsu!\n";
    }

}
