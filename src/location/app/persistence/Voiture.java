/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.persistence;

import java.util.Objects;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author HP
 */
public class Voiture {

 //attribut
    private SimpleIntegerProperty idvoiture;
    private SimpleStringProperty matricule;
    private SimpleStringProperty modele;
    private SimpleStringProperty marque;
    private SimpleIntegerProperty kilometrage;
    private SimpleStringProperty couleur;
    private SimpleFloatProperty tarif;
    private SimpleBooleanProperty etat;

    
     // constructeurs par defaut
    
    public Voiture() {
    }
    
    //constructeurs paramétré
    public Voiture(int idvoiture ,String matricule, String modele, String marque, int kilometrage, String couleur, float tarif) {
        this.idvoiture = new SimpleIntegerProperty(idvoiture);
        this.matricule = new SimpleStringProperty (matricule);
        this.modele = new SimpleStringProperty(modele);
        this.marque =new SimpleStringProperty (marque);
        this.kilometrage = new SimpleIntegerProperty (kilometrage);
        this.couleur = new SimpleStringProperty (couleur);
        this.tarif =new SimpleFloatProperty (tarif);
        
    }

    //xxxxxxxx
     public SimpleIntegerProperty Idvoiture_Property(){return idvoiture;}
     public SimpleStringProperty Matricule_Property(){return matricule;}
     public SimpleStringProperty Modele_Property(){return modele;}
     public SimpleStringProperty Marque_Property(){return marque;}
     public SimpleIntegerProperty Kilometrage_Property(){return kilometrage;}
     public SimpleStringProperty Couleur_Property(){return couleur;}
     public SimpleBooleanProperty Etat_Property(){return etat;}
     public SimpleFloatProperty Tarif_Property(){return tarif;}
     
     
     //getters
     
     public  SimpleIntegerProperty getIdvoiture() {
        return idvoiture;
    }
    public  SimpleStringProperty getMatricule() {
        return matricule;
    }
    public SimpleStringProperty getModele() {
        return modele;
    }

    public SimpleStringProperty getMarque() {
        return marque;
    }
    public SimpleIntegerProperty getKilometrage() {
        return kilometrage;
    }
    public SimpleStringProperty getCouleur() {
        return couleur;
    }

    public SimpleBooleanProperty getEtat() {
        return etat;
    }
    public SimpleFloatProperty getTarif() {
        return tarif;
    }

    //setters
   public void setIdvoiture(int idvoiture) {
        this.idvoiture.setValue(idvoiture);
    }
   
    public void setMatricule(String matricule) {
        this.matricule.setValue(matricule);
    }
    public void setModele(String modele) {
        this.modele.setValue(modele);
    }
    public void setMarque(String marque) {
        this.marque.setValue(marque);
    }
    

    public void setKilometrage(int kilometrage) {
        this.kilometrage.setValue(kilometrage);
    }

    public void setCouleur(String couleur) {
        this.couleur.setValue(couleur);
    }

    public void setEtat(boolean etat) {
        this.etat.setValue(etat);
    }
    public void setTarif(float tarif) {
        this.tarif.setValue(tarif);
    }
    
//equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voiture other = (Voiture) obj;
        if (this.matricule != other.matricule) {
            return false;
        }
        if (!Objects.equals(this.modele, other.modele)) {
            return false;
        }
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        if (!Objects.equals(this.kilometrage, other.kilometrage)) {
            return false;
        }
        if (!Objects.equals(this.couleur, other.couleur)) {
            return false;
        }
        if (!Objects.equals(this.etat, other.etat)) {
            return false;
        }
        if (!Objects.equals(this.tarif, other.tarif)) {
            return false;
        }
        return true;
    }
//tostring
    @Override
    public String toString() {
        return "Voiture{" + "matricule=" + matricule + ", modele=" + modele + ", marque=" + marque + ", kilometrage=" + kilometrage + ", couleur=" + couleur + ",etat="+etat+",tarif="  +tarif + '}';
    }

   
    
        
   
    
    
}
