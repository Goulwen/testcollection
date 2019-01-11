package testcollection.testcomparator;

import java.util.Comparator;

public class DepartementPuisVilleComparator implements Comparator<Ville> {

	public int compare(Ville o1, Ville o2) {
		int tmp = o1.getDepartement().compareTo(o2.getDepartement());
		
		if (tmp != 0) {
			return tmp;
		}
		
		return o1.getNom().compareTo(o2.getNom());
	
	}

}
