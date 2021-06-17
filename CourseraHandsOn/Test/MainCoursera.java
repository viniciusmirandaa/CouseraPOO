package CourseraHandsOn.Test;

import CourseraHandsOn.Classes.Carro.Carro;
import CourseraHandsOn.Classes.Compra.Compra;
import CourseraHandsOn.Classes.Escola.Aluno;
import CourseraHandsOn.Classes.Pontuacao.CalculadoraBonus;
import CourseraHandsOn.Classes.Pontuacao.RegistroPontos;
import CourseraHandsOn.Classes.Pontuacao.Usuario;
import CourseraHandsOn.Classes.Somador.Somador;

public class MainCoursera {
    public static void main(String[] args) {

        //Hands-on carro
        Carro gol = new Carro(2, 150, "Gol");
        gol.setPotenciaVelocidade(3, 140);
        //------------------------------------------------------

        //Hands-on compra, utilizando construtor
        Compra c1 = new Compra(4, 250);
        int aux = c1.getValorTotal();
        System.out.println("O valor total da compra é: " + aux);
        //------------------------------------------------------

        //Hands-on Pontuação
        Usuario user1 = new Usuario("Vinicius", true);
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos registroPontos = new RegistroPontos(cb);
        registroPontos.criarUmTopico(user1);
        registroPontos.fazerComentario(user1);
        registroPontos.deixouUmLike(user1);
        System.out.println("O total de pontos do usuário é de: " + registroPontos.getPontosUsuario(user1));
        //------------------------------------------------------

        //Hands-on atributos estáticos e de instância
        Somador s1 = new Somador();
        Somador s2 = new Somador();
        Somador s3 = new Somador();

        for (int i = 0; i < 3; i++) {
            s1.somar();
            s2.somar();
            s3.somar();
        }

        s1.imprimir();
        s2.imprimir();
        s3.imprimir();
        //------------------------------------------------------
        
        //Hands-on de Funções para Métodos
        Aluno aluno = new Aluno(80, 60, 70, 70);

        //
    }
}
