/** package principal */
package main;

import java.io.File;
import java.util.ArrayList;

import librairies.StdDraw;
import ressources.Affichage;
import ressources.AssociationTouches;
import ressources.Config;

public class Jeu {
	
	protected ArrayList<Room> list_of_rooms;
	protected Hero hero;
	protected ArrayList<Monster> list_of_monsters;
	protected ArrayList<Card> list_of_cards;



	public Jeu() throws Exception {
	}

	public boolean isOver() {
		return false;
	}


	public GroupofMonsters select3Monsters() {
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		/* 
		 * add 3 monsters to the list
		 */

		return new GroupofMonsters(monsters);
	}

	public GroupofMonsters selectBoss() {
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		/* 
		 * add 1 boss to the list
		 */

		return new GroupofMonsters(monsters);
	}


	public Room selectNextRoom(Room currentRoom) {
		RecoveryRoom RecoveryRoom = new  RecoveryRoom("pictures" + File.separator + "background.jpg",  new GroupofMonsters(new ArrayList<Monster>()), currentRoom.hero);
		FightMonsters FightMonsters = new FightMonsters("pictures" + File.separator + "background.jpg",   select3Monsters(), currentRoom.hero);
		BossFightRoom BossFightRoom = new BossFightRoom("pictures" + File.separator + "background.jpg",  selectBoss(), currentRoom.hero);
		return RecoveryRoom;
	}

	public void display() {
        StdDraw.clear();
		
		// Affichage du fond
		String pathBackground = "pictures" + File.separator + "background.jpg";
		Affichage.image(0, Config.X_MAX, 0, Config.Y_MAX, pathBackground);

		// Affichage du héros
		String pathHeros = "pictures" + File.separator + "Ironclad.png";
		Affichage.image(Config.X_MAX*0.2 - 183, Config.X_MAX*0.2 + 183, Config.Y_MAX*0.5 - 130, Config.Y_MAX*0.5 + 130, pathHeros);

		// Affichage de l'énergie et le nombre de carte de la pioche, de la défausse et en l'exil
		Affichage.texteGauche(0, Config.Y_MAX - 20, "Pioche : 10");
		Affichage.texteGauche(0, Config.Y_MAX - 45, "Energie : 3/3");
		Affichage.texteDroite(Config.X_MAX, Config.Y_MAX - 20, "Defausse : 0");
		Affichage.texteDroite(Config.X_MAX, Config.Y_MAX - 45, "Exil : 0");

		StdDraw.show(); //montre a l'ecran les changements demandés
	}

	public void initialDisplay() {
		AssociationTouches.init();
		Config.init();
		StdDraw.enableDoubleBuffering(); // rend l'affichage plus fluide: tout draw est mis en buffer et ne s'affiche qu'au prochain StdDraw.show();
		display();
	}

	public void update() {
		String toucheSuivante = AssociationTouches.trouveProchaineEntree(); //cette fonction boucle jusqu'a la prochaine entree de l'utilisateur
		if (toucheSuivante.equals("Entrée")) { 
			//TODO: deplacer le curseur vers le haut
			System.out.println("Entrée");
			display();	
			}
		//TODO: Ajouter les autres touches utiles avec la classe AssociationTouches
		else {
			System.out.println("Autre touche");
			display();
			
		}
	}
}

