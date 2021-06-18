package Coursera.CourseraTarefas.Autoridade;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

class AutoridadeTest{

    Scanner input = new Scanner(System.in);

    @Test
    void formatarNome() {
        FormatadorNome formatadorNome = new Informal();
        Autoridade autoridade = new Autoridade("Vinicius", "Miranda", formatadorNome);
        autoridade.getTratamento();
    }

    @Test
    void testFormatarNome() {
        FormatadorNome formatadorNome = new Respeitoso('M');
        Autoridade autoridade = new Autoridade("Vinicius", "Miranda", formatadorNome);
        autoridade.getTratamento();
    }

    @Test
    void testFormatarNome1() {
        FormatadorNome formatadorNome = new ComTitulo("Magnífico");
        Autoridade autoridade = new Autoridade("Vinicius", "Miranda", formatadorNome);
        autoridade.getTratamento();
    }

}