package fr.umontpellier.iut.exo1;
import java.util.ArrayList;

public class Departement {
    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> liste_etu;

    public Departement(String intitule, String adresse){
    this.specialite=intitule;
    this.adresse=adresse;
    }

    public String toString(){
        return "Etudiant{" +
                "specialité='" + specialite + '\'' +
                "adresse='" + adresse  +
                '}';
    }

}
