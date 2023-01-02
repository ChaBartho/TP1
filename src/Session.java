import java.time.LocalTime;

public class Session {
    //Propriétés:
    String intitule;
    LocalTime heureDebutSession;
    LocalTime heureFinSession;
    int duree = 1;

    //Constructeur:
    public Session(String heureDebSess, String heureFinSess, String monIntitule){
        heureDebutSession = LocalTime.parse(heureDebSess);
        heureFinSession = LocalTime.parse(heureFinSess);
        intitule = monIntitule;
    }

}
