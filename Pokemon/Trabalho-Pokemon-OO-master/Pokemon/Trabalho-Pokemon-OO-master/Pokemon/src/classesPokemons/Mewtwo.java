package classesPokemons;
import pokemon.Pokemon;
import tiposPokemon.TipoPsiquico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Mewtwo extends TipoPsiquico {

    public Mewtwo() {
        nome = "Mewtwo";
             nomeTipo="Psiquico";
          tipo = 6;   // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        //habilidades[0] = ""; habilidades[1] = ""; habilidades[2] = "";
        habilidades[0] ="Confusion";
        habilidades[1]="Psychic";
        habilidades[2]="FocusBlast";
    }
    
  
    
}
