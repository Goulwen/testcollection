package testcollection.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Toulouse");
		Ville ville2 = new Ville("Lyon");
		Ville ville3 = new Ville("Colomiers");
		
		Collection<Ville> maCollection = new ArrayList<Ville>();
		//Collection<Ville> maCollection = new HashSet<Ville>();
		//List<Ville> maCollection = new LinkedList<Ville>();
		
		maCollection.add(ville1);
		maCollection.add(ville2);
		maCollection.add(ville3);

		System.out.println("Test 1 :");
		System.out.println(maCollection.contains(ville2));
		
		Ville ville4 = new Ville("Nice");
		System.out.println("Test 2 :");
		System.out.println(maCollection.contains(ville4));
		
		Ville ville5 = new Ville("Lyon");
		System.out.println("Test 3 :");
		System.out.println(maCollection.contains(ville5));
		
		System.out.println(maCollection.size());
		
		maCollection.remove(ville1);
		System.out.println(maCollection.size());
		maCollection.remove(ville5);
		System.out.println(maCollection.size());
		
		List<Ville> maCollection2 = new ArrayList<Ville>(maCollection.size());
		maCollection2.addAll(maCollection);
		System.out.println(maCollection2);
		
		// Affiche les villes de la liste sans toString
		Iterator<Ville> iterator = maCollection2.iterator();
		while (iterator.hasNext()) {
		Ville villes = iterator.next();
		System.out.println(villes.getNom());
		}
		
		// Comparator
		System.out.println("amiens".compareTo("toulouse"));
		System.out.println("paris".compareTo("paris"));
		System.out.println("toulouse".compareTo("amiens"));
		
	}

}
