package testcollection.testcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Rhone", "Lyon");
		Ville ville2 = new Ville("Var", "Nice");
		Ville ville3 = new Ville("Gard", "Nime");
		Ville ville4 = new Ville("Landes", "Dax");
		Ville ville5 = new Ville("Gard", "Ales");
		Ville ville6 = new Ville("Rhone", "Vienne");
		Ville ville7 = new Ville("Landes", "Bayonne");
		
		List<Ville> mesVilles = new ArrayList<Ville>();
		mesVilles.add(ville1);
		mesVilles.add(ville2);
		mesVilles.add(ville3);
		mesVilles.add(ville4);
		mesVilles.add(ville5);
		mesVilles.add(ville6);
		mesVilles.add(ville7);
		
		System.out.println("Affiche selon ordre insertion");
		for (Ville ville : mesVilles) {
			System.out.println("Mes villes : " + ville.getDepartement() + " / " + ville.getNom());
		}
		
		System.out.println("\nAffiche selon ordre trie nom département");
		DepartementComparator comparateur1 = new DepartementComparator();
		Collections.sort(mesVilles, comparateur1);
		
		for (Ville ville : mesVilles) {
			System.out.println("Mes villes : " + ville.getDepartement() + " / " + ville.getNom());
		}
		
		System.out.println("\nAffiche selon ordre trie nom ville");
		VilleComparator comparateur2 = new VilleComparator();
		Collections.sort(mesVilles, comparateur2);
		
		for (Ville ville : mesVilles) {
			System.out.println("Mes villes : " + ville.getDepartement() + " / " + ville.getNom());
		}
		
		System.out.println("\nAffiche selon ordre trie nom département puis ville");
		DepartementPuisVilleComparator comparateur3 = new DepartementPuisVilleComparator();
		Collections.sort(mesVilles, comparateur3);
		
		for (Ville ville : mesVilles) {
			System.out.println("Mes villes : " + ville.getDepartement() + " / " + ville.getNom());
		}
		
	}

}
