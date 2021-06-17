package CourseraTarefas.Semana4.DiferentesProdutos;

public class Produto {
    private String nome;
    private double preco;
    private int codigo;

    public Produto(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        final int conta = 15;
        return conta * this.codigo;
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

        Produto outroProduto = (Produto) obj;

        if (this.hashCode() != outroProduto.hashCode()) {
            return false;
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
