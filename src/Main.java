import Controller.Administrateur;
import Controller.Chambre;
import Controller.Client;
import Controller.Date;
import Model.Hotel;
import View.InterfaceDemandeReservation;

public class Main {
    public static void main(String[] args) {

       /* Hotel hotell=new Hotel();
        Administrateur administrateur=new Administrateur();
        administrateur.hotel=hotell;
        hotell.administrateur=administrateur;

        hotell.administrateur.Creer_Chambre(3,true);
        hotell.administrateur.Creer_Chambre(4,true);
        hotell.administrateur.Creer_Chambre(1,false);
        hotell.administrateur.Creer_Chambre(2,true);
        hotell.administrateur.Modifier_Chambre(1,false);

       // hotell.administrateur.Supprimer_Chambre(1);


        //System.out.println(hotell.chambres.size());
        //System.out.println(hotell.chambres.get(0).nombre_lits);

        Date date1=new Date(1,1,2024);
        Date date2=new Date(1,2,2024);
        Date date3=new Date(2,2,2024);
        Date date4=new Date(2,3,2024);
        Date date5=new Date(1,4,2024);
        Date date6=new Date(1,5,2024);

        Date date7=new Date(1,7,2024);
        Date date8=new Date(3,7,2024);

        //System.out.println(date1.estAvant(date2));

        hotell.chambres.get(0).chambres_reservees.put(date1,date2);
        hotell.chambres.get(0).chambres_reservees.put(date3,date4);
        hotell.chambres.get(0).chambres_reservees.put(date5,date6);

        Client client1=new Client();

        client1.Demander_Reservation(hotell,3,false,date7,date8);

      //  System.out.println(hotell.demandes.get(0).date_fin.annee);
       System.out.println(administrateur.Verifier_Disponibilite(hotell.demandes.get(0)));
        //System.out.println(hotell.chambres.get(0).numero);

       // System.out.println(date7.isBetween(date1,date2));
       // System.out.println(hotell.chambres.get(0).chambres_reservees.get(date3).jour);
        //System.out.println(hotell.chambres.get(0).vip);



        */

        InterfaceDemandeReservation interfaceDemandeReservation=new InterfaceDemandeReservation();







    }
}