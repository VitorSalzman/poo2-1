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
public class SaqueCemHandler extends AbstractSaqueHandler{
    
    
    public SaqueCemHandler(){
        super(Saque.CEM);
    }

   
    
    @Override
    public void write(String message) { 
        System.out.println(message);
        System.out.println("+1 nota de cem");
      
    }
    
}
