package classesPokemons;
import pokemon.Pokemon;
import tiposPokemon.TipoPlanta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Venossauro extends TipoPlanta {

    public Venossauro() {
        nome = "Venossauro";
             nomeTipo="Planta";
          tipo = 5;   // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        //habilidades[0] = ""; habilidades[1] = ""; habilidades[2] = "";
        habilidades[0] ="VineWhip";
        habilidades[1]="FrenzyPlant";
        habilidades[2]="RazorLeaf";
    }
    
  
    
}
