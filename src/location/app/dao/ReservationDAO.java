/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.dao;
import location.app.persistence.Reservation;
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
public class ReservationDAO extends IDAO<Reservation> {

    @Override
    public Reservation find(int idreservation) {
        String sql = "SELECT * FROM reservation WHERE idreservation=?";
        Reservation found = null; 
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idreservation);
            resultSet = preparedStatement.executeQuery(); 
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Reservation(resultSet.getInt("IDRESERVATION"),resultSet.getInt("IDCLIENT"), resultSet.getInt("IDVOITURE"), resultSet.getString("DATEDEBUT"),resultSet.getString("DATEFIN"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, "find departement failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
        
    }

    @Override
    public void create(Reservation reservation) {
        if (find(reservation.getIdreservation().getValue()) == null) {
            
            String sql = "INSERT INTO RESERVATION(IDRESERVATION,IDCLIENT, IDVOITURE,DATEDEBUT,DATEFIN) VALUES (NULL,?,?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, reservation.getIdreservation().getValue());
                preparedStatement.setInt(2, reservation.getIdClient().getValue());
                preparedStatement.setInt(3, reservation.getIdvoiture().getValue());
                preparedStatement.setString(4, reservation.getDatedebut().getValue());
                preparedStatement.setString(5, reservation.getDatefin().getValue());
              
                   
                preparedStatement.executeUpdate(); 
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, "insert failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                   Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
           
        }
    }

    @Override
    public void update(Reservation reservation) {
         if (find(reservation.getIdreservation().getValue())!= null) { 

            String sql = "UPDATE RESERVATION SET IDCLIENT=?, IDVOITURE=? , DATEDEBUT=? , DATEFIN=? WHERE IDRESERVATION=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setInt(1, reservation.getIdreservation().getValue());
                preparedStatement.setInt(2, reservation.getIdClient().getValue());
                preparedStatement.setInt(3, reservation.getIdvoiture().getValue());
                preparedStatement.setString(4, reservation.getDatedebut().getValue());
                preparedStatement.setString(5, reservation.getDatefin().getValue());
                
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

     @Override
    public void delete(Reservation reservation) {
        if (find(reservation.getIdreservation().getValue()) == null) { 

            String sql = "DELETE FROM RESERVATION WHERE IDRESERVATION=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, reservation.getIdreservation().getValue());
                preparedStatement.executeUpdate();
                                                  
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }

        }
    }

   @Override
    public List<Reservation> findAll() {
        List<Reservation> list = new ArrayList<Reservation>();
        String sql = "SELECT * FROM RESERVATION";
        Statement statement = null; 
        ResultSet resultSet = null; 
        
        try {
            statement = connection.createStatement(); 
            resultSet = statement.executeQuery(sql);  
            System.out.println(sql);
            while (resultSet.next()) {
                list.add(new Reservation(resultSet.getInt("IDRESERVATION"),resultSet.getInt("IDCLIENT"), resultSet.getInt("IDVOITURE"), resultSet.getString("DATEDEBUT"),resultSet.getString("DATEFIN")));
            }


        } catch (SQLException ex) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, "find all reservation failed", ex);
        } finally {            
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return list;
    }

    
    
}
