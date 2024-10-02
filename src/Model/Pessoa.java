/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author gabriel
 */
public class Pessoa {
    public String matricula;
    public String nome;
    public String senha;
    public int funcao;
    public int coordenador;

    public Pessoa(String matricula, String nome, String senha, int funcao, int coordenador) {
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
        this.funcao = funcao;
        this.coordenador = coordenador;
    }

    public Pessoa() {
    }

    @Override
    public String toString() {
        return matricula; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
