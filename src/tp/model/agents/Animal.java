package tp.model.agents;

import java.awt.Point;

/**
 * Cette classe modélise un Animal dans la simulation
 * @author bruno
 *
 */
public class Animal extends Agent{
	/** état de santé de l'animal */
	private Etat etat= Etat.Normal;
	private Sexe sexe;
	
	/* 
	 * constructeurs 
	 */
	
	public Animal(Sexe sexe, Point coord) {
		id = Animal.getUniqueId();
		this.sexe=sexe;
		super.coord=new Point(coord);
	
	}
	
	public Animal(Sexe sexe) {
		this(sexe, new Point(0, 0));

	}
	
	public Animal() {
		this(Sexe.Assexue);
	}
	
	/*
	 *  Accesseurs et mutateurs
	 */
	public Point getCoord() {
		return new Point(this.coord);
	}

	public void setCoord(Point coord) {
		this.coord = coord;
	}
	
	
	/*
	 * Redéfinitions de méthodes d'object
	 */
	@Override
	public String toString() {
        return super.toString() + this.sexe;
    }
		
	

	/* 
	 * comportements d'instance
	 */
	
	

	public void seDeplacer() {
		//TODO utiliser Math.random() pour choisir une direction de déplacement
	}
	
	public void vieillir() {
		this.age ++;
	}
	
	public void rencontrer(Animal a) {
		//TODO
	}
	
	/* comportements de classe */ 
	/**
	 * Renvoie un identifiant unique non encore utilisé
	 * @return un identifiant entier unique d'animal
	 */
	private static int getUniqueId() {
		//TODO 
		return 0;
	}
	
	public static void main(String args[]) {
		//tests unitaires de la classe Animal
		//TODO décommentez les lignes pour approfondir le test unitaire
		//complétez la méthode pour tester les nouvelles fonctionnalités que vous allez implémenter
		Animal a = new Animal();
		Animal b = new Animal(Sexe.Male);
		//Animal c = new Animal(Sexe.Assexue);
		Animal d = new Animal(Sexe.Femelle,new Point(25,30));
		Animal e = new Animal(Sexe.Femelle,new Point(25,30));
		
		/*
		 * les lignes suivantes doivent afficher à terme: NomDeLaClasse n° id_animal(sexe, (position x; position y)).
		 * ex: 28 (FEMELLE, (25;30))
		 */
		System.out.println("*** Animaux créés: **********");
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		System.out.println(d);
		
		System.out.println("*** Getters et setters **********");
		/*
		System.out.println(d.getSexe());
		Sexe ss = d.getSexe();
		ss=Sexe.Male;
		System.out.println(d.getSexe());
		*/
		//les lignes suivantes devraient afficher la même chose....
		/*
		System.out.println(d.getCoord());
		Point pt = d.getCoord();
		pt.x=50;
		System.out.println(d.getCoord());
		*/
		
		//TODO ajoutez vos propres tests de getters et setters
		
		//TODO test vieillir
		
		//TODO test seDeplacer
		
		//TODO test id
		/*
		System.out.println(a.getId());
		System.out.println(b.getId());
		*/
		
		/*
		 * Test comparaison
		 */
		/*
		System.out.println(d==e);
		System.out.println(d.equals(e));
		System.out.println("Bonjour"=="Bonjour");
		System.out.println("Bonjour".equals("Bonjour"));
		*/
	}

}
