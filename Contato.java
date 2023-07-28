package javabasico.aula36.relacionamentoclasses.Exercicios;

public class Contato {

    private String nomeContato;
    private String telefone;
    private String email;

    public String getNomeContato(){
        return this.nomeContato;
    }
    public void setNomeContato(String nomeContato){
        this.nomeContato = nomeContato;
    }

    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getAllInfos(){
        return ("Nome: "+this.nomeContato+", Email: "+ this.email + ", Telefone: "+ this.telefone);
    }
}
