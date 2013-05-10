/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.dao;
import location.app.persistence.Location;
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
 * @author DELL
 */
public class LocationDAO extends IDAO<Location> {

    @Override
    public Location find(int idclient) {
        String sql = "SELECT * FROM location WHERE idlocation=?";
        Location found = null; 
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idclient);
            resultSet = preparedStatement.executeQuery(); 
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Location(resultSet.getInt("IDCLIENT"), resultSet.getInt("IDVOITURE"), resultSet.getString("DATEDEBUT"),resultSet.getString("DATEFIN"),resultSet.getFloat("TARIF"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, "find departement failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
        
    }

    @Override
    public void create(Location location) {
        if (find(location.getIdClient().getValue())== null){
            
            String sql = "INSERT INTO VOITURE(IDCLIENT, IDVOITURE,DATEDEBUT,DATEFIN,DATEDEBUT, TARIF) VALUES (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, location.getIdClient().getValue());
                preparedStatement.setInt(2, location.getIdvoiture().getValue());
                preparedStatement.setString(3, location.getDatedebut().getValue());
                  preparedStatement.setString(4, location.getDatefin().getValue());
                    preparedStatement.setFloat(5, location.getTarif().getValue());
                   
                preparedStatement.executeUpdate(); 
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, "insert failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                   Logger.getLogger(Voiture.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
           
        }
    }

    @Override
    public void update(Location location) {
         if (find(location.getIdClient().getValue())!= null) { 

            String sql = "UPDATE LOCATION SET IDCLIENT=?, IDVOITURE=? , DATEDEBUT=? , DATEFIN=? , TARIF=? WHERE IDCLIENT=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, location.getIdClient().getValue());
                    preparedStatement.setInt(2, location.getIdvoiture().getValue());
                preparedStatement.setString(3, location.getDatedebut().getValue());
                   preparedStatement.setString(4, location.getDatefin().getValue());
                preparedStatement.setFloat(5, location.getTarif().getValue());

                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void delete(Location location) {
        
    }

    @Override
    public List<Location> findAll() {
        return null;
       
    }
    
}
