package All;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        Agenda monAgenda = new Agenda();
//        Jour monJour = new Jour("18/11/2022");
//        monAgenda.addJour("29/12/2022",monJour);
//        monAgenda.getJour("29/12/2022");
////        monAgenda.deleteJour("29/12/2022");
////        monAgenda.getJour("29/12/2022");
//        Session maSession = new Session("08:00", "09:00", "Tennis");
//        monAgenda.addSession("29/12/2022","10:00", maSession );
////        monAgenda.calendrier.get("29/12/2022").addSession("08:00", maSession); // Fait la même chose que la ligne d'avant mais en moins propre
//        monAgenda.calendrier.get("29/12/2022").getSession("08:00");
//        monAgenda.calendrier.get("29/12/2022").getSession("10:00");



        Scanner scan = new Scanner(System.in);

        //Configurer jour + heure de début et de fin de journée :
        System.out.println("Veuillez saisir votre jour au format dd/mm/yyyy : ");
        LocalDate jour = LocalDate.parse(scan.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Veuillez indiquer l'heure de début et de fin de votre date saisie au format 00:00 : ");
        LocalTime heureDebut = LocalTime.parse(scan.nextLine());
        LocalTime heureFin = LocalTime.parse(scan.nextLine());
        System.out.println();  //-> affichage grille vide avec date


        //Configurer session + heure de début et de fin de session :
        System.out.println("Donnez l'heure de début de votre Session");
        LocalTime heureDebutSession = LocalTime.parse(scan.nextLine());
        System.out.println("Donnez l'heure de fin de votre Session");
        LocalTime heureFinSession = LocalTime.parse(scan.nextLine());
        System.out.println("Donnez l'intitulé de votre Session");
        String intitule = scan.nextLine();
        System.out.println();  //-> affichage grille vide avec date et nvl session


        //Configurer ajout Personne :
        System.out.println("Veuillez saisir le nom");
        String nom = scan.nextLine();
        System.out.println("Veuillez saisir le nom du club");
        String club = scan.nextLine();



        //(https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html)
        //Ouvrez un flux d'écriture vers le fichier texte en utilisant la classe FileOutputStream et enveloppez ce flux dans un ObjectOutputStream.
        // Cela vous permet d'écrire des objets All.Serializable dans le fichier:
        FileOutputStream flux = new FileOutputStream("Model/inscription.txt");
        ObjectOutputStream oos = new ObjectOutputStream(flux);

        //Écrivez la liste d'objets 'Person' dans le fichier en utilisant la méthode writeObject de l'ObjectOutputStream:
        oos.writeObject("Hello");

        //Fermez le flux d'écriture en utilisant la méthode close de l'ObjectOutputStream:
        oos.close();

        // utiliser ObjectInputStream pour lire les objets sérialisés

        //(https://gayerie.dev/docs/java/langage_java/streams.html)












    }

}