package tp.model.agents.animaux;

import tp.model.agents.Animal;
import tp.model.comportements.Hebergeur;

public abstract class Abeille extends Animal implements Hebergeur {


    public boolean peutAccueillir(Animal a){
        if ( a instanceof Abeille){
            return true;
        }
        return false;
    }


	public boolean accueillir(Animal a){
        return true;
    }
}
