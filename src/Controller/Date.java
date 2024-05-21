package Controller;

import java.util.Calendar;

public class Date {
	public int jour;
	   public int mois;
	   public int annee;
	   
	   public Date(int jour, int mois, int annee) {
	       this.jour = jour;
	       this.mois = mois;
	       this.annee = annee;
	   }
	   
	   
	   public Date() {
	   }


	   public boolean estAvant(Date autreDate)
	   {
	       if (this.annee < autreDate.annee) {
	           return true;
	       } else if (this.annee == autreDate.annee) {
	           if (this.mois < autreDate.mois) {
	               return true;
	           } else if (this.mois == autreDate.mois) {
	               return this.jour < autreDate.jour;
	           }
	       }
	       return false;
	   }



	   public boolean estApres(Date autreDate)
	   {
	       if (this.annee > autreDate.annee) {
	           return true;
	       } else if (this.annee == autreDate.annee) {
	           if (this.mois > autreDate.mois) {
	               return true;
	           } else if (this.mois == autreDate.mois) {
	               return this.jour > autreDate.jour;
	           }
	       }
	       return false;
	   }
	   
	   

	    static public Date date_aujourdhui()
	   {
	       Calendar calendrier = Calendar.getInstance();
	       Date date=new Date();
	       date.jour = calendrier.get(Calendar.DAY_OF_MONTH);
	       date.mois = calendrier.get(Calendar.MONTH) + 1; // Les mois dans Calendar commencent à partir de 0
	       date.annee = calendrier.get(Calendar.YEAR);
	      return date;
	   }


	    
	   

	    public boolean isBetween(Date startDate, Date endDate) {
	        if (this.annee < startDate.annee || this.annee > endDate.annee) {
	            return false;
	        }
	        if (this.annee == startDate.annee && this.mois < startDate.mois) {
	            return false;
	        }
	        if (this.annee == endDate.annee && this.mois > endDate.mois) {
	            return false;
	        }
	        if (this.annee == startDate.annee && this.mois == startDate.mois && this.jour < startDate.jour) {
	            return false;
	        }
	        if (this.annee == endDate.annee && this.mois == endDate.mois && this.jour > endDate.jour) {
	            return false;
	        }
	        return true;
	    }





}
