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
public class Location {
    
    private SimpleIntegerProperty idclient ;
    private SimpleIntegerProperty idvoiture;
    private SimpleStringProperty datedebut;
    private SimpleStringProperty datefin;
    private SimpleFloatProperty tarif ;

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

    public SimpleFloatProperty getTarif() {
        return tarif;
    }

    public void setIdadmin(int idadmin) {
        this.idclient .setValue(idadmin);    }

    public void setIdvoiture(int idvoiture) {
        this.idvoiture.setValue(idvoiture);
    }

    public void setDatedebut(String datedebut) {
        this.datedebut.setValue(datedebut);
    }

    public void setDatefin(String datefin) {
        this.datefin.setValue(datefin);
    }

    public void setTarif(float tarif) {
        this.tarif.setValue(tarif);
    }

  

    public Location(int idclient, int idvoiture, String datedebut, String datefin, float tarif) {
        this.idclient = new SimpleIntegerProperty(idclient);
        this.idvoiture = new SimpleIntegerProperty(idvoiture);
        this.datedebut = new SimpleStringProperty(datedebut);
        this.datefin = new SimpleStringProperty(datefin);
        this.tarif = new SimpleFloatProperty(tarif);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.idclient != other.idclient) {
            return false;
        }
        if (this.idvoiture != other.idvoiture) {
            return false;
        }
        if (!Objects.equals(this.datedebut, other.datedebut)) {
            return false;
        }
        if (!Objects.equals(this.datefin, other.datefin)) {
            return false;
        }
        if (!Objects.equals(this.tarif, other.tarif)) {
            return false;
        }
        return true;
    }

    
  
    
    @Override
    public String toString() {
        return "Location{" + "idclient=" + idclient + ", idoiture=" + idvoiture + ", datedebut=" + datedebut + ", datefin=" + datefin + ", tarif=" + tarif + '}';
    }
}
