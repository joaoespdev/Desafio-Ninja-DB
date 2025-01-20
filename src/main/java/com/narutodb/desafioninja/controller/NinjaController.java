package com.narutodb.desafioninja.controller;

import com.narutodb.desafioninja.model.NinjaDeGenjutsu;
import com.narutodb.desafioninja.model.NinjaDeNinjutsu;
import com.narutodb.desafioninja.model.NinjaDeTaijutsu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinjaController {

    @GetMapping("/ninjas")
    public String testarNinjas() {
        NinjaDeTaijutsu guySensei = new NinjaDeTaijutsu("Might Guy", 30, "Konoha", 500);

        guySensei.adicionarJutsu("Ascensão Destruidora de Rocha da Folha");
        guySensei.adicionarJutsu("Entrada Dinâmica");
        guySensei.adicionarJutsu("Genjutsu: Liberar");
        guySensei.adicionarJutsu("Técnica de Caminhada Aquática");
        guySensei.adicionarJutsu("Técnica de Invocação: Tartaruga");
        guySensei.adicionarJutsu("Oito Portões");


        NinjaDeGenjutsu jiraiya = new NinjaDeGenjutsu("Jiraiya", 54, "Konoha",5000);

        jiraiya.adicionarJutsu("Técnica de Caminhada Aquática");
        jiraiya.adicionarJutsu("Genjutsu: Liberar");
        jiraiya.adicionarJutsu("Substituição");
        jiraiya.adicionarJutsu("Jutsu de invocação");
        jiraiya.adicionarJutsu("Confronto do Canto de Sapo"); //genjutsu
        jiraiya.adicionarJutsu("Modo Sábio");
        jiraiya.adicionarJutsu("Agulhas Jizou");
        jiraiya.adicionarJutsu("Arte Eremita: Goemon");
        jiraiya.adicionarJutsu("Estilo Fogo: Bomba de Chamas do Óleo de Sapo");
        jiraiya.adicionarJutsu("Rasengan");


        NinjaDeNinjutsu ninjaDosMilJutsus = new NinjaDeNinjutsu("Kakashi Hatake", 30, "Konoha", 1500);

        ninjaDosMilJutsus.adicionarJutsu("Técnica de Caminhada Aquática");
        ninjaDosMilJutsus.adicionarJutsu("Mil anos de morte");
        ninjaDosMilJutsus.adicionarJutsu("Clones das Sombras");
        ninjaDosMilJutsus.adicionarJutsu("Substituição");
        ninjaDosMilJutsus.adicionarJutsu("Genjutsu: Liberar");
        ninjaDosMilJutsus.adicionarJutsu("Chidori");
        ninjaDosMilJutsus.adicionarJutsu("Rasengan");
        ninjaDosMilJutsus.adicionarJutsu("Mangekyou Sharingan");

        StringBuilder resposta = new StringBuilder();

        resposta.append(guySensei.exibirInformacoes().replace("\n", "<br>"));
        resposta.append(guySensei.usarJutsu().replace("\n", "<br>"));
        resposta.append(guySensei.desviar().replace("\n", "<br>"));
        resposta.append(guySensei.aumentarChakra(500).replace("\n", "<br>"));


        resposta.append(jiraiya.exibirInformacoes().replace("\n", "<br>"));
        resposta.append(jiraiya.usarJutsu().replace("\n", "<br>"));
        resposta.append(jiraiya.desviar().replace("\n", "<br>"));
        resposta.append(jiraiya.aumentarChakra(500).replace("\n", "<br>"));


        resposta.append(ninjaDosMilJutsus.exibirInformacoes().replace("\n", "<br>"));
        resposta.append(ninjaDosMilJutsus.usarJutsu().replace("\n", "<br>"));
        resposta.append(ninjaDosMilJutsus.desviar().replace("\n", "<br>"));
        resposta.append(ninjaDosMilJutsus.aumentarChakra(500).replace("\n", "<br>"));

        return resposta.toString();

    }

}
