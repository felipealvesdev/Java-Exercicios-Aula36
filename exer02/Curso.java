package javabasico.aula36.relacionamentoclasses.Exercicios.exer02;

public class Curso {
    private String nomeCurso;
    private String horario;
    private Professor professorCurso;
    private Aluno[] alunos;

    public String getNomeCurso(){
        return this.nomeCurso;
    }
    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public String getHorario(){
        return this.horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }

    public Professor getProfessorCurso(){
        return this.professorCurso;
    }
    public void setProfessorCurso(Professor professorCurso){
        this.professorCurso = professorCurso;
    }

    public Aluno[] getAlunos(){
        return this.alunos;
    }
    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }
}
