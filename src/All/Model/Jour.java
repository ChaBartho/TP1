package All.Model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeMap;
public class Jour {

    //Propriétés:
    private LocalDate date;
    private LocalTime heureDebutJour;
    private LocalTime heureFinJour;
    private TreeMap<String, Session> maSession;    //-> un jour contient des sessions


    //Constructeur:
    public Jour(String inputJour, LocalTime heureDebut, LocalTime heureFin){
        this.date = LocalDate.parse(inputJour, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.heureDebutJour= heureDebut;
        this.heureFinJour = heureFin;
        maSession = new TreeMap<String, Session>();
    }


    //Methodes:
    public LocalDate getDate(){
        return this.date;
    }
    public LocalTime getHeureDebut(){
        return this.heureDebutJour;
    }
    public LocalTime getHeureFin(){
        return this.heureFinJour;
    }


    public void addSession(LocalTime heureDebutSession, Session nvlSession){
        maSession.put(String.valueOf(heureDebutSession), nvlSession);
    }
    public Session getSession(String maSess){
        if (maSession.containsKey(maSess)) {
            Session recupSession = this.maSession.get(maSess);
            return recupSession;
        }else{
            return null;
        }
    }
    public void deleteSession(LocalTime sessionSaisie){
        if(maSession.containsKey(sessionSaisie)) {
            maSession.remove(sessionSaisie);
        }
    }


    public void addInscription(LocalTime heureDebutSess, Inscription nvlPers){
        this.getSession(String.valueOf(date)).addInscription(heureDebutSess, nvlPers);
    }
    public Inscription getInscription(LocalTime heureDebutSess, String mesInscrit){
        Inscription recupInscrit = this.getSession(String.valueOf(heureDebutSess)).getInscription(mesInscrit);
        return recupInscrit;
    }
    public void deleteInscription(LocalTime heureDebSession,String monInscription){
        if(maSession.containsKey(heureDebSession)){
            this.getSession(String.valueOf(heureDebSession)).deleteInscription(monInscription);
        }
    }



}
