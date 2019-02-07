package fr.umontpellier.iut.exo1;
import java.util.ArrayList;

public class Departement {
    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> liste_etu;

    public Departement(String intitule, String adresse){
    this.specialite=intitule;
    this.adresse=adresse;
    this.liste_etu=new ArrayList<>();
    }

    public String toString(){
        return "Departement{" +
                "specialité='" + specialite + '\'' +
                "adresse='" + adresse  +
                "Etudiant=" +liste_etu+
                '}';
    }

    public void inscrire(Etudiant Etudiant){
    this.liste_etu.add(Etudiant);
    }

    public void desinscrire(Etudiant Etudiant){
        this.liste_etu.remove(Etudiant);
    }
}
