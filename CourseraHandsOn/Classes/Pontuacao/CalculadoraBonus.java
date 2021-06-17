package CourseraHandsOn.Classes.Pontuacao;

public class CalculadoraBonus {
    private int multiplicacao = 1;

    public int bonusPontuacao(Usuario usuario){
        if(usuario.isVip()){
            multiplicacao = 5;
        }
        return multiplicacao;
    }
}
