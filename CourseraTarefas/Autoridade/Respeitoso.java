package Coursera.CourseraTarefas.Autoridade;

public class Respeitoso implements FormatadorNome{
    private char sexo;

    public Respeitoso(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public String formatarNome(String nome, String sobreNome) {
        if(this.sexo != 'M' && this.sexo != 'F' && this.sexo != 'm' && this.sexo != 'f'){
            return null;
        }else if(this.sexo == 'M' || this.sexo == 'm'){
            return "Sr. " + sobreNome;
        }else{
            return "Sra. " + sobreNome;
        }
    }
}
