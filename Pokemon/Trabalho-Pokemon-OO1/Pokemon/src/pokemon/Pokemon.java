package pokemon;
import java.util.ArrayList;

public abstract class Pokemon {
	
        String nome;
        String nomeTipo1;
        String nomeTipo2;
        int tipo1;
        int tipo2;
	int evolucao;
	String habilidade1;
	String habilidade2;
	String habilidade3;
	int manaPoints;
	int healthPoints;
	int strength;
	int armorClass;
       
        ArrayList desvantagens;
        // 0-Pokem Tipo Grama
        String [][]vantagens = { {"Dragão", "Eletrico", "Agua"}
                                 
                                
                                
                                
                                };
        
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
        
}
