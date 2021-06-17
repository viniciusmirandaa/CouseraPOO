package CourseraTarefas.Semana4.DiferentesProdutosTest;

import CourseraTarefas.Semana4.DiferentesProdutos.CarrinhoDeCompras;
import CourseraTarefas.Semana4.DiferentesProdutos.ProdutoComTamanho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarrinhoDeComprasProdutoTest {

    @Test
    void adicionaProdutos() {
        ProdutoComTamanho p = new ProdutoComTamanho("Calça", 200, 2, 38);
        ProdutoComTamanho p2 = new ProdutoComTamanho("Calça2", 200, 2, 32);
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionaProdutos(p, 2);
        c.adicionaProdutos(p2, 2);
        assertEquals(8, c.getQuantidadeItensCarrinho());
    }

    @Test
    void removeProduto() {
        ProdutoComTamanho p = new ProdutoComTamanho("Calça", 200, 2, 38);
        ProdutoComTamanho p2 = new ProdutoComTamanho("Calça2", 200, 2, 32);
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionaProdutos(p, 2);
        c.adicionaProdutos(p2, 2);
        c.removeProduto(p2, 1);
        assertEquals(11, c.getQuantidadeItensCarrinho());
    }

    @Test
    void calcularCarrinho() {
        ProdutoComTamanho p = new ProdutoComTamanho("Calça", 200, 2, 38);
        ProdutoComTamanho p2 = new ProdutoComTamanho("Calça2", 200, 2, 32);
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionaProdutos(p, 2);
        c.adicionaProdutos(p2, 2);
        assertEquals(800, c.calcularCarrinho());
    }
}