package CourseraTarefas.ImcCoursera.Classes;

public class Paciente {
    private double peso;
    private double altura;
    private double imc;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        calcularIMC();
    }

    public void calcularIMC() {
        imc = peso / (altura * altura);
    }

    public String diagnostico() {
        if (imc < 16.0) {
            return "Baixo peso muito grave";
        } else if (imc >= 16.0 && imc <= 16.99) {
            return "Baixo peso grave";
        } else if (imc >= 17.0 && imc <= 18.49) {
            return "Baixo peso";
        } else if (imc >= 18.50 && imc <= 24.99) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.99) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.99) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc <= 39.99) {
            return "Obesidade grau II";
        } else if (imc >= 40) {
            return "Obesidade grau III (obesidade mórbida)";
        }
        return null;
    }
}