/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocadeiaresponsabilidade_caixaeletronico;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 20161bsi0403
 */
public class PadraoCadeiaResponsabilidade_CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractSaqueHandler cem = new SaqueCemHandler();
        AbstractSaqueHandler cinquenta = new SaqueCinquentaHandler();
        AbstractSaqueHandler vinte = new SaqueVinteHandler();
        AbstractSaqueHandler dez = new SaqueDezHandler();
        AbstractSaqueHandler cinco = new SaqueCincoHandler();
        
        /*int valor = 115;
        
        if (valor % 100 == 0){
            
            
        }*/
        cem.setProximaOpcao(cinquenta);
        cinquenta.setProximaOpcao(vinte);
        vinte.setProximaOpcao(dez);
        dez.setProximaOpcao(cinco);
        
        cem.saqueHandler(AbstractSaqueHandler.Saque.CEM);
        
    }
    
}
