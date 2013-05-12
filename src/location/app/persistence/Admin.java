/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.persistence;

import java.util.Objects;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author HP
 */
public class Admin {

    //attribut
    private SimpleIntegerProperty idadmin ;
    private  SimpleStringProperty nom;
    private  SimpleStringProperty prenom;
    private  SimpleStringProperty adresse;
    private  SimpleStringProperty mail;
    private  SimpleStringProperty login;
    private  SimpleStringProperty password;
    // constructeurs par defaut
    
    public Admin() {
    }
    
    //constructeur paramétré
     public Admin(int idadmin, String nom, String prenom, String adresse, String mail, String login, String password) {
        this.idadmin = new SimpleIntegerProperty(idadmin) ;
        this.nom = new SimpleStringProperty (nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.adresse = new SimpleStringProperty(adresse);
        this.mail =new SimpleStringProperty (mail);
        this.login = new SimpleStringProperty(login);
        this.password = new SimpleStringProperty(password);
    }
     
     // xxxxxxxx
      public SimpleIntegerProperty Idadmin_Property(){return idadmin;}
     public SimpleStringProperty Nom_Property(){return nom;}
     public SimpleStringProperty Prenom_Property(){return prenom;}
     public SimpleStringProperty Adresse_Property(){return adresse;}
     public SimpleStringProperty Mail_Property(){return mail;}
     public SimpleStringProperty Login_Property(){return login;}
     public SimpleStringProperty Password_Property(){return password;}
     
     // getters
    public SimpleIntegerProperty getIdadmin() {
        return idadmin;
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

    public SimpleStringProperty getLogin() {
        return login;
    }

    public SimpleStringProperty getPassword() {
        return password;
    }

    
    //setters
    public void setIdadmin(int idadmin) {
        this.idadmin.setValue(idadmin);
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
        final Admin other = (Admin) obj;
        if (this.idadmin != other.idadmin) {
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
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }
    //to string
    
    @Override
    public String toString() {
        return "Admin{" + "idadmin=" + idadmin + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", mail=" + mail + ", login=" + login + ", password=" + password + '}';
    }

   

    
   

    
}
