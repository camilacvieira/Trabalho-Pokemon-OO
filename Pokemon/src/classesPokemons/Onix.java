package classesPokemons;
import pokemon.Pokemon;
import tiposPokemon.TipoPedra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Onix extends TipoPedra {

    public Onix() {
        nome = "Onix";
        nomeTipo ="Pedra";
          tipo = 4;   // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        //habilidades[0] = ""; habilidades[1] = ""; habilidades[2] = "";
        habilidades[0] ="RockThrow";
        habilidades[1]="HeavySlam";
        habilidades[2]="StoneEdge";
        
    }
    
  
    
}
