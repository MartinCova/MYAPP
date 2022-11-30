package tp.model.agents.vegetaux;

import tp.model.agents.Vegetal;
import tp.model.comportements.Hebergeur;
import tp.model.agents.Animal;

public class Arbre extends Vegetal implements Hebergeur {

    public boolean peutAccueillir(Animal a){
        return true;
    }


	public boolean accueillir(Animal a){
        return true;
    }
    
}
