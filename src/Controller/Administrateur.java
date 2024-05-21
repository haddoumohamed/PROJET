package Controller;

<<<<<<< HEAD


import java.util.Map;

import Model.Hotel;

public class Administrateur extends Utilisateur {
	 public Hotel hotel;
	    
	    public Administrateur(Hotel hotel , String nom , String prenom , int age ) {
	    	super(nom,prenom,age);
	    	this.hotel = hotel ;
	    }
	  
	    
	    public Administrateur() {
	    	super();
	    }
	    
	    public void traiter_toutes_les_demmandes(Hotel h) {
	     for(Demande d : h.demandes) {
	    	 Accepter_Demande(d);
	     }
	    }
	    
	    
	    public void Accepter_Demande(Demande demande)
	    {
	         int tmp= Verifier_Disponibilite(demande);
	        //A MODIFIER
	        if (tmp!=0) {
	                this.hotel.chambres.get(tmp-1).chambres_reservees.put(demande.date_debut,demande.date_fin);
	                this.hotel.demandes.remove(demande);
	                System.out.println("MONSIEUR : "+ demande.client.nom+"  "+demande.client.prenom+"votre reservation a ete accepter , soyer les bienvenue");
	            }else {
	            	System.out.println("MONSIEUR : "+ demande.client.nom+"  "+demande.client.prenom+"  nous somme desole , notre hotel est plein dans le sejour que vous voulez ");
	            }
	        }


	    public void Decliner_Demande()
	    {
	        //A MODIFIER
	    	
	        System.out.println("refuser");    ///// on peuit supprimer cette methodes (A traiter plus tard)
	    }
	    
	    

	    public int Verifier_Disponibilite(Demande demande)
	    {
	        //A MODIFIER

	        Date date_debut= demande.date_debut;
	        Date date_fin= demande.date_fin;


	        for (Chambre chambre: this.hotel.chambres) {

	            if (chambre.nombre_lits==demande.nbr_lit_souhaitee && chambre.vip==demande.vip)
	            {
	                if (chambre.chambres_reservees.isEmpty()){
	                    return chambre.numero;
	                }
	                for (Map.Entry<Date,Date> entry : chambre.chambres_reservees.entrySet()){
	                   Date entryStartDate=entry.getKey();
	                   Date entryEndDate=entry.getValue();
	                   
	                   if(date_debut.isBetween(entryStartDate, entryEndDate) || date_fin.isBetween(entryStartDate, entryEndDate)) {
	                	   return 0 ;
	                   }
	                   if(date_debut.estAvant(entryStartDate) && date_fin.estApres(entryEndDate)) {
	            		   return 0 ;
	            	   }
	                   if(date_fin.estAvant(entryStartDate)) {
	                	   return chambre.numero ;
	                   }

	                   /*if (!(date_debut.isBetween(entryStartDate,entryEndDate)) && !(date_fin.isBetween(entryStartDate,entryEndDate)))
	                   {
	                	   
	                	   if(date_debut.estAvant(entryStartDate) && date_fin.estApres(entryEndDate)) {
	                		   return 0 ;
	                	   }
	                	   if(date_debut.estApres(entryEndDate))
	                       return chambre.numero;
	                   } */
	                }
	            }
	        }
	        return 0;
	    }
	    
	    

	    public void Creer_Chambre( int nombre_lits, boolean vip)
	    {
	        Chambre chambre=new Chambre(this.hotel,nombre_lits,vip);
	        chambre.numero = this.hotel.chambres.size()+1;
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
=======
import Model.Hotel;

import java.util.Map;

public class Administrateur extends Utilisateur{

    public Hotel hotel;

    public void Accepter_Demande(Demande demande)
    {
         int tmp=Verifier_Disponibilite(demande);
        //A MODIFIER
        if (tmp!=-1) {
                this.hotel.chambres.get(tmp).chambres_reservees.put(demande.date_debut,demande.date_fin);
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

        Date date_debut=demande.date_debut;
        Date date_fin=demande.date_fin;


        for (Chambre chambre:this.hotel.chambres) {

            if (chambre.nombre_lits==demande.nbr_lit_souhaitee && chambre.vip==demande.vip)
            {
                if (chambre.chambres_reservees.isEmpty()){
                    return chambre.numero;
                }
                for (Map.Entry<Date,Date> entry:chambre.chambres_reservees.entrySet()) {
                   Date entryStartDate=entry.getKey();
                   Date entryEndDate=entry.getValue();

                   if (!(date_debut.isBetween(entryStartDate,entryEndDate)) && !(date_fin.isBetween(entryStartDate,entryEndDate)))
                   {
                       return chambre.numero;
                   }
                }
            }
        }
        return 0;
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
>>>>>>> 029475ddc8fd5077b1913e5898a80ba1c9bd76bc
}
