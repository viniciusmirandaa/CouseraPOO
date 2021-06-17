package CourseraHandsOn.Classes.Pontuacao;

public class RegistroPontos {
    CalculadoraBonus bonus;

    public RegistroPontos(CalculadoraBonus cb) {
        bonus = cb;
    }

    public void fazerComentario(Usuario usuario) {
        usuario.pontos = (usuario.pontos + 1) * bonus.bonusPontuacao(usuario);
    }

    public void criarUmTopico(Usuario usuario) {
        usuario.pontos = (usuario.pontos + 2) * bonus.bonusPontuacao(usuario);
    }

    public void deixouUmLike(Usuario usuario) {
        usuario.pontos = (usuario.pontos + 3) * bonus.bonusPontuacao(usuario);
    }

    public int getPontosUsuario(Usuario usuario){
        return usuario.pontos;
    }
}
