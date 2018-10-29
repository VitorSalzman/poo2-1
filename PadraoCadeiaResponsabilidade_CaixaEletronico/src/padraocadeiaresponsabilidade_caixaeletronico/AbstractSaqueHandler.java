/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocadeiaresponsabilidade_caixaeletronico;

import java.util.List;

/**
 *
 * @author 20161bsi0403
 */
public abstract class AbstractSaqueHandler {
    public Saque tiposaque;
    
    public AbstractSaqueHandler proximaOpcao;    
    public enum Saque { CEM, CINQUENTA, VINTE, DEZ, CINCO }
    public AbstractSaqueHandler(Saque tiposaque) {
        this.tiposaque = tiposaque;
    }
    public void setProximaOpcao(AbstractSaqueHandler proximaOpcao) {
        this.proximaOpcao = proximaOpcao;
    
    }        
    
    public void saqueHandler(Saque opcao){
        if (tiposaque == opcao) {
            write("Opção escolhida:");}
        else {proximaOpcao.saqueHandler(opcao);}        
    }    
    public abstract void write(String message);
}
