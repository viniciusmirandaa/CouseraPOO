package CourseraHandsOn.Classes.Escola;

public class Aluno {

    private int primeiroBim;
    private int segundoBim;
    private int terceiroBim;
    private int quartoBim;

    public Aluno(int primeiroBim, int segundoBim, int terceiroBim, int quartoBim) {
        this.primeiroBim = primeiroBim;
        this.segundoBim = segundoBim;
        this.terceiroBim = terceiroBim;
        this.quartoBim = quartoBim;
        System.out.println(aprovado());
    }

    private int media(){
        int total = 0;
        total += primeiroBim;
        total += segundoBim;
        total += terceiroBim;
        total += quartoBim;
        return total / 4;
    }

    private String aprovado(){
         if(media() > 60){
             return "O aluno foi aprovado";
         }
         return "O aluno foi reprovado";
    }
}
