package Controller;

import Model.Hotel;

public class Administrateur extends Utilisateur{

    public Hotel hotel;

    public void Accepter_Demande(Demande demande)
    {
        //A MODIFIER
        if (Verifier_Disponibilite(demande)!=-1) {
                this.hotel.chambres.get(Verifier_Disponibilite(demande)).reservee = true;
                this.hotel.chambres.get(Verifier_Disponibilite(demande)).date_debut = demande.date_debut;
                this.hotel.chambres.get(Verifier_Disponibilite(demande)).date_fin = demande.date_fin;
                this.hotel.demandes.remove(demande);
            }
        }


    public void Decliner_Demande()
    {
        //A MODIFIER
        System.out.println("refuser");
    }

    public int Verifier_Disponibilite(Demande demande)
    {
        //A MODIFIER
        for (Chambre chambre:this.hotel.chambres) {
            if (!chambre.reservee && chambre.vip==demande.vip && chambre.nombre_lits==demande.nbr_lit_souhaitee)
            {
                    return this.hotel.chambres.indexOf(chambre);
            }
        }

        for (Chambre chambre:this.hotel.chambres) {
            if (chambre.date_fin.estApres(demande.date_debut) && chambre.vip==demande.vip && chambre.nombre_lits==demande.nbr_lit_souhaitee)
            {
                return this.hotel.chambres.indexOf(chambre);
            }
        }

        return -1;
    }

    public void Creer_Chambre( int nombre_lits, boolean vip)
    {
        Chambre chambre=new Chambre(this.hotel,nombre_lits,vip);
        chambre.numero=this.hotel.chambres.size()+1;
        this.hotel.chambres.add(chambre); //ajouter la chambre a la base de donnees de l'hotel

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
        for (Chambre chambre:this.hotel.chambres) {
            chambre.numero=this.hotel.chambres.indexOf(chambre)+1;
        }
    }
}
