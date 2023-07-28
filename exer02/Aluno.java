package javabasico.aula36.relacionamentoclasses.Exercicios.exer02;

public class Aluno {
    private String nomeAluno;
    private String matricula;
    private double[] notas;

    public String getNomeAluno(){
        return this.nomeAluno;
    }
    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double[] getNotas(){
        return this.notas;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public String estaAprovado(double[] notas){
        notas = this.notas;
        double somatorio = 0;
        for(int i = 0; i<notas.length; i++){
            somatorio += notas[i];
        }
        double media = somatorio / notas.length;
        if(media>=7){
            return (this.nomeAluno + " Está aprovado com média = " + media);
        }else{
            return (this.nomeAluno + " Não está aprovado. Média = " + media);
        }
    }

}
