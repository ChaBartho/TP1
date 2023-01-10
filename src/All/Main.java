package All;
import All.Model.Agenda;

public class Main {
    public static void main(String[] args){
        Agenda model = new Agenda();
        Vue view = new Vue(model);
        Controller monControleur = new Controller(model,view);
        monControleur.start();





//
//        //(https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html)
//        //Ouvrez un flux d'écriture vers le fichier texte en utilisant la classe FileOutputStream et enveloppez ce flux dans un ObjectOutputStream.
//        // Cela vous permet d'écrire des objets All.Serializable dans le fichier:
//        FileOutputStream flux = new FileOutputStream("Model/inscription.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(flux);
//        //Écrivez la liste d'objets 'Person' dans le fichier en utilisant la méthode writeObject de l'ObjectOutputStream:
//        oos.writeObject("Hello");
//        //Fermez le flux d'écriture en utilisant la méthode close de l'ObjectOutputStream:
//        oos.close();
//        // utiliser ObjectInputStream pour lire les objets sérialisés
//        //(https://gayerie.dev/docs/java/langage_java/streams.html)





    }

}