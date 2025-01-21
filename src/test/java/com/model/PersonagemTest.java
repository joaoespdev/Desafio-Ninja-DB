package com.model;

import com.narutodb.desafioninja.DesafioninjaApplication;
import com.narutodb.desafioninja.model.Personagem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = DesafioninjaApplication.class)
class PersonagemTest {

    private Personagem personagem;

    @BeforeEach
    void setUp() {
        personagem = new Personagem("Naruto Uzumaki", 17, "Konoha", 1000);
    }

    @Test
    void testAdicionarJutsu() {
        personagem.adicionarJutsu("Rasengan");
        System.out.println("Testando adicionarJutsu: " + personagem.getJutsus());

        assertTrue(personagem.getJutsus().contains("Rasengan"),
                "O jutsu 'Rasengan' deveria estar na lista de jutsus.");
    }

    @Test
    void testAumentarChakra() {
        int chakraAntes = personagem.getChakra();
        personagem.aumentarChakra(500);
        System.out.println("Testando aumentarChakra: Chakra antes = " + chakraAntes + ", Chakra depois = " + personagem.getChakra());

        assertEquals(chakraAntes + 500, personagem.getChakra(),
                "O chakra deveria ter sido aumentado em 500.");
    }

    @Test
    void testExibirInformacoes() {
        personagem.adicionarJutsu("Rasengan");
        personagem.adicionarJutsu("Kage Bunshin");

        String informacoes = personagem.exibirInformacoes();
        System.out.println("Testando exibirInformacoes: \n" + informacoes);

        assertAll("Verificação de informações com jutsus",
                () -> assertTrue(informacoes.contains("Rasengan"),
                        "Deveria conter o jutsu 'Rasengan'."),
                () -> assertTrue(informacoes.contains("Kage Bunshin"),
                        "Deveria conter o jutsu 'Kage Bunshin'.")
        );
    }
}
