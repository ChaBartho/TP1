package All.Model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeMap;
public class Jour {

    //Propriétés:
    private final LocalDate jour;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private TreeMap<String, Session> maSession;    //-> un jour contient des sessions


    //Constructeur:
    public Jour(String inputJour, LocalTime heureDebut, LocalTime heureFin){
        this.jour = LocalDate.parse(inputJour, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.heureDebut= heureDebut;
        this.heureFin = heureFin;
        maSession = new TreeMap<String, Session>();
    }


    //Methodes:
    public String getDate(){
        return this.jour.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public LocalTime getHeureDebut(){
        return this.heureDebut;
    }
    public LocalTime getHeureFin(){
        return this.heureFin;
    }




    public void addSession(String heureDebut, Session nvlSession){
        maSession.put(heureDebut, nvlSession);
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




    public void addInscription(String clefSession, String persSaisi, Inscription nvlPers){
        this.getSession(clefSession).addInscription(persSaisi, nvlPers);
    }
    public Inscription getInscription(String clefSession, String mesInscrit){
        //CORRIGE-MOI CA
        Inscription recupInscrit = this.getSession(clefSession).getInscription(mesInscrit);
        return recupInscrit;
    }
    public void deleteInscription(String clefSession,String monInscription){
        if(maSession.containsKey(clefSession)) {
            this.getSession(clefSession).deleteInscription(monInscription);
        }
    }



}
