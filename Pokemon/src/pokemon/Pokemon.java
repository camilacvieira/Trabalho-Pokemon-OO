package pokemon;

import java.util.ArrayList;

public abstract class Pokemon {
	
        public String nome;
	public String tipo;
        public int evolucao;
	public String[] habilidades = new String[3];
        public float[] multiHabilidades = new float[3];
	public int manaPoints;
	public int healthPoints;
	public int strength;
	public int armorClass;
       
        // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        public int[] vantagens; 
        public int[] fraquesas;

    
        
        
        
}
