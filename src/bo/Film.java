package bo;

public class Film {
	private int film_id;
	private String nom;
	private int duree;
	private String producteur;
	private String realisateur;
	private String pegi;
	private String date_diffusion;
	private String genre;

	public Film() {}

	public Film(int film_id, String nom, int duree, String producteur, String realisateur, String pegi, String date_diffusion, String genre) {
		this.film_id = film_id;
		this.nom = nom;
		this.duree = duree;
		this.producteur = producteur;
		this.realisateur = realisateur;
		this.pegi = pegi;
		this.date_diffusion = date_diffusion;
		this.genre = genre;
	}

	public int getFilmId() {
		return film_id;
	}

	public void setFilmId(int value) {
		film_id = value;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String value) {
		nom = value;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int value) {
		duree = value;
	}

	public String getProducteur() {
		return producteur;
	}

	public void setProducteur(String value) {
		producteur = value;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String value) {
		realisateur = value;
	}

	public String getPegi() {
		return pegi;
	}

	public void setPegi(String value) {
		pegi = value;
	}

	public String getDateDiffusion() {
		return date_diffusion;
	}

	public void setDateDiffusion(String value) {
		date_diffusion = value;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String value) {
		genre = value;
	}

	@Override
	public String toString() {
		return 	"film_id: " + film_id + "\n" +
						"nom: " + nom + "\n" +
						"durée: " + duree + "\n" +
						"producteur: " + producteur + "\n" +
						"réalisateur: " + realisateur + "\n" +
						"PEGI: " + pegi + "\n" +
						"date de diffusion: " + date_diffusion + "\n" +
						"genre: " + genre+ "\n";
	}
}