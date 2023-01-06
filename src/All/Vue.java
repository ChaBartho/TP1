package All;

import All.Model.Jour;
import All.Model.Session;
public interface Vue {      //AFFICHAGE


//        String menu = """
//                1. Ajouter date (avec heure de début et de fin de journée).
//                2. Afficher date choisie.
//                3. Ajouter personne.
//                4. Quitter.
//                """;
//        String sousMenuSession = """
//                1. Ajouter session (avec heure de début et de fin de session).
//                2. Afficher session choisie.
//                3. Retour.
//                """;
//        String sousMenuPersonne = """
//                1. Inscrire personne.
//                2. Supprimer inscription.
//                3. Modifier inscription.
//                4. Retour.
//                """;


//        String menu = """
//                1 Ajouter date (avec heure de début et de fin de journée).\n2 Sélectionner date.
//                """;
//        String sousMenuSession = """
//                1 Ajouter session (avec heure de début et de fin de session).\n2 Sélectionner session.\n3 Retour.
//                """;
//        String sousMenuPersonne = """
//                1 Inscrire personne.\n2 Supprimer inscription.\n3 Modifier inscription.\n4 Retour.
//                """;


        ScannerInput input = new ScannerInput();

        Controller menu =
                switch (input.read("1 Ajouter date.\n2 Sélectionner date.\n3 Afficher dates existantes. \n4 Quitter")) {
                    case "1" -> {
                        Controller ctrl = input.addJour();
                        yield ctrl;
                    }


                    case "2" -> {
                        Controller ctrl = input.getJour();
                        yield ctrl;
                    }
//                    case "3" -> {
//                    }
//                    default -> null;
                };

//        Controller sousMenuSession =
//                switch (input.read("1 Ajouter session.\n2 Sélectionner session.\n3 Afficher sessions existantes. \n4 Retour.")) {
//                    case "1" -> {
//                        Controller ctrl = input.addSession();
//                        yield ctrl;
//                    }
//                    case "2" -> {
//                        Controller ctrl = input.getSession();
//                        yield ctrl;
//                    }
//                    case "3" -> {
//                    }
//                    default -> null;
//                };
//
//        Controller sousMenuPersonne =
//                switch (input.read("1 Inscrire personne.\\n2 Supprimer inscription.\\n3 Retour.")) {
//                    case "1" -> {
//                        Controller ctrl = input.addPersonne();
//                        yield ctrl;
//                    }
//                    case "2" -> {
//                        Controller ctrl = input.deletePersonne();
//                        yield ctrl;
//                    }
//                    case "3" -> {
//                    }
//                    default -> null;
//                };






        //afficher grille remplie au fur et a mesure (liste des jours, sessions/jour, inscriptions/session)


        //Afficher grille vide en dur:                  -> %s remplace un seul caractère, utiliser un tab pour une chaine ?
        String grilleVide = """
                +-----------------------------------------+
                |                  Date                   |
                +-----------------------------------------+
                |  début  |   fin   |      Sessions       |
                +-----------------------------------------+
                | %d h 00 | %d h 00 |          %s         |
                +-----------------------------------------+
                """;
        //("%s", heureDebutSession)




}
