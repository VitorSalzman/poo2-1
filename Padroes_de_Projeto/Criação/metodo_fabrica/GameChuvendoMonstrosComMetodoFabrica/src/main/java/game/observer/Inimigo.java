
package game.observer;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author felipe
 */
    public class Inimigo extends PersonagemPadrao implements Observador, Cloneable{
        
    
    public Inimigo(String pathImage, int posX, int posY) {
        super(pathImage, posX, posY);
    }
    
    public Object clone() throws CloneNotSupportedException{
        Inimigo enemy = (Inimigo) super.clone();
        return enemy;
    }
    @Override
    public void update(Observavel ob) {
        moveInimigo((Heroi) ob);
    }
    private void moveInimigo(Heroi heroi){        
        
        if(this.posY >= 400){
            this.posY = -20;
            this.posX = ThreadLocalRandom.current().nextInt(0, 640);
        }
        else{
            this.posY = this.posY + 5;            
        }                        
    }
}
