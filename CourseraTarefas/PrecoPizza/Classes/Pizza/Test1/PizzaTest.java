package Coursera.CourseraTarefas.PrecoPizza.Classes.Pizza.Test1;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {

    @Before
    public void before(){
        Pizza.zerarRegistro();
    }

    @Test
    void adicionaIngrediente() {
        Pizza p = new Pizza();
        p.adicionaIngrediente("Ovo");
        p.adicionaIngrediente("Ervilha");
        p.adicionaIngrediente("Presunto");
        p.adicionaIngrediente("Queijo");
        p.adicionaIngrediente("Molho de tomate");
        p.adicionaIngrediente("Cebola");
        assertEquals(6, p.ingredientesPizza);
    }

    @Test
    void getPreco() {
        Pizza p = new Pizza();
        p.adicionaIngrediente("Ovo");
        p.adicionaIngrediente("Ervilha");
        p.adicionaIngrediente("Presunto");
        p.adicionaIngrediente("Queijo");
        p.adicionaIngrediente("Molho de tomate");
        p.adicionaIngrediente("Cebola");
        assertEquals(23, p.getPreco());
    }


}