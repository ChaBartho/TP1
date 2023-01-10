package All.Model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.TreeMap;
public class Agenda  {
    //Propriétés:
    private TreeMap<String, Jour> calendrier;     //-> un agenda contient des jours


    //Constructeur:
    public Agenda(){
        this.calendrier = new TreeMap<String, Jour>();
    }



    //Methodes:
    public void addJour(String date, Jour nvlDate) {
        this.calendrier.put(date, nvlDate);
    }
    public Jour getJour(String maDate){
        if (this.calendrier.containsKey(maDate)) {
           return this.calendrier.get(maDate);
        }else{
            return null;
        }
    }
    public void deleteJour(String date){
        if (this.calendrier.containsKey(date)) {
            this.calendrier.remove(date);
        }
    }


    public void addSession(String jour, LocalTime heureDebutSession, Session nvlSession){
        this.calendrier.get(jour).addSession(heureDebutSession, nvlSession);
    }
    public Session getSession(String jour, String maSess){
        Session recupSession = this.calendrier.get(jour).getSession(maSess);
        return recupSession;
    }
    public void deleteSession(String jour, LocalTime sessionSaisie){
            this.calendrier.get(jour).deleteSession(sessionSaisie);
    }



    public void addInscription(LocalDate jourSession, LocalTime heureDebutSess, Inscription nvlPers){
        this.getJour(String.valueOf(jourSession)).addInscription(heureDebutSess, nvlPers);
    }
    public Inscription getInscription(LocalDate date, LocalTime heureDebSession, String mesInscrit){
        Inscription recupInscrit = this.calendrier.get(date).getInscription(heureDebSession, mesInscrit);
        return recupInscrit;
    }
    public void deleteInscription(LocalDate date, LocalTime heureDebSession, String monInscription){
        if(this.calendrier.containsKey(date)){
            this.calendrier.get(date).deleteInscription(heureDebSession, monInscription);
        }
    }



}