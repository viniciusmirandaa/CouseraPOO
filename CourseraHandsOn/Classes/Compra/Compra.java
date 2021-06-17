package CourseraHandsOn.Classes.Compra;

public class Compra {
    private int valorTotal;
    private int numeroParcelas;

    public Compra(int valor){
        valorTotal = valor;
        numeroParcelas = 1;
    }

    public Compra(int quantidadeParcelas, int valorParcelas){
        numeroParcelas = quantidadeParcelas;
        valorTotal = valorParcelas * quantidadeParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcelas(){
        return valorTotal / numeroParcelas;
    }
}
