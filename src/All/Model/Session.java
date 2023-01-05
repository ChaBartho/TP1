package All.Model;

import java.time.LocalTime;
import java.util.Map;

public class Session {
    //Propriétés:
    String intitule;
    LocalTime heureDebutSession;
    LocalTime heureFinSession;
    int duree = 1;
    Map<String, Inscription> mesInscriptions;   //-> une session contient des inscriptions


    //Constructeur:
    public Session(String heureDebSess, String heureFinSess, String monIntitule){
        heureDebutSession = LocalTime.parse(heureDebSess);
        heureFinSession = LocalTime.parse(heureFinSess);
        intitule = monIntitule;
    }


    //Méthodes :
    public void addInscription(String inscritSaisi, Inscription nvlInscrit){
        mesInscriptions.put(inscritSaisi, nvlInscrit);
    }

    public void getInscription(String mesInscrit){
        if(mesInscriptions.containsKey(mesInscrit)){   //containsKey = Vérifier qu'un élément existe (true/false)
            Inscription recupInscrit = mesInscriptions.get(mesInscrit);
            System.out.println(recupInscrit.niss);
            System.out.println(recupInscrit.nomPersonne);
            System.out.println(recupInscrit.nomClub);
        }else{
            System.out.println("Cette inscription n'existe pas");
        }
    }

    public void deleteInscription(String monInscription){
        if(mesInscriptions.containsKey(monInscription)) {
            mesInscriptions.remove(monInscription);
            System.out.println("L'inscription a bien été supprimée");
        }else{
            System.out.println("Cette inscription n'existe pas et n'a pas pu être supprimée");
        }
    }







}
