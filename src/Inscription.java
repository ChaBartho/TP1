public class Inscription implements Serializable{

    //Propriétés:
    int id;
    String nomPersonne;
    String nomClub;
    int tarif;


    //Constructeur:
    public Inscription(int ID, String nom, String club){
        this.id = ID;
        this.nomPersonne = nom;
        this.nomClub = club;

    }

    //Méthodes:
    public int getID(){
        return id;
    }

    public void setName(String nomPers){
        this.nomPersonne = nomPers;
    }

    public String getName(){
        return nomPersonne;
    }

    public String getClubName(){
        return nomClub;
    }


}
