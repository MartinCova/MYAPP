package tp.model.agents;

import java.awt.Point;

public class Agent {
    	/* attributs de classe */
	private static int currentId = 0;
	
	/* attributs d'instance*/
	/** identifiant unique de l'agent*/
	protected int id;
	/** age en unité de temps*/
	protected int age;
	/** position sur la carte*/
	protected Point coord;

	public Agent(Point coord) {
		this.id = Agent.getUniqueId();
		this.coord= new Point(coord);
		this.age = 0;
	}
	
	public Agent() {
		this(new Point(0,0));
	}

	
	/*
	 *  Accesseurs et mutateurs
	 */
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age++;
	}

	/*
	 * Redéfinitions de méthodes d'object
	 */
	@Override
	public String toString() {
        return this.getClass().getSimpleName() +" " + Integer.toString(this.id) + "(" + Integer.toString(this.coord.x)
		+";" + Integer.toString(this.coord.y) + "), ";
    }
	

	/* 
	 * comportements d'instance
	 */

	
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
		return currentId++;
	}
}
