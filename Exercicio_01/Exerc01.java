package poo.lista03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner bat = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList();

        while (opcao != 6) {
            System.out.println("Escolha um numero!");
            System.out.println("1 - Criar Curso");
            System.out.println("2 - Criar Aluno (Perguntar os dados do aluno e escolher o curso)");
            System.out.println("3 - Remover aluno");
            System.out.println("4 - Mostrar todos os Cursos");
            System.out.println("5 - Mostrar Aluno do Curso");
            System.out.println("6 - Sair");
            opcao = Integer.parseInt(bat.next());

            switch (opcao) {
                case 1:
                    Curso c = new Curso();
                    System.out.println("Digite o nome do Curso");
                    c.setNome(bat.next());
                    System.out.println("Digite o Codigo do Curso");
                    c.setCodigo(Integer.parseInt(bat.next()));
                    System.out.println("Digite a Carga Horaria do Curso");
                    c.setCargaHoraria(Integer.parseInt(bat.next()));
                    
                    break;
                case 2:
                    Aluno a = new Aluno();
                    System.out.println("Digite o RA");
                    a.setRa(bat.next());
                    System.out.println("Digite o Nome");
                    a.setNome(bat.next());
                    System.out.println("Selecione o Curso");
                    for (int i = 0; i < cursos.size();i++) {
                        int x = i+1;
                        System.out.println(x + " - " + cursos.get(i).getNome());
                    }
                    int opcaoDeCurso = Integer.parseInt(bat.next());
                    cursos.get(opcaoDeCurso - 1).setAlunos(a);
                    break;
                case 3:
                    System.out.println("Digite o nome do aluno a ser removido");
                    String nomeAlunoRemover = bat.next();
                    for (Curso curso : cursos) {
                         for (int i = 0; i < curso.getAlunos().size(); i++) {
                             if(nomeAlunoRemover.equals(curso.getAlunos().get(i).getNome())){
                                 curso.removerAluno(i);
                             }
                         }
                    }
                    break;
                case 4:
                     for (Curso curso : cursos) {

                         System.out.println(curso.imprimir());
                    }
                    break;
                case 5:
                    for (Curso curso : cursos) {
                        System.out.println(curso.imprimirCompleto());
                        
                    }
                    break;
                case 6:
                    System.out.println("O programa sera fechado!");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        }
        bat.close();
    }
}
