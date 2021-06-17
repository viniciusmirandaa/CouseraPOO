package CourseraTarefas.Semana4.DiferentesProdutos;

import java.util.HashMap;

public class CarrinhoDeCompras {
    private HashMap<Produto, Integer> produtosAdicionados = new HashMap<>();
    static private int quantidadeItens;
    static private int totalCompra;
    private int recept;

    public boolean adicionaProdutos(Produto produto, int quantidade) {
        if (produtosAdicionados.containsKey(produto)) {
            produtosAdicionados.replace(produto, produtosAdicionados.get(produto) + quantidade);
            quantidadeItens += quantidade;
            return true;
        } else {
            produtosAdicionados.put(produto, quantidade);
            quantidadeItens += quantidade;
            return true;
        }
    }

    public boolean removeProduto(Produto produto, int quantidade) {
        if (produtosAdicionados.containsKey(produto)) {
            produtosAdicionados.replace(produto, produtosAdicionados.get(produto) - quantidade);
            quantidadeItens -= quantidade;
            return true;
        } else {
            return false;
        }
    }

    public int calcularCarrinho(){
        for(Produto produto : produtosAdicionados.keySet()){
            totalCompra += produtosAdicionados.get(produto) * produto.getPreco();
        }
        recept = totalCompra;
        totalCompra = 0;
        return recept;
    }

    public int getQuantidadeItensCarrinho(){
        return quantidadeItens;
    }
}
