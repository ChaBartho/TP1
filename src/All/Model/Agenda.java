package All.Model;

import All.Vue;

import java.util.HashMap;
import java.util.Map;

public class Agenda implements Vue {
    //Propriétés:
    Map<String, Jour> calendrier;     //-> un agenda contient des jours

    //Constructeur:
    public Agenda(){
        calendrier = new HashMap<String, Jour>();
    }

    //Methodes:
            //jourSaisi prend seulement la date, nouveauJour prend l'heure de debut et de fin
    public void addJour(String jourSaisi, Jour nouveauJour) {
        calendrier.put(jourSaisi, nouveauJour);
    }
            //Permet d'ajouter une session à l'agenda en cours, et ça appellera la méthode de Jour
    public void addSession(String jourSaisi, int sessionSaisie, Session nvlSession){
        calendrier.get(jourSaisi).addSession(sessionSaisie,  nvlSession);
    }

    public void getJour(String maDate){
        if (calendrier.containsKey(maDate)) {   //containsKey = Vérifier qu'un élément existe (true/false)
            Jour recupDate = calendrier.get(maDate);
            System.out.println(recupDate.jour);
        }else{
            System.out.println("Cette date n'existe pas dans l'agenda");
        }
    }

    public void deleteJour(String jourSaisi){
        if (calendrier.containsKey(jourSaisi)) {
            calendrier.remove(jourSaisi);
            System.out.println("La date est bien supprimée");
        }else{
            System.out.println("Cette date n'existe pas et n'a pas pu être supprimée");
        }
    }



}



