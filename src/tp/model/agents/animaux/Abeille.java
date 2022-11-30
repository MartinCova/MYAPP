package tp.model.agents.animaux;

import java.awt.Point;

import javax.swing.plaf.TreeUI;

import tp.model.agents.Sexe;
import tp.model.agents.Animal;
import tp.model.comportements.Hebergeur;

public abstract class Abeille extends Animal implements Hebergeur {
    public boolean Heberge = false; // = il heberge un varroa
    public int MielQuantite = 0;

    public Abeille(Sexe sexe, Point coord) {
		super(sexe, coord);
	}


    public boolean peutAccueillir(Animal a){
        if ( a instanceof Varroa){
            if( this.Heberge == true){
                return false;
            }
            else{
                return true;
            }
        }
        return false;
    }


	public boolean accueillir(Animal a){
        this.Heberge = true;
        return true;
    }
}
