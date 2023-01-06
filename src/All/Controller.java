package All;
import All.Model.Agenda;
import All.Model.Jour;
import All.Model.Session;
public class Controller {
    //Propriétés :
    Agenda model;
    Vue view;

    //Constructeur :
    public Controller(Agenda model, Vue view){
        this.model= model;
        this.view=view;
        boolean exit = false;

        //Boucle menu principal
        while(exit == false){
            String choix =  view.displayMenuPrincipal();

            switch(choix){
                case "1":   //Ajouter date
                    String date = view.displayInputDate();
                    Jour jour = model.getJour(date);
                    if (jour == null){
                        view.displayAddDate(date);
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
                                    view.displayAjoutSession(jour.getDate());
                                    break;
                                case "2":   //Consulter session
                                    Session session = model.getSession(jour.getDate(), view.displayInputSession());
                                    if(session == null){
                                        view.displayError("Cette session n'existe pas");
                                    }else {
                                        boolean exit3 = false;

                                        while (exit3 == false) {
                                            String choixMenu2 = view.displayMenuSession(session);
                                            switch (choixMenu2) {
                                                case "1":   // Ajouter inscription
                                                    view.ajoutInscription(session);
                                                    break;
                                                case "2":   //Consulter inscription
//                                                    //appeler la vue évidemment -> displaydelete -> faire comme Consulter Date
                                                    break;
                                                case "3":   //Supprimer inscription
//                                                    //appeler la vue évidemment
                                                    break;
                                                case "0":
                                                    exit3 = true;
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case "3":   //Supprimer session
                                    session = model.getSession(jour.getDate(), view.displayInputSession());
                                    if(session == null){
                                        view.displayError("Cette session n'existe pas");
                                    }else {
                                        model.deleteSession(jour.getDate(),session.getHeureDebutSess());
                                    }

                                    break;
                                case "0": exit2 = true;
                                    break;
                            }
                        }
                    }


                    break;
                case "3":   //Supprimer date
//
                    break;
                case "0": exit = true;
                    break;
            }
        }
    }
}
