package com.narutodb.desafioninja.model;

public class NinjaDeTaijutsu extends Personagem implements Ninja {

    public NinjaDeTaijutsu(String nome, int idade, String aldeia, int chakra) {
        super(nome, idade, aldeia, chakra);
    }

    @Override
    public String usarJutsu() {
        return getNome() + " está usando um golpe com Taijutsu!\n";
    }

    @Override
    public String desviar() {
        return getNome() + " está desviando com sua habilidade em Taijutsu em alta velocidade!\n";
    }

}
