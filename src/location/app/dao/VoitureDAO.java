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
import location.app.persistence.Voiture;

/**
 *
 * @author esprit
 */
/*public class VoitureDAO extends IDAO<Voiture> {

   @Override
    public Voiture find(int matricule) {
        String sql = "SELECT * FROM VOITURE WHERE MATRICULE=?";
        Voiture found = null; 
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, matricule);
            resultSet = preparedStatement.executeQuery(); 
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Voiture(resultSet.getInt("MATRICULE"), resultSet.getString("MARQUE"), resultSet.getString("MODELE"),resultSet.getString("COULEUR"),resultSet.getString("KILOMETRAGE"),resultSet.getString("TARIF"));
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
        if (find(voiture.getMatricule()) == null) { 
            
            String sql = "INSERT INTO VOITURE(MATRICULE, MARQUE, MODELE ,COULEUR , KILOMETRAGE , TARIF) VALUES (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, voiture.getMatricule().getValue());
                preparedStatement.setString(2, voiture.getMarque().getValue());
                preparedStatement.setString(3, voiture.getModele().getValue());
                  preparedStatement.setString(4, voiture.getCouleur().getValue());
                    preparedStatement.setString(5, voiture.getKilometrage().getValue());
                    preparedStatement.setString(6, voiture.getTarif().getValue());
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
        if (find(voiture.getMatricule()) != null) { 

            String sql = "UPDATE VOITURE SET MARQUE=?, MODELE=? , COULEUR=? , KILOMETRAGE=? , TARIF=? WHERE MATRICULE=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, voiture.getMarque());
                    preparedStatement.setString(2, voiture.getModele());
                preparedStatement.setString(3, voiture.getCouleur());
                   preparedStatement.setString(4, voiture.getKilometrage());
                preparedStatement.setString(5, voiture.getTarif());
                preparedStatement.setInt(6, voiture.getMatricule());
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
        if (find(voiture.getMatricule()) != null) { 

            String sql = "DELETE FROM VOITURE WHERE MATRICULE=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, voiture.getMatricule());
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
                list.add(new Voiture(resultSet.getInt("MATRICULE"), resultSet.getString("MARQUE"), resultSet.getString("MODELE"),resultSet.getString("COULEUR"),resultSet.getString("KILOMETRAGE"),resultSet.getString("TARIF")));
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

    @Override
    public Voiture find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}*/
