package Controller;

import Model.Hotel;

public class Demande {
    Hotel hotel;
    Client client;
    int nbr_lit_souhaitee;
    boolean vip;

    /*Sejour
    -
    -
    -
    -
    -
    -
     */
      // Ajouter sejour
    public Demande(Hotel hotel,Client client,int nbr_lit_souhaitee,boolean vip) {
        this.hotel=hotel;
        this.client=client;
        this.nbr_lit_souhaitee=nbr_lit_souhaitee;
        this.vip=vip;
        this.hotel.demandes.add(this);
    }









}
