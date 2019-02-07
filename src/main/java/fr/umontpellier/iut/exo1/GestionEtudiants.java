package fr.umontpellier.iut.exo1;
import java.time.LocalDate;
import java.time.Month;


public class GestionEtudiants {
    public static void main(String[] args) {
        Departement info= new Departement("info","Plan 4 Seigneurs, 34090 Montpellier");
        LocalDate maDate = LocalDate.of(2019, Month.FEBRUARY, 4);
        Etudiant lolo = new Etudiant("leo","lulu","leolulu","8 rue des pieds",maDate);
        Etudiant toto = lolo;
        System.out.println(toto);
        info.inscrire(toto);
        info.inscrire(lolo);
        System.out.println(info);
        info.desinscrire(toto);
        System.out.println(info);
    }
}
