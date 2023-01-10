package All.Model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.TreeMap;
public class Session {

    //Propriétés:
    private  LocalDate dateSession;
    private  LocalTime heureDebutSess;
    private  String intitule;
    private final int duree = 1;
    private TreeMap<LocalTime, Inscription> mesInscriptions;   //-> une session contient des inscriptions


    //Constructeur:
    public Session(LocalDate date, LocalTime heureDebSess, String intitule){
        this.dateSession = date;
        this.heureDebutSess = heureDebSess;
        this.intitule = intitule;
        this.mesInscriptions = new TreeMap<LocalTime, Inscription>();
    }


    //Méthodes :
    public LocalDate getDateSession(){
        return this.dateSession;
    }
    public LocalTime getHeureDebutSess(){
        return this.heureDebutSess;
    }
    public  String getIntitule(){
        return this.intitule;
    }
    public int getDuree (){
        return this.duree;
    }


    public void addInscription(LocalTime heureDebutSess, Inscription nvlPers){
        this.mesInscriptions.put(heureDebutSess, nvlPers);
    }
    public Inscription getInscription(String mesInscrit){
        if(this.mesInscriptions.containsKey(mesInscrit)){
            Inscription recupInscrit = this.mesInscriptions.get(mesInscrit);
            return recupInscrit;
        }else{
            return null;
        }
    }
    public void deleteInscription(String monInscription){
        if(this.mesInscriptions.containsKey(monInscription)) {
            this.mesInscriptions.remove(monInscription);
        }
    }






}
