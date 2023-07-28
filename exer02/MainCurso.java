package javabasico.aula36.relacionamentoclasses.Exercicios.exer02;

import java.util.Locale;
import java.util.Scanner;

public class MainCurso {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        Curso curso = new Curso();

        curso.setNomeCurso("Programacao");
        curso.setHorario("Manhã");

        // instanciando a classe professor

        Professor professor1 = new Professor();
        professor1.setNomeProfessor("João Oliveira");
        professor1.setDepartamento("Tecnologia da informação");
        professor1.setEmail("joao@gmail.com");

        // adicionando professor1 ao curso

        curso.setProfessorCurso(professor1);

        // settando os Alunos[] (serão 5 alunos no total)
        // settando Aluno 01
        Aluno aluno01 = new Aluno();
        double[] notasAluno01 = new double[4];

        aluno01.setNomeAluno("José Silva");
        aluno01.setMatricula("001");

        for(int i = 0; i<notasAluno01.length; i++){
            System.out.println("Digite a "+ (i+1) + " nota de " + aluno01.getNomeAluno());
            notasAluno01[i] = scan.nextDouble();
        }
        aluno01.setNotas(notasAluno01);
        // settando Aluno 02

        Aluno aluno02 = new Aluno();
        double[] notasAluno02 = new double[4];

        aluno02.setNomeAluno("Maria Souza");
        aluno02.setMatricula("002");

        for(int i = 0; i<notasAluno02.length; i++){
            System.out.println("Digite a "+ (i+1) + " nota de " + aluno02.getNomeAluno());
            notasAluno02[i] = scan.nextDouble();
        }
        aluno02.setNotas(notasAluno02);
        // settando Aluno 03

        Aluno aluno03 = new Aluno();
        double[] notasAluno03 = new double[4];

        aluno03.setNomeAluno("Rafael Lima");
        aluno03.setMatricula("003");

        for(int i = 0; i<notasAluno03.length; i++){
            System.out.println("Digite a "+ (i+1) + " nota de " + aluno03.getNomeAluno());
            notasAluno03[i] = scan.nextDouble();
        }
        aluno03.setNotas(notasAluno03);

        // settando Aluno 04

        Aluno aluno04 = new Aluno();
        double[] notasAluno04 = new double[4];

        aluno04.setNomeAluno("Daniela Martins");
        aluno04.setMatricula("004");

        for(int i = 0; i<notasAluno04.length; i++){
            System.out.println("Digite a "+ (i+1) + " nota de " + aluno04.getNomeAluno());
            notasAluno04[i] = scan.nextDouble();
        }
        aluno04.setNotas(notasAluno04);

        // settando Aluno 05

        Aluno aluno05 = new Aluno();
        double[] notasAluno05 = new double[4];

        aluno05.setNomeAluno("Francisco Júnior");
        aluno05.setMatricula("005");

        for(int i = 0; i<notasAluno05.length; i++){
            System.out.println("Digite a "+ (i+1) + " nota de " + aluno05.getNomeAluno());
            notasAluno05[i] = scan.nextDouble();
        }
        aluno05.setNotas(notasAluno05);

        System.out.println("Exibindo todas as informações sobre os alunos");
        for(int i = 0; i<4; i++){
            System.out.println(aluno01.getNomeAluno()+" nota"+(i+1)+ "= "+aluno01.getNotas()[i]);
        }
        for(int i = 0; i<4; i++){
            System.out.println(aluno02.getNomeAluno()+" nota"+(i+1)+ "= "+aluno02.getNotas()[i]);
        }
        for(int i = 0; i<4; i++){
            System.out.println(aluno03.getNomeAluno()+" nota"+(i+1)+ "= "+aluno03.getNotas()[i]);
        }
        for(int i = 0; i<4; i++){
            System.out.println(aluno04.getNomeAluno()+" nota"+(i+1)+ "= "+aluno04.getNotas()[i]);
        }
        for(int i = 0; i<4; i++){
            System.out.println(aluno05.getNomeAluno()+" nota"+(i+1)+ "= "+aluno05.getNotas()[i]);
        }


        System.out.println(aluno01.estaAprovado(notasAluno01));
        System.out.println(aluno02.estaAprovado(notasAluno02));
        System.out.println(aluno03.estaAprovado(notasAluno03));
        System.out.println(aluno04.estaAprovado(notasAluno04));
        System.out.println(aluno05.estaAprovado(notasAluno05));
    }
}
