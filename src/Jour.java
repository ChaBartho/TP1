import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Jour {
    //Propriétés:
    LocalDate jour;
    LocalTime heureDebut;
    LocalTime heureFin;
    HashMap<String, Session> maSession;


    //Constructeur:
    public Jour(String inputJour){
        jour = LocalDate.parse(inputJour, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        maSession = new HashMap<String, Session>();
    }


    //Methodes:     -> un jour contient des sessions
    public void addSession(String sessionSaisie, Session nvlSession){
        maSession.put(sessionSaisie, nvlSession);

    }

    public void getSession(String maSess){
        if (maSession.containsKey(maSess)) {
            Session recupSession = maSession.get(maSess);
            System.out.println(recupSession.heureDebutSession);
            System.out.println(recupSession.heureFinSession);
            System.out.println(recupSession.duree);
        }else{
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
