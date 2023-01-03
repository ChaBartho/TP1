import java.time.LocalTime;
import java.util.HashMap;

public class Session {
    //Propriétés:
    String intitule;
    LocalTime heureDebutSession;
    LocalTime heureFinSession;
    int duree = 1;
    HashMap<String, Inscription> mesInscriptions;


    //Constructeur:
    public Session(String heureDebSess, String heureFinSess, String monIntitule){
        this.heureDebutSession = LocalTime.parse(heureDebSess);
        this.heureFinSession = LocalTime.parse(heureFinSess);
        this.intitule = monIntitule;
    }


    //Méthodes :    -> une session contient des inscriptions
    public void addPersonne(String inscritSaisi, Inscription nvlInscrit){
        mesInscriptions.put(inscritSaisi, nvlInscrit);
    }

    public void getPersonne(String mesPers){
        if(mesInscriptions.containsKey(mesPers)){   //containsKey = Vérifier qu'un élément existe (true/false)
            Inscription recupInscrit = mesInscriptions.get(mesPers);
            System.out.println(recupInscrit.id);
            System.out.println(recupInscrit.nomPersonne);
            System.out.println(recupInscrit.nomClub);
//            System.out.println(recupInscrit.tarif);
        }else{
            System.out.println("Cette personne n'existe pas");
        }
    }

    public void deletePersonne(String persSaisi){
        if(mesInscriptions.containsKey(persSaisi)) {
            mesInscriptions.remove(persSaisi);
            System.out.println("L'inscription a bien été supprimée");
        }else{
            System.out.println("Cette inscription n'existe pas et n'as pas pu être supprimée");
        }
    }





}
