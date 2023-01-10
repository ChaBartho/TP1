package All;
import All.Model.Agenda;
import All.Model.Inscription;
import All.Model.Jour;
import All.Model.Session;

import java.time.LocalDate;
import java.time.LocalTime;

public class Controller {
    //Propriétés :
    Agenda model;
    Vue view;

    //Constructeur :
    public Controller(Agenda model, Vue view) {
        this.model = model;
        this.view = view;
    }
    public void start(){
        boolean exit = false;
        while(exit == false){
            String choix =  view.displayMenuPrincipal();

            switch(choix){
                case "1":   //Ajouter date
                    String maDate = view.displayInputDate();
                    Jour jour = model.getJour(maDate);
                    if (jour == null){
                        view.displayAddDate(maDate);
                    }else{
                        view.displayError("Cette date existe déjà!");
                    }
                    break;
                case "2":   // Consulter date
                    jour = model.getJour(view.displayInputDate());
                    if (jour == null){
                        view.displayError("Cette date n'existe pas");
                    }else{
                        boolean exit2 = false;

                        while(exit2 == false){
                            String choixMenu = view.displayMenuDate(jour.getDate());

                            switch(choixMenu){
                                case "1":   //Ajouter session
//pb d'affichage
//                                    String maSession = view.displayInputSession();
//                                    Session session = model.getSession(jour.getDate(), maSession);
//                                    if(session == null){
                                    view.displayAjoutSession(String.valueOf(jour));
//                                    }else{
//                                      view.displayError("Cette session existe déjà!")
//                                      }
//
                                    break;
                                case "2":   //Consulter session
                                    Session session = model.getSession(String.valueOf(jour.getDate()), view.displayInputSession());
                                    if(session == null){
                                        view.displayError("Cette session n'existe pas");
                                    }else{
                                        boolean exit3 = false;

                                        while (exit3 == false) {
                                            String choixMenu2 = view.displayMenuSession(session);
                                            switch (choixMenu2) {
                                                case "1":   // Ajouter inscription
                                                    String monInscription = view.displayInputInscription();
                                                    Inscription inscription = model.getInscription(jour.getDate(), session.getHeureDebutSess(), monInscription);
                                                    if(inscription == null){
                                                        view.ajoutInscription(session);
                                                    }else{
                                                        view.displayError("Cette inscription existe déjà!");
                                                    }
                                                    break;
                                                case "2":   //Consulter inscription
                                                    inscription = model.getInscription(jour.getDate(), session.getHeureDebutSess(), view.displayInputInscription());
                                                    if(inscription == null){
                                                        view.displayError("Cette inscription n'existe pas");
                                                    }
                                                    break;
                                                case "3":   //Supprimer inscription
                                                    inscription = model.getInscription(jour.getDate(), session.getHeureDebutSess(), view.displayInputInscription());
                                                    if(inscription == null){
                                                        view.displayError("Cette inscription n'existe pas et n'a pas pu être supprimée");
                                                    }else{
                                                        model.deleteInscription(jour.getDate(), session.getHeureDebutSess(), inscription.getNiss());
                                                        view.displayError("Inscription supprimée");
                                                    }
                                                    break;
                                                case "0":
                                                    exit3 = true;
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case "3":   //Supprimer session
                                    session = model.getSession(String.valueOf(jour.getDate()), view.displayInputSession());
                                    if(session == null){
                                        view.displayError("Cette session n'existe pas et n'a pas pu être supprimée");
                                    }else{
                                        model.deleteSession(String.valueOf(jour.getDate()),session.getHeureDebutSess());
                                        view.displayError("Session supprimée");
                                    }
                                    break;
                                case "0": exit2 = true;
                                    break;
                            }
                        }
                    }
                    break;
                case "3":   //Supprimer date
                    jour = model.getJour(view.displayInputDate());
                    if(jour == null){
                        view.displayError("Cette date n'existe pas et n'a pas pu être supprimée");
                    }else{
                        model.deleteJour(String.valueOf(jour.getDate()));
                        view.displayError("Date supprimée");
                    }
                    break;
                case "0": exit = true;
                    break;
            }
        }
    }
}
