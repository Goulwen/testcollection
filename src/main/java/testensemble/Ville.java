package testensemble;

public class Ville {

	private String nom;

	public Ville(String nom) {
		this.setNom(nom);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getNom() == null) ? 0 : getNom().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		if (getNom() == null) {
			if (other.getNom() != null)
				return false;
		} else if (!getNom().equals(other.getNom()))
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}
