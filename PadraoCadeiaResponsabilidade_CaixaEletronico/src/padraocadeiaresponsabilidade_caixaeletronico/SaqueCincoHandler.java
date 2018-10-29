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
public class SaqueCincoHandler extends AbstractSaqueHandler{
    public SaqueCincoHandler(){
        super(Saque.CINCO);
    }

    
    @Override
    public void write() { 
        System.out.println("+1 nota de cinco");
      
    }
}
