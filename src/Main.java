import Controller.Administrateur;
import Controller.Chambre;
import Controller.Date;
import Model.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotell=new Hotel();
        Administrateur administrateur=new Administrateur();
        administrateur.hotel=hotell;
        hotell.administrateur=administrateur;

        hotell.administrateur.Creer_Chambre(3,true);
        hotell.administrateur.Creer_Chambre(4,true);
        hotell.administrateur.Creer_Chambre(1,false);
        hotell.administrateur.Creer_Chambre(2,true);
        hotell.administrateur.Modifier_Chambre(1,false);

        hotell.administrateur.Supprimer_Chambre(1);


        //System.out.println(hotell.chambres.size());
        //System.out.println(hotell.chambres.get(0).nombre_lits);

        Date date1=new Date(12,3,2024);
        Date date2=new Date(29,2,2024);
        System.out.println(date1.estAvant(date2));







    }
}