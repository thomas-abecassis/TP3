package fr.umontpellier.iut.exo1;
import java.time.LocalDate;
import java.time.Month;


public class GestionEtudiants {
    public static void main(String[] args) {
        LocalDate maDate = LocalDate.of(2019, Month.FEBRUARY, 4);
        Etudiant lolo = new Etudiant("leo","lulu","leolulu","8 rue des pieds",maDate);
        Etudiant toto = lolo;
        lolo.setNom("jean","pierre");
        System.out.println(toto);
    }
}
