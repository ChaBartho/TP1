package All.Model;
import java.io.Serializable;
import java.util.Map;

public class Inscription implements Serializable {

    //Propriétés:
    int niss;
    String nomPersonne;
    String nomClub;
    Map<String, Inscription> monInscription;   //-> une inscription contient une personne


    //Constructeur:
    public Inscription(int id, String nom, String club){
        niss = id;
        nomPersonne = nom;
        nomClub = club;
    }


    //Méthodes:
    public void addPersonne(String persSaisi, Inscription nvlPers){
        monInscription.put(persSaisi, nvlPers);
    }

    public void getPersonne(String mesPers){
        if(monInscription.containsKey(mesPers)){   //containsKey = Vérifier qu'un élément existe (true/false)
            Inscription recupInscrit = monInscription.get(mesPers);
            System.out.println(recupInscrit.niss);
            System.out.println(recupInscrit.nomPersonne);
            System.out.println(recupInscrit.nomClub);
        }else{
            System.out.println("Cette inscription n'existe pas");
        }
    }

    public void deletePersonne(String maPers){
        if(monInscription.containsKey(maPers)) {
            monInscription.remove(maPers);
            System.out.println("L'inscription a bien été supprimée");
        }else{
            System.out.println("Cette inscription n'existe pas et n'a pas pu être supprimée");
        }
    }

}
