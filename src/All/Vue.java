package All;
import All.Model.Agenda;
import All.Model.Inscription;
import All.Model.Jour;
import All.Model.Session;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Vue {
        //Propriété:
        Agenda monAgenda;

        //Constructeur:
        public Vue(Agenda myAgenda){
                this.monAgenda= myAgenda;
        }

        //Méthodes:
        public String displayMenuPrincipal() {
                String displayMenu = """
                        
                        MENU PRINCIPAL :
                        
                        1) Ajouter une date
                        2) Consulter une date
                        3) Supprimer une date
                        0) Quitter
                        """;
                System.out.println(displayMenu);
                Scanner sc = new Scanner(System.in);
                System.out.print("choix : ");
                String monChoix = sc.nextLine();

                return monChoix;
        }
        public void displayError(String message){
                System.out.println(message);
        }

        public void displayAddDate(String date){

                Scanner sc = new Scanner(System.in);
                System.out.print("Veuillez introduire l'heure de début de votre journée au format hh:mm :  ");
                LocalTime heureDeb = LocalTime.parse(sc.nextLine());
                System.out.print("Veuillez introduire l'heure de fin de votre journée au format hh:mm :  ");
                LocalTime heureFin = LocalTime.parse(sc.nextLine());
                Jour nouveauJour = new Jour(date, heureDeb, heureFin);

                monAgenda.addJour(date, nouveauJour);
        }

        public String displayInputDate(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Veuillez introduire une date au format jj/mm/yyyy: ");
                String maDate = sc.nextLine();
                return maDate;
        }
        public String displayMenuDate(LocalDate date){
                Jour jour = monAgenda.getJour(String.valueOf(date));

                String displayMenu = """
                        Date sélectionnée : %date
                        Heure de début: %heureDeb
                        Heure de fin: %heureFin

                        MENU DATE :
                        1) Ajouter une session
                        2) Consulter une session
                        3) Supprimer une session
                        0) Quitter
                        """;
                displayMenu = displayMenu.replace("%date", String.valueOf(jour.getDate()));
                displayMenu = displayMenu.replace("%heureDeb", jour.getHeureDebut().format(DateTimeFormatter.ofPattern("HH:mm")));
                displayMenu = displayMenu.replace("%heureFin", jour.getHeureFin().format(DateTimeFormatter.ofPattern("HH:mm")));
                System.out.println(displayMenu);

                System.out.print("choix : ");
                Scanner sc = new Scanner(System.in);
                String monChoix = sc.nextLine();
                System.out.println("-------------------------------------------------");
                return monChoix;
        }

        public String displayInputSession(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Veuillez indiquer l'heure de début votre session saisie au format 00:00 : ");
                String heureDebut = sc.nextLine();
                return heureDebut;
        }
        public void displayAjoutSession(String date){
                Scanner sc = new Scanner(System.in);
                LocalTime heureDebutSession;
                System.out.println("AJOUTER UNE SESSION EN DATE DU "+date);
                System.out.println("Veuillez indiquer l'heure de début votre session saisie au format 00:00 : ");
                heureDebutSession = LocalTime.parse(sc.nextLine());
                System.out.println("Donnez l'intitulé de votre session");
                String intitule = sc.nextLine();
                System.out.println("-------------------------------------------------");
                Session nvlSession = new Session(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")), heureDebutSession, intitule);
                monAgenda.addSession(date, LocalTime.parse(heureDebutSession.format(DateTimeFormatter.ofPattern("HH:mm"))), nvlSession);
        }

        public String displayMenuSession(Session session){
                Scanner sc = new Scanner(System.in);
                String grille = """
                +----------------------------------------------------------+
                                       %date
                +----------------------------------------------------------+
                          début : %heureDebut     |      %intitule
                +----------------------------------------------------------+
                """;
                grille = grille.replace("%date", session.getDateSession().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                grille = grille.replace("%heureDebut", session.getHeureDebutSess().format(DateTimeFormatter.ofPattern("HH:mm")));
                grille = grille.replace("%intitule", session.getIntitule());

                System.out.println(grille);
                String displayMenuSession = """

                1) Inscrire une personne.
                2) Afficher les personnes inscrites.
                3) Supprimer une inscription.
                0) Retour   
                """;
                System.out.println(displayMenuSession);
                System.out.print("choix : ");
                String monChoix = sc.nextLine();
                return monChoix;

        }

        public void ajoutInscription(Session session){
                System.out.println("INSCRIRE UNE PERSONNE");

                Scanner sc = new Scanner(System.in);
                System.out.println("Veuillez saisir le niss de la personne :");
                String niss = sc.nextLine();
                System.out.println("Veuillez saisir le nom de la personne :");
                String nom = sc.nextLine();
                System.out.println("Veuillez saisir le nom du club :");
                String club = sc.nextLine();
                Inscription nvlinscription = new Inscription(niss, nom, club);
                monAgenda.addInscription(session.getDateSession(),session.getHeureDebutSess(), nvlinscription);
        }

        public String displayInputInscription(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Veuillez indiquer votre numéro niss : ");
                String niss = sc.nextLine();
                return niss;
        }



}
