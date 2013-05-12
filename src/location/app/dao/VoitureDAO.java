/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import location.app.persistence.Location;
import location.app.persistence.Voiture;


/**
 *
 * @author esprit
 */
public class VoitureDAO extends IDAO<Voiture> {
   

   @Override
    public Voiture find(int idvoiture) {
        String sql = "SELECT * FROM VOITURE WHERE IDVOITURE=?";
        Voiture found = null; 
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idvoiture);
            resultSet = preparedStatement.executeQuery(); 
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Voiture(resultSet.getInt("IDVOITURE"), resultSet.getString("MATRICULE"), resultSet.getString("MARQUE"), resultSet.getString("MMODELE"),resultSet.getInt("KILOMETRAGE"),resultSet.getFloat("TARIF"),resultSet.getString("COULEUR"),resultSet.getBoolean("ETAT"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VoitureDAO.class.getName()).log(Level.SEVERE, "find departement failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(VoitureDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
    }
    

    @Override
    public void create(Voiture voiture) {
         
             if (find(voiture.getIdvoiture().getValue()) == null) { 
            String sql = "INSERT INTO VOITURE(IDVOITURE ,MATRICULE, MARQUE, MODELE  , KILOMETRAGE , TARIF,COULEUR,ETAT) VALUES (NULL,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, voiture.getIdvoiture().getValue());
                preparedStatement.setString(2, voiture.getMatricule().getValue());
                preparedStatement.setString(3, voiture.getModele().getValue());
                preparedStatement.setInt(4, voiture.getKilometrage().getValue());
                preparedStatement.setFloat(5, voiture.getTarif().getValue());
                preparedStatement.setString(6,voiture.getCouleur().getValue());
                preparedStatement.setBoolean(7,voiture.getEtat().getValue());
                preparedStatement.executeUpdate(); 
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(VoitureDAO.class.getName()).log(Level.SEVERE, "insert failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(VoitureDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }    
    }
 
    

    @Override
    public void update(Voiture voiture) {
        
 if (find(voiture.getIdvoiture().getValue()) == null) { 
            String sql = "UPDATE VOITURE SET MATRICULE=?,MARQUE=?, MODELE=? , COULEUR=? , KILOMETRAGE=? , TARIF=?,COULEUR=?,ETAT=? WHERE IDVOITURE=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, voiture.getMatricule().getValue());
                preparedStatement.setString(2, voiture.getMarque().getValue());
                preparedStatement.setString(3, voiture.getModele().getValue());
                preparedStatement.setInt(4, voiture.getKilometrage().getValue());
                preparedStatement.setFloat(5, voiture.getTarif().getValue());
                preparedStatement.setString(6, voiture.getCouleur().getValue());
                preparedStatement.setBoolean(7, voiture.getEtat().getValue());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(VoitureDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(VoitureDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void delete(Voiture voiture) {
        if (find(voiture.getIdvoiture().getValue()) == null) { 

            String sql = "DELETE FROM VOITURE WHERE MATRICULE=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, voiture.getIdvoiture().getValue());
                preparedStatement.executeUpdate();
                                                  
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(VoitureDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(VoitureDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }

        }
    }
    

    @Override
    public List<Voiture> findAll() {
        List<Voiture> list = new ArrayList<Voiture>();
        String sql = "SELECT * FROM VOITURE";
        Statement statement = null; 
        ResultSet resultSet = null; 
        
        try {
            statement = connection.createStatement(); 
            resultSet = statement.executeQuery(sql);  
            System.out.println(sql);
            while (resultSet.next()) {
                list.add(new Voiture(resultSet.getInt("IDVOITURE"),resultSet.getString("MATRICULE"), resultSet.getString("MARQUE"), resultSet.getString("MODELE"),resultSet.getInt("KILOMETRAGE"),resultSet.getFloat("TARIF"),resultSet.getString("COULEUR"),resultSet.getBoolean("ETAT")));
            }


        } catch (SQLException ex) {
            Logger.getLogger(VoitureDAO.class.getName()).log(Level.SEVERE, "find all employees failed", ex);
        } finally {            
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(VoitureDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return list;
    }

    
    
    
}
