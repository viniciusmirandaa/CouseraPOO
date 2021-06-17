package CourseraHandsOn.Classes.Carro;

public class Carro {
    private int potencia;
    private int velocidade;
    private int velocidadeMaxima;
    private String nome;

    public Carro(int potencia, int velocidadeMaxima, String nome) {
        this.potencia = potencia;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
        acelera();
        frear();
        imprimir();
    }

    private void acelera() {
        velocidade += potencia;
    }

    private void frear() {
        velocidade /= 2;
    }

    private void imprimir() {
        System.out.println("O carro " + nome + " está a velocidade de " + velocidade + " km/h.");
    }

    public int getVelocidade(){
        return velocidade;
    }
    public void setPotenciaVelocidade(int potencia, int velocidade){
        acelera();
        frear();
        imprimir();
    }
}

