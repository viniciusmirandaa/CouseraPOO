package CourseraHandsOn.Classes.Somador;

public class Somador {
    int somaInstancia;
    static int somaEstatica;

    public void somar(){
        somaInstancia++;
        somaEstatica++;
    }

    public void imprimir(){
        System.out.println("Soma insância: " + somaInstancia + "\n" + "Soma estática: " + somaEstatica);
    }
}
