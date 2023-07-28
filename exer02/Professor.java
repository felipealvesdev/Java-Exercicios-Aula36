package javabasico.aula36.relacionamentoclasses.Exercicios.exer02;

public class Professor {
    private String nomeProfessor;
    private String departamento;
    private String email;

    public String getNomeProfessor(){
        return this.nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }

    public String getDepartamento(){
        return this.departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
