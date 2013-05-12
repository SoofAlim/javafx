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
    public Location find(int idlocation) {
        String sql = "SELECT * FROM location WHERE idlocation=?";
        Location found = null; 
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idlocation);
            resultSet = preparedStatement.executeQuery(); 
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Location(resultSet.getInt("IDLOCATION"),resultSet.getInt("IDCLIENT"), resultSet.getInt("IDVOITURE"), resultSet.getString("DATEDEBUT"),resultSet.getString("DATEFIN"),resultSet.getFloat("TARIF"));
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
        if (find(location.getIdlocation().getValue())== null){
            
            String sql = "INSERT INTO VOITURE(IDLOCATION,IDCLIENT, IDVOITURE,DATEDEBUT,DATEFIN, TARIF) VALUES (NULL,?,?,?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, location.getIdlocation().getValue());
                preparedStatement.setInt(2, location.getIdclient().getValue());
                preparedStatement.setInt(3, location.getIdvoiture().getValue());
                preparedStatement.setString(4, location.getDatedebut().getValue());
                preparedStatement.setString(5, location.getDatefin().getValue());
                preparedStatement.setFloat(6, location.getTarif().getValue());
                   
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
                   Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
           
        }
    }

    @Override
    public void update(Location location) {
         if (find(location.getIdlocation().getValue())!= null) { 

            String sql = "UPDATE LOCATION SET IDCLIENT=?, IDVOITURE=? , DATEDEBUT=? , DATEFIN=? , TARIF=? WHERE IDLOCATION=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, location.getIdlocation().getValue());
                preparedStatement.setInt(2, location.getIdclient().getValue());
                preparedStatement.setInt(3, location.getIdvoiture().getValue());
                preparedStatement.setString(4, location.getDatedebut().getValue());
                preparedStatement.setString(5, location.getDatefin().getValue());
                preparedStatement.setFloat(6, location.getTarif().getValue());
                
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
        if (find(location.getIdlocation().getValue()) == null) { 

            String sql = "DELETE FROM LOCATION WHERE IDLOCATION=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, location.getIdlocation().getValue());
                preparedStatement.executeUpdate();
                                                  
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
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
    public List<Location> findAll() {
        List<Location> list = new ArrayList<Location>();
        String sql = "SELECT * FROM LOCATION";
        Statement statement = null; 
        ResultSet resultSet = null; 
        
        try {
            statement = connection.createStatement(); 
            resultSet = statement.executeQuery(sql);  
            System.out.println(sql);
            while (resultSet.next()) {
                list.add(new Location(resultSet.getInt("IDLOCATION"),resultSet.getInt("IDCLIENT"), resultSet.getInt("IDVOITURE"), resultSet.getString("DATEDEBUT"),resultSet.getString("DATEFIN"),resultSet.getFloat("TARIF")));
            }


        } catch (SQLException ex) {
            Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, "find all employees failed", ex);
        } finally {            
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return list;
    }

    
    
}
