/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposPokemon;

import pokemon.TipoPokemon;
import pokemon.Pokemon;

/**
 *
 * @author ice
 */
public class TipoPlanta extends Pokemon implements TipoPokemon {

   
    @Override
    public void vantagem() { // retornar array list (lita de tipos, pokemon)
         // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
         vantagens[0] = 0; vantagens[1]= 4;
    }

    @Override
    public void fraquesas() {
        // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        fraquesas[0] = 2;
    }
    
}
