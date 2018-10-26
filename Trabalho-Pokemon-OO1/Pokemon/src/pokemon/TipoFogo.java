/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class TipoFogo extends Pokemon implements TipoPokemon {

    
    
    @Override
    public ArrayList vantagem() { // retornar array list (lita de tipos, pokemon)
        ArrayList vantagens = new ArrayList();
        vantagens.add(0,1);
        
        return vantagens;
    }

    @Override
    public ArrayList fraquesas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
