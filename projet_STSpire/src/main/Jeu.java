/** package principal */
package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import librairies.StdDraw;
import ressources.Affichage;
import ressources.AssociationTouches;
import ressources.Config;

public class Jeu {
	
	protected ArrayList<Room> list_of_rooms;
	protected Hero hero;
	protected ArrayList<Monster> list_of_monsters;
	protected ArrayList<Card> list_of_cards;
	List<String> order = new ArrayList<String>();
	protected Room firstRoom;
		



	public Jeu(
	) throws Exception {
		order.add("C");
		order.add("C");
		order.add("R");
		order.add("C");
		order.add("C");
		order.add("C");
		order.add("R");
		order.add("C");
		order.add("C");
		order.add("C");
		order.add("R");
		order.add("C");
		order.add("C");
		order.add("R");
		order.add("B");


	}

	public boolean isOver() {
		return false;
	}


	public GroupofMonsters select3Monsters() {
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		/* 
		 * add 3 monsters to the list
		 */
		// monsters.add(
		// 	// new Monster("Petit Slime piquant", 12,  
			
		// );

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

		int index = currentRoom.getIndex();
		String room = order.get(index);
		if(room.equals("C")) {
			FightMonstersRoom FightMonsters = new FightMonstersRoom(
				"pictures" + File.separator + "background.jpg",   select3Monsters(), currentRoom.hero, currentRoom.draw, currentRoom.discard, currentRoom.exhaust, currentRoom.index + 1);
			return FightMonsters;
		}
		else if(room.equals("R")) {
			RecoveryRoom RecoveryRoom = new  RecoveryRoom(
				"pictures" + File.separator + "background.jpg", new GroupofMonsters(new ArrayList<Monster>()), currentRoom.hero, currentRoom.draw, currentRoom.discard, currentRoom.exhaust, currentRoom.index + 1);
			return RecoveryRoom;
		}
		else if(room.equals("B")) {
			BossFightRoom BossFightRoom = new BossFightRoom(
				"pictures" + File.separator + "background.jpg",  selectBoss(),
				currentRoom.hero, currentRoom.draw, currentRoom.discard, currentRoom.exhaust, currentRoom.index + 1);
			return BossFightRoom;
		}
		else {
			System.out.println("Error");
		}

		



		
		
		return null;
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

	public void displayRoom(Room room){
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

		
		// Affichage des monstres
		String pathMonster = "pictures" + File.separator + "Slime.png";
		Affichage.image(Config.X_MAX*0.5 - 183, Config.X_MAX*0.5 + 183, Config.Y_MAX*0.5 - 130, Config.Y_MAX*0.5 + 130, pathMonster);

		// Affichage de la pioche 

		// Affichage de la défausse

		// Affichage de l'exil

		// Affichage des cartes en main du héros

		// affichage de l'énergie du héros
		


		StdDraw.show(); 
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
			System.out.println("Entrée");
			display();	
			}
		else {
			System.out.println("Autre touche");
			display();
			
		}
	}
}

