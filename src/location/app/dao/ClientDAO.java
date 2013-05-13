/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.dao;

import location.app.persistence.Client;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;

/**
 *
 * @author esprit
 */
public class ClientDAO extends IDAO<Client> {

    @Override
    public Client find(int idclient) {
        String sql = "SELECT * FROM CLIENT WHERE IDCLIENT=?";
        Client found = null; 
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idclient);
            resultSet = preparedStatement.executeQuery(); 
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Client(resultSet.getInt("IDCLIENT"), resultSet.getString("NOM"), resultSet.getString("PRENOM"),resultSet.getString("ADRESSE"),resultSet.getString("MAIL"),resultSet.getInt("IDCLIENT"),resultSet.getString("LOGIN"),resultSet.getString("PASSWORD"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "find departement failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
    }
    

    @Override
    public void create(Client client) {
        if (find(client.getIdclient().getValue()) == null) { 
            
            String sql = "INSERT INTO CLIENT(IDCLIENT, NOM, PRENOM ,ADRESSE , MAIL, CIN ,LOGIN , PASSWORD) VALUES (NULL,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, client.getIdclient().getValue());
                preparedStatement.setString(2, client.getNom().getValue());
                preparedStatement.setString(3, client.getAdresse().getValue());
                preparedStatement.setString(4, client.getAdresse().getValue());
                preparedStatement.setString(5, client.getMail().getValue());
                preparedStatement.setInt(6, client.getCin().getValue());
                preparedStatement.setString(7, client.getLogin().getValue());
                preparedStatement.setString(8, client.getPassword().getValue());
                
                preparedStatement.executeUpdate(); 
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "insert failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }    

    }

    @Override
    public void update(Client client) {
        if (find(client.getIdclient().getValue()) != null) { 

            String sql = "UPDATE CLIENT SET NOM=?, PRENOM=? , ADRESSE=? , MAIL=? , CIN=? ,LOGIN=? , PASSWORD=? WHERE IDCLIENT=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, client.getIdclient().getValue());
                preparedStatement.setString(2, client.getNom().getValue());
                preparedStatement.setString(3, client.getPrenom().getValue());
                preparedStatement.setString(4, client.getAdresse().getValue());
                preparedStatement.setString(5, client.getMail().getValue());
                preparedStatement.setInt(6, client.getCin().getValue());
                preparedStatement.setString(7, client.getLogin().getValue());
                preparedStatement.setString(8, client.getPassword().getValue());
             
                   
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void delete(Client client) {
        if (find(client.getIdclient().getValue()) != null) { 

            String sql = "DELETE FROM CLIENT WHERE IDCLIENT=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, client.getIdclient().getValue());
                preparedStatement.executeUpdate();
                                                  
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }

        }
    }

    @Override
    public ObservableList<Client> findAll() {
        ObservableList<Client> list = (ObservableList<Client>) new ArrayList<Client>();
        String sql = "SELECT * FROM CLIENT";
        Statement statement = null; 
        ResultSet resultSet = null; 
        
        try {
            statement = connection.createStatement(); 
            resultSet = statement.executeQuery(sql);  
            System.out.println(sql);
            while (resultSet.next()) {
                list.add(new Client(resultSet.getInt("IDCLIENT"), resultSet.getString("NOM"), resultSet.getString("PRENOM"),resultSet.getString("ADRESSE"),resultSet.getString("MAIL"),resultSet.getInt("CIN"), resultSet.getString("LOGIN"),resultSet.getString("PASSWORD")));
            }


        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "find all clients failed", ex);
        } finally {            
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return list;
    }
    
    
}
