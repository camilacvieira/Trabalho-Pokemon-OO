/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Time {
    
    private ArrayList<Pokemon> pokemons = new ArrayList();

    public Time(Pokemon p1, Pokemon p2, Pokemon p3) {
        pokemons.add(p1);
        pokemons.add(p2);
        
        pokemons.add(p3);
    }
    
}
