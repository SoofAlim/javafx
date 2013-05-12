/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.persistence;

import java.util.Objects;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author HP
 */
public class Client {
    //attribut
    private SimpleIntegerProperty idclient ;
    private SimpleStringProperty nom ;
    private SimpleStringProperty  prenom;
    private SimpleStringProperty  adresse;
    private SimpleStringProperty  mail;
    private SimpleIntegerProperty  cin;
    private SimpleStringProperty login;
    private SimpleStringProperty password;
    // constructeurs par defaut
    
    public Client() {
    }
    
    //constructeur parametré
    public Client(int idclient, String nom, String prenom, String adresse, String mail, int cin, String login, String password) {
        this.idclient = new SimpleIntegerProperty(idclient);
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty (prenom);
        this.adresse =new SimpleStringProperty(adresse);
        this.mail =new SimpleStringProperty(mail);
        this.cin = new SimpleIntegerProperty(cin);
        this.login = new SimpleStringProperty(login);
        this.password = new SimpleStringProperty(password);
    }
     // xxxxxx
       public SimpleIntegerProperty Idclient_Property(){return idclient;}
       public SimpleStringProperty Nom_Property(){return nom;}
       public SimpleStringProperty Prenom_Property(){return prenom;}
       public SimpleStringProperty Adresse_Property(){return adresse;}
       public SimpleStringProperty Mail_Property(){return mail;}
       public SimpleIntegerProperty Cin_Property(){return cin;}
       public SimpleStringProperty Login_Property(){return login;}
       public SimpleStringProperty Password_Property(){return password;}

       // Getters
    public SimpleIntegerProperty getIdclient() {
        return idclient;
    }

    public SimpleStringProperty getNom() {
        return nom;
    }

    public SimpleStringProperty getPrenom() {
        return prenom;
    }

    public SimpleStringProperty getAdresse() {
        return adresse;
    }

    public SimpleStringProperty getMail() {
        return mail;
    }

    public SimpleIntegerProperty getCin() {
        return cin;
    }

    public SimpleStringProperty getLogin() {
        return login;
    }

    public SimpleStringProperty getPassword() {
        return password;
    }

    
    // Setters
    public void setIdclient(int idclient) {
        this.idclient.setValue(idclient);
    }

    public void setNom(String nom) {
        this.nom.setValue(nom);
    }

    public void setPrenom(String prenom) {
      this.prenom.setValue(prenom);
    }

    public void setAdresse(String adresse) {
      this.adresse.setValue(adresse);
    }

    public void setMail(String mail) {
       this.mail.setValue(mail);
    }

    public void setCin(int cin) {
        this.cin.setValue(cin);
    }

    public void setLogin(String login) {
        this.login.setValue(login);
    }

    public void setPassword(String password) {
       this.password.setValue(password);
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
        final Client other = (Client) obj;
        if (this.idclient != other.idclient) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.adresse, other.adresse)) {
            return false;
        }
        if (!Objects.equals(this.mail, other.mail)) {
            return false;
        }
        if (this.cin != other.cin) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }
        
    // tostring
    @Override
    public String toString() {
        return "Client{" + "idclient=" + idclient + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", mail=" + mail + ", cin=" + cin + ", login=" + login + ", password=" + password + '}';
    }
    
    

    
    
    
}
