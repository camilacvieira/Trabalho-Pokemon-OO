package pokemon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Pikachu extends Pokemon implements TipoPokemon{

    public Pikachu() {
        nome = "Pikachu";
        
    }
    
    public void tipo1(){
        tipo1 = "eletrico";
    }
    
    public void tipo2(){
        tipo2 = null;
    }
    
    public void vantagem(){
        vantagens.add(0,"agua");
        vantagens.add(1,"voador");
    }
    
    public void fraquesas(){
        fraquesas.add(0,"terrestre");
        fraquesas.add(1,"planta");
        fraquesas.add(2,"dragao");
    }
    
}
