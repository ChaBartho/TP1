package All.Model;
import java.io.Serializable;
public class Inscription implements Serializable {

    //Propriétés :
    private String niss;
    private String nomPersonne;
    private String nomClub;


    //Constructeur :
    public Inscription(String niss, String nomPersonne, String nomClub){
        this.niss = niss;
        this.nomPersonne = nomPersonne;
        this.nomClub = nomClub;
    }


    //Méthodes :
    public void setNiss(String niss){
        this.niss = niss;
    }
    public void setNomPersonne(String nomPersonne){
        this.nomPersonne = nomPersonne;
    }
    public void setNomClub(String nomClub){
        this.nomClub = nomClub;
    }
    public String getNiss(){
        return niss;
    }
    public String getNomPersonne(){
        return nomPersonne;
    }
    public String getNomClub(){
        return nomClub;
    }





}
