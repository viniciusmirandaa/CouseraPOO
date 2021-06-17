package CourseraTarefas.Semana4.DiferentesProdutosTest;

import CourseraTarefas.Semana4.DiferentesProdutos.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoTest {

    @Test
    void testHashCode() {
        Produto p = new Produto("Mouse", 25.70, 1);
        Produto p2 = new Produto("Mouse2", 35.70, 2);
        assertEquals(false, p.hashCode() == p2.hashCode());
    }

    @Test
    void testEquals() {
        Produto p = new Produto("Mouse", 25.70, 1);
        Produto p2 = new Produto("Mouse2", 35.70, 1);
        assertEquals(true, p.equals(p2));
    }
}