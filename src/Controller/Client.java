package Controller;

import Model.Hotel;

public class Client extends Utilisateur{
	 Demande reservation;
	    
	    public Client(String nom, String prenom , int age) {
	    	super(nom ,prenom ,age);
	       // A mpdifier ( ajouter une reservation ici )
	    }

	    
	    
	    
	    public void Demander_Reservation(Hotel hotel,int nbr_lit_souhaitee, boolean vip,Date date_debut,Date date_fin){
	        Demande demande=new Demande(hotel,this,nbr_lit_souhaitee,vip,date_debut,date_fin);
	        this.reservation=demande;
	    }


	    //Overloading
	    public void Modifier_Reservation(int nbr_lits_souhaitees,boolean vip) throws DateException
	    {
	        if (this.reservation.date_debut.estAvant(Date.date_aujourdhui())) throw new DateException();
	        this.reservation.nbr_lit_souhaitee=nbr_lits_souhaitees;
	        this.reservation.vip=vip;
	    }
	    
	    
	    public void Modifier_Reservation(int nbr_lits_souhaitees) throws DateException
	    {
	        if (this.reservation.date_debut.estAvant(Date.date_aujourdhui())) throw new DateException();
	        this.reservation.nbr_lit_souhaitee = nbr_lits_souhaitees;

	    }

	   

	    public void Annuler_Reservation() throws DateException
	    {

	        if (this.reservation.date_debut.estAvant(Date.date_aujourdhui())) throw new DateException();
	        this.reservation.hotel.demandes.remove(this.reservation);
	        this.reservation=null;
	    }

	    public void Modifier_Reservation(boolean vip) throws DateException
	    {
	        if (this.reservation.date_debut.estAvant(Date.date_aujourdhui())) throw new DateException();
	        this.reservation.vip=vip;
	    }
	    
	    
}
