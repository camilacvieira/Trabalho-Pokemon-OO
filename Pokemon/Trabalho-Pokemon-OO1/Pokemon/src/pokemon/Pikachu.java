package pokemon;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Pikachu extends Pokemon implements TipoPokemon {

    public Pikachu() {
        nome = "Pikachu";
    }
    public void tipo1() {
        nomeTipo1 = "Eletrico";
        tipo1 = 0;
    }
    public void tipo2() {
        nomeTipo2 = null;
        tipo2 = -1;
    }
    
    public ArrayList vantagem() {
        ArrayList <String> vantagem = new ArrayList();
        if(tipo2 == -1){
            int i = tipo1;
            for(int j=0 ; j<3 ; j++){
                vantagem.add(0,vantagens[i][j]);
            }
        }
        else{
            int i = tipo1;
            for(int j=0 ; j<3 ; j++){
                vantagem.add(j,vantagens[i][j]);
            }
            i = tipo2;
            for(int j=0,k=3 ; j<3 && k<6 ; j++){
                vantagem.add(k,vantagens[i][j]);
            }
        }
            
        return vantagem;
    }
    
    public ArrayList fraquesas(){
        
    }
        
    
}
