/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.tests.client;

import location.app.dao.ClientDAO;
import location.app.persistence.Client;

/**
 *
 * @author HP
 */
public class TestCreateClient {
     public static void main(String[] args) {
        Client d = new Client(9,"Informatidfgfdgque","Cité El Ghazela","aa","aaa",4,"bb","aa");
        ClientDAO edao = new ClientDAO();
        edao.create(d);
    }
}
