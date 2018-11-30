/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arthur
 */
public class Treinador {
    private float vidaTotal;    
    private Time t = new Time();
	
	public Treinador(Time t) {
            this.t = t;
            vidaTotal = t.pokemons.get(0).healthPoints + t.pokemons.get(1).healthPoints + t.pokemons.get(2).healthPoints;
		
	}
        
        public void calculaVida(){
            vidaTotal = t.pokemons.get(0).healthPoints + t.pokemons.get(1).healthPoints + t.pokemons.get(2).healthPoints;
        }
	
    
}
