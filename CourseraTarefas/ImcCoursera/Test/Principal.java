package CourseraTarefas.ImcCoursera.Test;

import CourseraTarefas.ImcCoursera.Classes.Paciente;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso do primeiro paciente: (ex.: 69,2)");
        double peso = input.nextDouble();
        System.out.println("Digite a altura do primeiro paciente: (ex.: 1,70)");
        double altura = input.nextDouble();
        Paciente paciente1 = new Paciente(peso, altura);
//        System.out.println("Digite o peso do segundo paciente: (ex.: 69,2)");
//        peso = input.nextDouble();
//        System.out.println("Digite a altura do segundo paciente: (ex.: 1,70)");
//        altura = input.nextDouble();
//        Paciente paciente2 = new Paciente(peso, altura);
//        System.out.println("Digite o peso do terceiro paciente: (ex.: 69,2)");
//        peso = input.nextDouble();
//        System.out.println("Digite a altura do terceiro paciente: (ex.: 1,70)");
//        altura = input.nextDouble();
//        Paciente paciente3 = new Paciente(peso, altura);

        System.out.println("O IMC do primeiro paciente é: " + paciente1.diagnostico());
//        System.out.println("O IMC do segundo paciente é: " + paciente2.diagnostico());
//        System.out.println("O IMC do terceiro paciente é: " + paciente3.diagnostico());
    }
}
