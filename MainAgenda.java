package javabasico.aula36.relacionamentoclasses.Exercicios;

import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Agenda agenda1 = new Agenda();


        System.out.println("Por favor, insira um nome para sua nova agenda:");
        agenda1.setNomeAgenda(scan.nextLine());

        System.out.println("O nome de agenda1 é: "+agenda1.getNomeAgenda());


        Contato contato1 = new Contato();
        System.out.println("Por favor, insira o nome do primeiro contato:");
        contato1.setNomeContato(scan.nextLine());
        System.out.println("Por favor, insira o número de telefone para "+contato1.getNomeContato());
        contato1.setTelefone(scan.nextLine());
        System.out.println("Por favor, insira um email para o contato " + contato1.getNomeContato());
        contato1.setEmail(scan.nextLine());

        Contato contato2 = new Contato();

        System.out.println("Por favor, insira o nome do segundo contato:");
        contato2.setNomeContato(scan.nextLine());
        System.out.println("Por favor, insira um número de telefone para "+ contato2.getNomeContato());
        contato2.setTelefone(scan.nextLine());
        System.out.println("Por favor, insira um email para o contato " + contato2.getNomeContato());
        contato2.setEmail(scan.nextLine());

        Contato contato3 = new Contato();

        System.out.println("Por favor, insira o nome do terceiro contato:");
        contato3.setNomeContato(scan.nextLine());
        System.out.println("Por favor, insira um número de telefone para "+ contato3.getNomeContato());
        contato3.setTelefone(scan.nextLine());
        System.out.println("Por favor, insira um email para o contato " + contato3.getNomeContato());
        contato3.setEmail(scan.nextLine());

// CRIANDO UM ARRAY COM TODOS OS CONTATOS NELE
        Contato[] contatos = new Contato[3];

        contatos[0] = contato1;
        contatos[1] = contato2;
        contatos[2] = contato3;
// AGORA, ADICIONANDO O ARRAY DE CONTATOS NO SETTER DE CONTATOS NA AGENDA

        agenda1.setContatos(contatos);

        System.out.println("");
        if(agenda1 != null && agenda1.getContatos()!=null){
            for(int i = 0; i<agenda1.getContatos().length;i++){
                System.out.println("Informações sobre o "+ (i+1) +"º contato em " + agenda1.getNomeAgenda());
                System.out.println(agenda1.getContatos()[i].getNomeContato());
                System.out.println(agenda1.getContatos()[i].getEmail());
                System.out.println(agenda1.getContatos()[i].getTelefone());
                System.out.println("-----------------------------------------");
            }
        }
        // mostrando as informaçoes de cada contato em apenas uma linha
        if(agenda1 != null && agenda1.getContatos()!=null) {
            System.out.println("Exbindo as informacoes em apenas um");
            for (int i = 0; i < agenda1.getContatos().length; i++) {
                System.out.println("Informações sobre o contato " + (i + 1));
                System.out.println(agenda1.getContatos()[i].getAllInfos());
                System.out.println("-------------------------");
            }
        }

        System.out.print("Todos os contatos de " + agenda1.getNomeAgenda() +" estão sendo exibidos acima.");
    }
}
