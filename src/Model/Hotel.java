package Model;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> 029475ddc8fd5077b1913e5898a80ba1c9bd76bc
import Controller.Administrateur;
import Controller.Chambre;
import Controller.Client;
import Controller.Demande;

<<<<<<< HEAD
public class Hotel {
	public ArrayList<Chambre> chambres;  //=new ArrayList<>(); //BDD de chambres
    public ArrayList<Client> clients;  //=new ArrayList<>();   //BDD de clients
   public ArrayList<Demande> demandes;  //=new ArrayList<>(); //BDD de demandes
   public Administrateur administrateur;  //=new Administrateur();  //Administrateur

   public Hotel() {
       this.chambres = new ArrayList<>();
       this.clients = new ArrayList<>();
       this.demandes = new ArrayList<>();
       this.administrateur = new Administrateur();
   }
=======
import java.util.ArrayList;

public class Hotel {
   public ArrayList<Chambre> chambres=new ArrayList<>(); //BDD de chambres
     public ArrayList<Client> clients=new ArrayList<>();   //BDD de clients
    public ArrayList<Demande> demandes=new ArrayList<>(); //BDD de demandes
    public Administrateur administrateur=new Administrateur();  //Administrateur

    public Hotel() {
        this.chambres = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.demandes = new ArrayList<>();
        this.administrateur = new Administrateur();
    }
>>>>>>> 029475ddc8fd5077b1913e5898a80ba1c9bd76bc
}
