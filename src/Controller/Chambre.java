package Controller;

import Model.Hotel;

public class Chambre {

    Hotel hotel;
    int numero;
    int nombre_lits;
    boolean vip;
    boolean reservee;


    public Chambre(Hotel hotel,int nombre_lits,boolean vip)
    {
        this.hotel=hotel;
        this.reservee=false;
        this.hotel.chambres.add(this);
        this.numero=this.hotel.chambres.indexOf(this)+1;
    }



}
