package launchers;

import java.awt.Point;

/* import tp.model.agents.Agent; */
import tp.model.agents.Animal;
import tp.model.agents.Sexe;
import tp.model.agents.animaux.AbeilleDomestique;
import tp.model.agents.animaux.AbeilleSolitaire;
import tp.model.agents.animaux.Varroa;


public class LauncherTP2 {
	
	public static void main(String [] args){
		AbeilleDomestique a = new AbeilleDomestique(Sexe.Femelle, new Point(25,30));
		AbeilleSolitaire b = new AbeilleSolitaire(Sexe.Male, new Point(10,10));
		Varroa c = new Varroa(Sexe.Assexue, new Point(20,20));

		System.out.println(a);
		((Animal)a).seDeplacer();
		System.out.println(a);

		
		System.out.println(a.peutAccueillir(b));
		System.out.println(a.peutAccueillir(c));

	}

}
