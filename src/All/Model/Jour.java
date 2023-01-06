package All.Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Jour {

    //Propriétés:
    LocalDate jour;
    LocalTime heureDebut;
    LocalTime heureFin;
    Map<Integer, Session> maSession;    //-> un jour contient des sessions


    //Constructeur:
    public Jour(String inputJour){
        jour = LocalDate.parse(inputJour, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        maSession = new HashMap<Integer, Session>();
    }


    //Methodes:
    public void addSession(int sessionSaisie, Session nvlSession){
        maSession.put(sessionSaisie, nvlSession);
    }

    public void getSession(int maSess){
        if (maSession.containsKey(maSess)) {    //containsKey = Vérifier qu'un élément existe (true/false)
            Session recupSession = maSession.get(maSess);
            System.out.println(recupSession.intitule);
            System.out.println(recupSession.heureDebutSession);
            System.out.println(recupSession.heureFinSession);
            System.out.println(recupSession.duree);
        }else{  //remplacer mon else par return null -> controller if(getSession = null) alors afficher msg d'erreur
            System.out.println("Cette session n'existe pas dans l'agenda");
        }
    }

    public void deleteSession(int sessionSaisie){
        if(maSession.containsKey(sessionSaisie)) {
            maSession.remove(sessionSaisie);
            System.out.println("La session a bien été supprimée");
        }else{
            System.out.println("Cette session n'existe pas et n'a pas pu être supprimée");
        }
    }




}
