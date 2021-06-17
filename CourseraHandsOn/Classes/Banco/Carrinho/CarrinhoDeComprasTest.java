package CourseraTarefas.PrecoPizza.Classes.Carrinho;

import CourseraTarefas.PrecoPizza.Classes.Pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoDeComprasTest {

    @Test
    void adicionarPizza() {
        Pizza calabresa = new Pizza();
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        assertEquals(false, c.adicionarPizza(calabresa));
    }

    @Test
    void retornaValorTotal() {
        Pizza portuguesa = new Pizza();
        Pizza frango = new Pizza();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        portuguesa.adicionaIngrediente("Ovo");
        portuguesa.adicionaIngrediente("Ervilha");
        portuguesa.adicionaIngrediente("Presunto");
        portuguesa.adicionaIngrediente("Queijo");
        portuguesa.adicionaIngrediente("Molho de tomate");
        portuguesa.adicionaIngrediente("Cebola");

        frango.adicionaIngrediente("Frango");
        frango.adicionaIngrediente("Catupiry");
        frango.adicionaIngrediente("Cebola");

        carrinho.adicionarPizza(portuguesa);
        carrinho.adicionarPizza(frango);

        assertEquals(43, carrinho.retornaValorTotal());
    }
}