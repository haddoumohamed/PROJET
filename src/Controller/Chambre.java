package Controller;

<<<<<<< HEAD

import java.util.HashMap;
import java.util.TreeMap;

import Model.Hotel;

public class Chambre {
	Hotel hotel;  //Hotel dont la chambre appartient
=======
import Model.Hotel;

import java.util.HashMap;

public class Chambre {

    Hotel hotel;  //Hotel dont la chambre appartient
>>>>>>> 029475ddc8fd5077b1913e5898a80ba1c9bd76bc
    public int numero;  //Numero de la chambre
    public int nombre_lits; // Nombres de lits disponibles dans la chambre
    public boolean vip;  // indique est ce que la chambre est vip ou non
    public boolean reservee;  //indique si la chambre est reservee ou non
<<<<<<< HEAD
    //public static int  compteur = 1 ;
    
     public TreeMap<Date,Date> chambres_reservees=new TreeMap<>();   /// travailler avec treemap pour que les dates debut soient en ordre croissant 
=======

     public HashMap<Date,Date> chambres_reservees=new HashMap<>();
>>>>>>> 029475ddc8fd5077b1913e5898a80ba1c9bd76bc




    public Chambre(Hotel hotel,int nombre_lits,boolean vip)
    {
        this.hotel=hotel;
        this.reservee=false;  //apres la creation de la chambre,c'est logique qu'elle soit disponible
        this.nombre_lits=nombre_lits;
        this.vip=vip;

<<<<<<< HEAD

    }
=======
    }



>>>>>>> 029475ddc8fd5077b1913e5898a80ba1c9bd76bc
}
