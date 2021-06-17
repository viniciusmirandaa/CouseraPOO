package CourseraHandsOn.Classes.Pontuacao;

public class Usuario {
    private String nome;
    private boolean vip;
    int pontos = 1;

    public Usuario(String nome, boolean vip) {
        this.nome = nome;
        this.vip = vip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
