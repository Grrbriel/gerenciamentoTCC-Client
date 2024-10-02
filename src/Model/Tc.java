/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author gabriel
 */
public class Tc {
    public String aluno;
    public String titulo;
    public int etapa;
    public Date dataEntrega;
    public Date dataRevisao;
    public Date PrazoEntrega;

    @Override
    public String toString() {
        return titulo + " - "+aluno;
    }
}
