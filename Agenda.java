package javabasico.aula36.relacionamentoclasses.Exercicios;

public class Agenda {

    private String nomeAgenda;
    private Contato[] contatos;

    public String getNomeAgenda(){
        return this.nomeAgenda;
    }
    public void setNomeAgenda(String nomeAgenda){
        this.nomeAgenda = nomeAgenda;
    }

    public Contato[] getContatos(){
        return this.contatos;
    }
    public void setContatos(Contato[] contatos){
        this.contatos = contatos;
    }


}
