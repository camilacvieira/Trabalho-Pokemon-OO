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
    private ArrayList<Pokemon> time;
	
	public Treinador(Pokemon pokemon) {
		time = new ArrayList<Pokemon>();
		time.add(pokemon);
	}
	
	public void addPokemon(Pokemon pokemon) {
		
			time.add(pokemon);          
	}
	
	public Pokemon getPokemon(int index) {
		return time.get(index);
	}
	
	public int getTimeSize() {
		return time.size();
	}

    
}
