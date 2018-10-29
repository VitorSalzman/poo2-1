/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocadeiaresponsabilidade_caixaeletronico;

/**
 *
 * @author 20161bsi0403
 */
public class SaqueDezHandler extends AbstractSaqueHandler{
    public SaqueDezHandler(){
        super(Saque.DEZ);
    }

    
    
    @Override
    public void write() { 
        
        System.out.println("+1 nota de dez");
      
    }
}
