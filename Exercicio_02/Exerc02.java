/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.lista03.exerc02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leogo
 */
public class Exerc02 {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner bat = new Scanner(System.in);
        Pessoa p = new Pessoa();
        Automovel a = new Automovel();
        ArrayList<Pessoa> pessoa = new ArrayList();

        while (opcao != 6) {
            System.out.println("---Escolha um Numero---");
            System.out.println("1 - Adicionar Pessoa ");
            System.out.println("2 - Adicionar Automovel ");
            System.out.println("3 - Transferir Automóvel ");
            System.out.println("4 - Mostrar Todas as Pessoas");
            System.out.println("5 - 5 – Mostrar automóvel da pessoa");
            System.out.println("6 - Sair");
            opcao = Integer.parseInt(bat.next());

            switch (opcao) {
                case 1:
                    System.out.println("Digite o Codigo: ");
                    p.setCodigo(bat.nextInt());
                    System.out.println("Digite o Nome: ");
                    p.setNome(bat.next());

                    pessoa.add(p);
                    break;

                case 2:
                    System.out.println("Digite a Marca do Automovel: ");
                    a.setMarca(bat.next());
                    System.out.println("Digite o Modelo do Automovel: ");
                    a.setModelo(bat.next());
                    System.out.println("Qual Pessoa é esse Automovel? ");
                    for (int i = 0; i < pessoa.size(); i++) {
                        System.out.println((i + 1) + " - " + pessoa.get(i).getNome());
                    }
                    int index = bat.nextInt() - 1;
                    pessoa.get(index).inserirAutomovel(a);
                    break;
                case 3:
                    System.out.println("Selecione o primero Dono(Dono Atual) ");
                    for (int i = 0; i < pessoa.size(); i++) {
                        System.out.println((i + 1) + " - " + pessoa.get(i).getNome());
                    }
                    int donoAtual = bat.nextInt() - 1;

                    Pessoa pessoaAtual = pessoa.get(donoAtual);

                    System.out.println("Selecione o Automovel ");
                    ArrayList<Automovel> automoveis = pessoaAtual.getAutomoveis();
                    for (int i = 0; i < automoveis.size(); i++) {
                        System.out.println((i + 1) + " - " + automoveis.get(i).imprimir());
                    }
                    int indice = bat.nextInt() - 1;

                    Automovel transferencia = automoveis.get(indice);

                    System.out.println("Selecione o Novo Dono ");
                    for (int i = 0; i < pessoa.size(); i++) {
                        if (i != donoAtual) {
                            System.out.println((i + 1) + " - " + pessoa.get(i).getNome());
                        }
                    }
                    int novoDono = bat.nextInt() - 1;

                    Pessoa pessoaNova = pessoa.get(novoDono);
                    pessoaAtual.removerAutomovel(indice);
                    pessoaNova.inserirAutomovel(transferencia);
                    break;
                case 4:
                    for (Pessoa pessoas : pessoa) {
                        System.out.println(p.imprimir());

                    }
                    break;
                case 5:
                    System.out.println("Selecione uma Pessoa ");
                    for (int i = 0; i < pessoa.size(); i++) {
                        System.out.println((i + 1) + " - " + pessoa.get(i).getNome());
                    }
                    int indicePA = bat.nextInt() - 1;

                    Pessoa Pa = pessoa.get(indicePA);

                    ArrayList<Automovel> autop = Pa.getAutomoveis();
                    System.out.println("Automovel da Pessoa");
                    for (int i = 0; i < autop.size(); i++) {
                        System.out.println((i + 1) + " - " + autop.get(i).imprimir());
                    }
                    break;

                case 6:
                    System.out.println("O programa sera fechado!");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }

        }
    }
}
