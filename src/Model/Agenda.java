package Model;

import java.util.HashMap;

public class Agenda {
    //Propriétés:
    HashMap<String, Jour> calendrier;

    //Constructeur:
    public Agenda(){
        calendrier = new HashMap<String, Jour>();
    }

    //Methodes:     -> un agenda contient des jours
    public void addJour(String jourSaisi, Jour nouveauJour) {   //jourSaisi prend seulement la date, nouveauJour prend l'heure de debut et de fin
        calendrier.put(jourSaisi, nouveauJour);
    }

    public void addSession(String jourSaisi, String sessionSaisie, Session nvlSession){ //Permet d'ajouter une session à l'agenda en cours, et ça appellera la méthode de Jour
        calendrier.get(jourSaisi).addSession( sessionSaisie,  nvlSession);
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
        if (calendrier.containsKey(jourSaisi)) { //containsKey = Vérifier qu'un élément existe (true/false)
            calendrier.remove(jourSaisi);
            System.out.println("La date est bien supprimée");
        }else{
            System.out.println("Cette date n'existe pas et n'a pas pu être supprimée");
        }
    }



}



