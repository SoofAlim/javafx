/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.persistence;

import java.util.Objects;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author DELL
 */
public class Reservation {
    
    private SimpleIntegerProperty idreservation ;
    private SimpleIntegerProperty idclient ;
    private SimpleIntegerProperty idvoiture;
    private SimpleStringProperty datedebut;
    private SimpleStringProperty datefin;
    
    
    //constructeurs par defaut
    public Reservation() {
    }
    
    //constructeur paramétré

    public Reservation(int idreservation,int idclient, int idvoiture, String datedebut, String datefin) {
        this.idreservation = new SimpleIntegerProperty(idreservation);
        this.idclient = new SimpleIntegerProperty(idclient);
        this.idvoiture = new SimpleIntegerProperty(idvoiture);
        this.datedebut = new SimpleStringProperty(datedebut);
        this.datefin = new SimpleStringProperty(datefin);

    }
    
    //xxxxxxxx
     public SimpleIntegerProperty Idreservation_Property(){return idreservation;}
     public SimpleIntegerProperty Idclient_Property(){return idclient;}
     public SimpleIntegerProperty Idvoiture_Property(){return idvoiture;}
     public SimpleStringProperty Datedebut_Property(){return datedebut;} 
     public SimpleStringProperty Datefin_Property(){return datefin;}
   
     
     
    //getters
    public SimpleIntegerProperty  getIdreservation() {
        return idreservation;
    }
    public SimpleIntegerProperty  getIdClient() {
        return idclient;
    }

    public SimpleIntegerProperty getIdvoiture() {
        return idvoiture;
    }

    public SimpleStringProperty getDatedebut() {
        return datedebut;
    }

    public SimpleStringProperty getDatefin() {
        return datefin;
    }

    //setters
    public void setIdreservation(int idreservation) {
        this.idreservation.setValue(idreservation); 
    }

    public void setIdadmin(int idadmin) {
        this.idclient .setValue(idadmin); 
    }
    public void setIdvoiture(int idvoiture) {
        this.idvoiture.setValue(idvoiture);
    }

    public void setDatedebut(String datedebut) {
        this.datedebut.setValue(datedebut);
    }

    public void setDatefin(String datefin) {
        this.datefin.setValue(datefin);
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
        final Reservation other = (Reservation) obj;
        if (!Objects.equals(this.idreservation, other.idreservation)) {
            return false;
        }
        if (!Objects.equals(this.idclient, other.idclient)) {
            return false;
        }
        if (!Objects.equals(this.idvoiture, other.idvoiture)) {
            return false;
        }
        if (!Objects.equals(this.datedebut, other.datedebut)) {
            return false;
        }
        if (!Objects.equals(this.datefin, other.datefin)) {
            return false;
        }
        return true;
    }

    //tostring
    
    @Override
    public String toString() {
        return "Reservation{" + "idreservation=" + idreservation + ", idclient=" + idclient + ", idvoiture=" + idvoiture + ", datedebut=" + datedebut + ", datefin=" + datefin + '}';
    }
    
    
}

    
    
    

