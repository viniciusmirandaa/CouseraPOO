package CourseraTarefas.Semana4.DiferentesProdutosTest;

import CourseraTarefas.Semana4.DiferentesProdutos.ProdutoComTamanho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoComTamanhoTest {

    @Test
    void testEquals() {
        ProdutoComTamanho p3 = new ProdutoComTamanho("Calça", 50, 3, 38);
        ProdutoComTamanho p4 = new ProdutoComTamanho("Calça2", 52, 3, 31);
        assertEquals(false, p3.equals(p4));
    }

    @Test
    void testHashCode() {
        ProdutoComTamanho p3 = new ProdutoComTamanho("Calça", 50, 3, 38);
        ProdutoComTamanho p4 = new ProdutoComTamanho("Calça2", 52, 3, 31);
        boolean result = p3.hashCode() == p4.hashCode();
        assertEquals(false, result);
    }
}