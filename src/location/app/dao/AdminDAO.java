/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.dao;

import location.app.persistence.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author esprit
 */
public class AdminDAO extends IDAO<Admin> {

    @Override
    public Admin find(int idadmin) {
        String sql = "SELECT * FROM ADMIN WHERE IDADMIN=?";
        Admin found = null; 
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idadmin);
            resultSet = preparedStatement.executeQuery(); 
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Admin(resultSet.getInt("IDADMIN"), resultSet.getString("NOM"), resultSet.getString("PRENOM"),resultSet.getString("ADRESSE"),resultSet.getString("MAIL"),resultSet.getString("LOGIN"),resultSet.getString("PASSWORD"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, "find departement failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
    }
    

    @Override
    public void create(Admin admin) {
        if (find(admin.getIdadmin().getValue()) == null) { 
            
            String sql = "INSERT INTO ADMIN(IDADMIN, NOM, PRENOM ,ADRESSE , MAIL , LOGIN , PASSWORD) VALUES (NULL,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, admin.getIdadmin().getValue());
                preparedStatement.setString(2, admin.getNom().getValue());
                preparedStatement.setString(3, admin.getPrenom().getValue());
                preparedStatement.setString(4, admin.getAdresse().getValue());
                preparedStatement.setString(5, admin.getMail().getValue());
                preparedStatement.setString(6, admin.getLogin().getValue());
                preparedStatement.setString(7, admin.getPassword().getValue());
                preparedStatement.executeUpdate(); 
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, "insert failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }    

    }

    @Override
    public void update(Admin admin) {
        if (find(admin.getIdadmin().getValue()) != null) { 

            String sql = "UPDATE ADMIN SET NOM=?, PRENOM=? , ADRESSE=? , MAIL=? , LOGIN=? , PASSWORD=? WHERE IDADMIN=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, admin.getNom().getValue());
                preparedStatement.setString(2, admin.getPrenom().getValue());
                preparedStatement.setString(3, admin.getAdresse().getValue());
                preparedStatement.setString(4, admin.getMail().getValue());
                preparedStatement.setString(5, admin.getLogin().getValue());
                preparedStatement.setString(6, admin.getPassword().getValue());
                preparedStatement.setInt(7, admin.getIdadmin().getValue());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void delete(Admin admin) {
        if (find(admin.getIdadmin().getValue()) != null) { 

            String sql = "DELETE FROM ADMIN WHERE IDADMIN=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, admin.getIdadmin().getValue());
                preparedStatement.executeUpdate();
                                                  
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }

        }
    }

    @Override
    public List<Admin> findAll() {
        List<Admin> list = new ArrayList<Admin>();
        String sql = "SELECT * FROM ADMIN";
        Statement statement = null; 
        ResultSet resultSet = null; 
        
        try {
            statement = connection.createStatement(); 
            resultSet = statement.executeQuery(sql);  
            System.out.println(sql);
            while (resultSet.next()) {
                list.add(new Admin(resultSet.getInt("IDADMIN"), resultSet.getString("NOM"), resultSet.getString("PRENOM"),resultSet.getString("ADRESSE"),resultSet.getString("MAIL"),resultSet.getString("LOGIN"),resultSet.getString("PASSWORD")));
            }


        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, "find all employees failed", ex);
        } finally {            
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return list;
    }
    
    
}
