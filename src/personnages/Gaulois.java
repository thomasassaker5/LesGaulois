package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<"+texte+">>");
	}
	private String prendreParole() {
		return "Le gaulois"+nom+":";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
 
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ",";
	}
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois( "Asterix",  8);
		System.out.println(asterix);
	}
}
