package CourseraTarefas.Semana4.DiferentesProdutos;

public class ProdutoComTamanho extends Produto {

    private int tamanho;

    public ProdutoComTamanho(String nome, double preco, int codigo, int tamanho) {
        super(nome, preco, codigo);
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this == obj) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }

        ProdutoComTamanho outroProduto = (ProdutoComTamanho) obj;

        if (this.hashCode() != outroProduto.hashCode()){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int conta = 15;
        int resultadoHashSuper = super.hashCode();
        return this.tamanho * conta + resultadoHashSuper;
    }



    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }
}
