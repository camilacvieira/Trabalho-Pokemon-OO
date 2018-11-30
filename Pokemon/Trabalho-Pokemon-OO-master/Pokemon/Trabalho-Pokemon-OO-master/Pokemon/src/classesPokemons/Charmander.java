package classesPokemons;
import pokemon.Pokemon;
import tiposPokemon.TipoFogo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Charmander extends TipoFogo {

    public Charmander() {
        nome = "Charmander";
        nomeTipo = "Fogo";
        tipo = 2; // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        habilidades[0] = "Flamethrower"; habilidades[1] = "Flame Burst"; habilidades[2] = "Ember";
    }
    
  
    
}
