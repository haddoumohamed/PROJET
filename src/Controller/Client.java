package Controller;

import Model.Hotel;

public class Client extends Utilisateur{
    Demande reservation;


    //Ajouter sejour ici
    public void Demander_Reservation(Hotel hotel, Client client, int nbr_lit_souhaitee, boolean vip){
        Demande demande=new Demande(hotel,this,nbr_lit_souhaitee,vip);
        this.reservation=demande;
    }

    public void Modifier_Reservation(int nbr_lits_souhaitees)
    {
        //A modifier apres l'ajout de date
        this.reservation.nbr_lit_souhaitee=nbr_lits_souhaitees;

    }

    //Overloading
    public void Modifier_Reservation(int nbr_lits_souhaitees,boolean vip)
    {
        //A modifier apres l'ajout de date
        this.reservation.nbr_lit_souhaitee=nbr_lits_souhaitees;
        this.reservation.vip=vip;
    }

    public void Modifier_Reservation(boolean vip)
    {
        //A modifier apres l'ajout de date
        this.reservation.vip=vip;
    }


    public void Annuler_Reservation()
    {
        // A modifier apres l'ajout de date
        this.reservation.hotel.demandes.remove(this.reservation);
        this.reservation=null;
    }


}
