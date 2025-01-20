package com.narutodb.desafioninja.model;

import java.util.List;

public class NinjaDeNinjutsu extends Personagem implements Ninja {

    public NinjaDeNinjutsu(String nome, int idade, String aldeia, int chakra) {
        super(nome, idade, aldeia, chakra);
    }

    @Override
    public String usarJutsu() {
        return getNome() + " está usando um Ninjutsu!\n";
    }

    @Override
    public String desviar() {
        return getNome() + " está desviando usando suas habilidades em Ninjutsu!\n";
    }

}
