package fr.umontpellier.iut.exo1;
import java.time.LocalDate;

public class Etudiant {
    private String nom;
    private String prenom;
    private String adresse_mail;
    private String adresse;
    private LocalDate naissance;

    public Etudiant(String nom, String prenom, String adresse_mail, String adresse, LocalDate naissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse_mail = adresse_mail;
        this.adresse = adresse;
        this.naissance = naissance;
    }


    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse_mail='" + adresse_mail + '\'' +
                ", adresse='" + adresse + '\'' +
                ", naissance=" + naissance +
                '}';
    }

    public void setNom(String nom, String prenom) {
        this.nom = nom;
        this.prenom=prenom;
    }


}
