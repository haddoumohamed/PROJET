package Controller;

import Model.Hotel;

public class Administrateur extends Utilisateur{

    Hotel hotel;

    public void Accepter_Demande()
    {
        // TO CODE
    }

    public void Decliner_Demande()
    {
        //TO CODE
    }

    public void Verifier_Disponibilite()
    {
        // TO CODE
    }

    public void Creer_Chambre( int nombre_lits, boolean vip)
    {
        Chambre chambre=new Chambre(this.hotel,nombre_lits,vip);
    }
    public void Modifier_Chambre(int numero_chambre,int nombre_lits,boolean vip)
    {
      this.hotel.chambres.get(numero_chambre-1).nombre_lits=nombre_lits;

      this.hotel.chambres.get(numero_chambre-1).vip=vip;

    }

    //Overloaading
    public void Modifier_Chambre(int numero_chambre,int nombre_lits)
    {
        this.hotel.chambres.get(numero_chambre-1).nombre_lits=nombre_lits;
    }

    public void Modifier_Chambre(int numero_chambre,boolean vip)
    {
        this.hotel.chambres.get(numero_chambre-1).vip=vip;
    }



    public void Supprimer_Chambre(int numero_chambre)
    {
        this.hotel.chambres.remove(numero_chambre-1);
    }





}
