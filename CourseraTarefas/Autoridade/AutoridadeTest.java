package Coursera.CourseraTarefas.Autoridade;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoridadeTest {
    String nome;
    String sobreNome;

    @Before
    public void nomeSobreNome() {
        nome = "Vinicius";
        sobreNome = "Miranda";
    }

    @Test
    void formatarNome() {
        nomeSobreNome();
        FormatadorNome formatadorNome = new Informal();
        Autoridade autoridade = new Autoridade(nome, sobreNome, formatadorNome);
        assertEquals("Vinicius", autoridade.getTratamento());
    }

    @Test
    void testFormatarNome() {
        nomeSobreNome();
        FormatadorNome formatadorNome = new Respeitoso('M');
        Autoridade autoridade = new Autoridade("Vinicius", "Miranda", formatadorNome);
        assertEquals("Sr. Miranda", autoridade.getTratamento());
    }

    @Test
    void testFormatarNome1() {
        nomeSobreNome();
        FormatadorNome formatadorNome = new ComTitulo("Magnífico");
        Autoridade autoridade = new Autoridade("Vinicius", "Miranda", formatadorNome);
        assertEquals("Magnífico Vinicius Miranda", autoridade.getTratamento());
    }
}