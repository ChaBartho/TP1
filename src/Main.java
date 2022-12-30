

public class Main {
    public static void main(String[] args) {
        Agenda monAgenda = new Agenda();
        Jour monJour = new Jour("18/11/2022");
        monAgenda.addJour("29/12/2022",monJour);
        monAgenda.getJour("29/12/2022");
//        monAgenda.deleteJour("29/12/2022");
//        monAgenda.getJour("29/12/2022");
        Session maSession = new Session("08:00", "09:00");
        monAgenda.addSession("29/12/2022","10:00", maSession ); //Fait la même chose que la ligne suivante mais en plus propre
        monAgenda.calendrier.get("29/12/2022").addSession("08:00", maSession); // Fait la même chose que la ligne d'avant mais en moins propre
        monAgenda.calendrier.get("29/12/2022").getSession("08:00");
        monAgenda.calendrier.get("29/12/2022").getSession("10:00");
    }
    //Creation de la session "Manger" (11h - 13h) -> Blockée, pas possible de prévoir des activités

    //Encodage des dates:


    //Encodage des sessions:


    //Affichage:




}