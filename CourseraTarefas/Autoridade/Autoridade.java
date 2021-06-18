package Coursera.CourseraTarefas.Autoridade;

public class Autoridade{
    private String nome;
    private String sobreNome;
    FormatadorNome formatadorNome;

    public Autoridade(String nome, String sobreNome, FormatadorNome formatadorNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.formatadorNome = formatadorNome;
    }

    public void getTratamento(){
        formatadorNome.formatarNome(nome, sobreNome);
    }
}
