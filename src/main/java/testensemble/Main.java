package testensemble;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Toulouse");
		Ville ville2 = new Ville("Toulouse");
		
		Set<Ville> mesVilles = new HashSet<Ville>();
		mesVilles.add(ville1);
		boolean tmp = mesVilles.contains(ville1);
		System.out.println("L'élément est présent : " + tmp);
		
		mesVilles.add(ville2);
		tmp = mesVilles.contains(ville1);
		System.out.println("L'élément est présent : " + tmp);

		System.out.println(mesVilles.size());
		
		System.out.println("Ensemble fourbe");
		Ville ville3 = new Ville("Perpignan");
		mesVilles.add(ville3);
		ville3.setNom("Toulouse");
		
		for (Ville ville : mesVilles) {
			System.out.println(ville.getNom());
		}
		
		
		System.out.println("Ensemble apuré");
		Set<Ville> autreEnsemble = new HashSet<Ville>();
		autreEnsemble.addAll(mesVilles);
		
		for (Ville ville : autreEnsemble) {
			System.out.println(ville.getNom());
		}
	}

}
