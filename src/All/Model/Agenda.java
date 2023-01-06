package All.Model;
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
    public void addJour(String jour, Jour nouveauJour) {
        this.calendrier.put(jour, nouveauJour);
    }
    public Jour getJour(String maDate){
        if (this.calendrier.containsKey(maDate)) {
           return this.calendrier.get(maDate);
        }else{
            return null;
        }
    }
    public void deleteJour(String jour){
        if (this.calendrier.containsKey(jour)) {
            this.calendrier.remove(jour);
        }
    }


    public void addSession(String jour, String heureDebut, Session nvlSession){
        this.calendrier.get(jour).addSession(heureDebut, nvlSession);
    }
    public Session getSession(String jour, String maSess){
        Session recupSession = this.calendrier.get(jour).getSession(maSess);
        return recupSession;
    }
    public void deleteSession(String jour, LocalTime sessionSaisie){
            this.calendrier.get(jour).deleteSession(sessionSaisie);
    }



    public void addInscription(String jour, String clefSession, String persSaisi, Inscription nvlPers){
        this.getJour(jour).addInscription(clefSession, persSaisi,nvlPers);
    }
    public Inscription getInscription(String jour, String clefSession, String mesInscrit){
        Inscription recupInscrit = this.calendrier.get(jour).getInscription(clefSession, mesInscrit);
        return recupInscrit;
    }
    public void deleteInscription(String jour, String clefSession,String monInscription){
        if(this.calendrier.containsKey(jour)){
            this.calendrier.get(jour).deleteInscription(clefSession, monInscription);
        }
    }





}