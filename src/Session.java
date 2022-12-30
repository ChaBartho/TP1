import java.time.LocalTime;

public class Session {
    //Propriétés:
    LocalTime heureDebutSession;
    LocalTime heureFinSession;
    int duree = 1;

    //Constructeur:
    public Session(String heureDebSess, String heureFinSess){
        heureDebutSession = LocalTime.parse(heureDebSess);
        heureFinSession = LocalTime.parse(heureFinSess);
    }

}
