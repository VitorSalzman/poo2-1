package game.observer;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FabricaDeInimigos {
    String filePath;
    
    private Inimigo inimigo1;
    private Inimigo inimigo2;
    private Inimigo inimigo3;
    private InimigoEsperto inimigo4;
    
    FabricaDeInimigos() {
        
        inimigo1 = new Inimigo(filePath + "\\src\\main\\java\\devil1.png", 500, -100);
        inimigo2 = new Inimigo(filePath + "\\src\\main\\java\\devil2.png", 300, -00);
        inimigo3 = new Inimigo(filePath + "\\src\\main\\java\\devil3.png", 400, -250);
        inimigo4 = new InimigoEsperto(filePath + "\\src\\main\\java\\devil3.png", 200, -250);

        try {
            File file = new File(".");
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FabricaDeInimigos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    public Inimigo criarInimigo(int tipoInimigo) {
        Inimigo inimigo = null;
        if (tipoInimigo == 1) {
            inimigo = (Inimigo) inimigo1.clone();
        } else if (tipoInimigo == 2) {
            inimigo = (Inimigo) inimigo2.clone();
        } else if (tipoInimigo == 3) {
            inimigo = (Inimigo) inimigo3.clone();
        }
        else if (tipoInimigo == 4) {
          inimigo = (Inimigo) inimigo4.clone();
        }
        return inimigo;
    }
    
}

   

