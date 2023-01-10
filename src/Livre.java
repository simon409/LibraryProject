import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Livre {
    private static int idlivrenext = 1;
    private int idlivre;
    private float prix;
    private LocalDate dateedition;
    private String etalivre;
    private ArrayList<Auteur> Auteur;

    public Livre() {
        this.idlivre = idlivrenext++;
        Auteur = new ArrayList<>();
    }

    public Livre(int idlivre, float prix, LocalDate dateedition, String etalivre) {
        this.prix = prix;
        this.idlivre = idlivrenext++;
        this.dateedition = dateedition;
        this.etalivre = etalivre;
        Auteur = new ArrayList<>();
    }

    public static int getIdlivrenext() {
        return idlivrenext;
    }

    public static void setIdlivrenext(int idlivrenext) {
        Livre.idlivrenext = idlivrenext;
    }

    public int getIdlivre() {
        return idlivre;
    }

    public void setIdlivre(int idlivre) {
        this.idlivre = idlivre;
    }

    public LocalDate getDateedition() {
        return dateedition;
    }

    public void setDateedition(LocalDate dateedition) {
        this.dateedition = dateedition;
    }

    public String getEtalivre() {
        return etalivre;
    }

    public void setEtalivre(String etalivre) {
        this.etalivre = etalivre;
    }


    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void ajouterAuteur(Auteur auteur){
        Auteur.add(auteur);
    }
}
