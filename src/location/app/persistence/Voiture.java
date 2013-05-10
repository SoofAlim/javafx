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


  
    private SimpleStringProperty matricule;
    private SimpleStringProperty modele;
    private SimpleStringProperty marque;
    private SimpleIntegerProperty kilometrage;
    private SimpleStringProperty couleur;
    private SimpleFloatProperty tarif;
    private SimpleBooleanProperty etat;

    public Voiture(String matricule, String modele, String marque, int kilometrage, String couleur, float tarif) {
        this.matricule = new SimpleStringProperty (matricule);
        this.modele = new SimpleStringProperty(modele);
        this.marque =new SimpleStringProperty (marque);
        this.kilometrage = new SimpleIntegerProperty (kilometrage);
        this.couleur = new SimpleStringProperty (couleur);
        this.tarif =new SimpleFloatProperty (tarif);
        
    }

    

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
        if (!Objects.equals(this.tarif, other.tarif)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Voiture{" + "matricule=" + matricule + ", modele=" + modele + ", marque=" + marque + ", kilometrage=" + kilometrage + ", couleur=" + couleur + ", tarif=" + tarif + '}';
    }

    public  SimpleStringProperty getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule.setValue(matricule);
    }

    public SimpleStringProperty getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele.setValue(modele);
    }

    public SimpleStringProperty getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque.setValue(marque);
    }

    public SimpleIntegerProperty getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage.setValue(kilometrage);
    }

    public SimpleStringProperty getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur.setValue(couleur);
    }

    public SimpleFloatProperty getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif.setValue(tarif);
    }
    
        
   
    
     public SimpleStringProperty Matricule_Property(){return matricule;}
     public SimpleStringProperty Modele_Property(){return modele;}
      public SimpleStringProperty Marque_Property(){return marque;}
       public SimpleIntegerProperty Kilometrage_Property(){return kilometrage;}
        public SimpleStringProperty Couleur_Property(){return couleur;}
         
}
