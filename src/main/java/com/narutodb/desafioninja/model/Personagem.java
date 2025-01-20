package com.narutodb.desafioninja.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private int idade;
    private String aldeia;
    private List<String> jutsus;
    private int chakra;

    public Personagem(String nome, int idade, String aldeia, int chakra) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.chakra = chakra;
        this.jutsus = new ArrayList<>();
    }

    public void adicionarJutsu(String jutsu) {
        jutsus.add(jutsu);
    }

    public String aumentarChakra(int quantidade) {
        chakra += quantidade;
        return nome + " aumentou seu chakra em " + quantidade + ". Chakra atual: " + chakra + "\n\n";
    }

    public String exibirInformacoes() {
        return "Nome Ninja: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Aldeia: " + aldeia + "\n" +
                "Quantidade de Chakra: " + chakra + "\n" +
                "Lista de jutsus: " + jutsus + "\n";
    }

    public String usarJutsu() {
        return nome + " está usando um golpe de Ninjutsu!<br>";
    }

    public String desviar() {
        return nome + " está desviando com sua habilidade em Ninjutsu!";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public List<String> getJutsus() {
        return jutsus;
    }

    public void setJutsus(List<String> jutsus) {
        this.jutsus = jutsus;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

}
