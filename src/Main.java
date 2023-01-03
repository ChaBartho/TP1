import java.io.FileNotFoundException;
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





        //Menu :
        String menu = """
                1. Ajouter date (avec heure de début et de fin de journée).
                2. Afficher date choisie.
                3. Ajouter session (avec heure de début et de fin de session).
                4. Afficher session choisie.
                5. Ajouter personne.
                6. Quitter.
                """;

        switch (menu) {
            case "1." :
                break;

            case "2." :
                break;

            case "3." :
                break;

            case "4." :
                break;

            case "5." :
                break;

            case "6." :
                break;

            default :
                System.out.println("Saisie non-valide");
                break;
        }





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


        //Afficher grille vide en dur:                  -> %s remplace un seul caractère, utiliser un tab pour une chaine ?
        String grilleVide = """
                +-----------------------------------------+
                |                  Date                   |
                +-----------------------------------------+
                |  début  |   fin   |      Sessions       |
                +-----------------------------------------+
                | %s h %s | %s h %s |  . . . . . . . . . .|
                |    h    |    h    |  . . . . . . . . . .|67 Repas
                |    h    |    h    |  . . . . . . . . . .|78 Repas
                |    h    |    h    |  . . . . . . . . . .|89
                |    h    |    h    |  . . . . . . . . . .|910
                |    h    |    h    |  . . . . . . . . . .|1011
                |    h    |    h    |  . . . . . . . . . .|1112
                |    h    |    h    |  . . . . . . . . . .|1213 Repas
                |    h    |    h    |  . . . . . . . . . .|1314 Repas
                |    h    |    h    |  . . . . . . . . . .|1415
                |    h    |    h    |  . . . . . . . . . .|1516
                |    h    |    h    |  . . . . . . . . . .|1617
                |    h    |    h    |  . . . . . . . . . .|1718
                |    h    |    h    |  . . . . . . . . . .|1819 Repas
                |    h    |    h    |  . . . . . . . . . .|1920 Repas
                |    h    |    h    |  . . . . . . . . . .|2021 Repas
                |    h    |    h    |  . . . . . . . . . .|21
                |    h    |    h    |  . . . . . . . . . .|
                +-----------------------------------------+
                """;
                //.replaceAll("\\.","%s");



        //(https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html)
        //Ouvrez un flux d'écriture vers le fichier texte en utilisant la classe FileOutputStream et enveloppez ce flux dans un ObjectOutputStream.
        // Cela vous permet d'écrire des objets Serializable dans le fichier:
        FileOutputStream flux = new FileOutputStream("inscription.txt");
        ObjectOutputStream oos = new ObjectOutputStream(flux);

        //Écrivez la liste d'objets 'Person' dans le fichier en utilisant la méthode writeObject de l'ObjectOutputStream:
        oos.writeObject("Hello");

        //Fermez le flux d'écriture en utilisant la méthode close de l'ObjectOutputStream:
        oos.close();



        // utiliser ObjectInputStream pour lire les objets sérialisés


        //(https://gayerie.dev/docs/java/langage_java/streams.html)












    }

}