package com.controller;

import com.narutodb.desafioninja.DesafioninjaApplication;
import com.narutodb.desafioninja.controller.NinjaController;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = DesafioninjaApplication.class)
class NinjaControllerTest {

    @InjectMocks
    private NinjaController ninjaController;

    @Test
    void testarNinjas_deveRetornarInformacoesFormatadas() {
        // Act
        String resposta = ninjaController.testarNinjas();

        // Assert
        assertNotNull(resposta, "A resposta não deveria ser nula.");

        // Verifica informações de Might Guy
        assertTrue(resposta.contains("Might Guy"), "Deveria conter o nome Might Guy.");
        assertTrue(resposta.contains("Ascensão Destruidora de Rocha da Folha"), "Deveria conter os jutsus de Might Guy.");
        assertTrue(resposta.contains("Konoha"), "Deveria conter a vila de Might Guy.");

        // Verifica informações de Jiraiya
        assertTrue(resposta.contains("Jiraiya"), "Deveria conter o nome Jiraiya.");
        assertTrue(resposta.contains("Confronto do Canto de Sapo"), "Deveria conter os jutsus de Jiraiya.");
        assertTrue(resposta.contains("Konoha"), "Deveria conter a vila de Jiraiya.");

        // Verifica informações de Kakashi Hatake
        assertTrue(resposta.contains("Kakashi Hatake"), "Deveria conter o nome Kakashi Hatake.");
        assertTrue(resposta.contains("Mil anos de morte"), "Deveria conter os jutsus de Kakashi Hatake.");
        assertTrue(resposta.contains("Konoha"), "Deveria conter a vila de Kakashi Hatake.");

        // Validações adicionais podem ser adicionadas aqui
    }
}