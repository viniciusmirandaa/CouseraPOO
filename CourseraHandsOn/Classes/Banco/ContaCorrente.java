package CourseraHandsOn.Classes.Banco;

public class ContaCorrente {
    protected int saldo;

    public int sacar(int valor){
        if(valor > saldo)
        {
            return 0;
        }else {
            saldo -= valor;
            return saldo;
        }
    }

    public void depositar(int valor){
        saldo += valor;
    }

    public int getSaldo(){
        return saldo;
    }
}
