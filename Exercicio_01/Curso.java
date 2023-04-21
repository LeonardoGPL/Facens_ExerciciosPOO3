/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.lista03;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author leogo
 */
public class Curso {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codigo;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + this.cargaHoraria;
        hash = 17 * hash + Objects.hashCode(this.alunos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.cargaHoraria != other.cargaHoraria) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.alunos, other.alunos);
    }
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos = new ArrayList();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public Curso(){
        
    }

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    public void inserirAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public void removerAluno(int index){
    this.alunos.remove(index);
}
    public String imprimir(){
        return "Codigo " + this.codigo +
                "\nNome " + this.nome +
                "\nCarga Horaria " + this.cargaHoraria + "\n";
    }
    public String imprimirCompleto(){
        String retorno = imprimir();
        for (Aluno aluno : alunos){
            retorno+=aluno.imprimir();
            
        }
        return retorno;
    }
}
