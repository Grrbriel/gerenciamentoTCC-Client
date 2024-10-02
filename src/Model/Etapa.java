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
public class Etapa {
    public int Codigo;
    public String DescEtapa;
    public Date PrazoEntrega;
    public Date PrazoRevisao;

    @Override
    public String toString() {
        return Codigo+" - "+DescEtapa;
    }
    
    
    
}
