/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.gui;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class SplashController implements Initializable {
    @FXML
              private  ProgressIndicator p6 ;
    @FXML
    private AnchorPane splash;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

       Task<ObservableList<DailySales>> task = new GetDailySalesTask();
        p6.progressProperty().bind(task.progressProperty());
         p6.setVisible(true);
          new Thread(task).start();
        task.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

           @Override
           public void handle(WorkerStateEvent t) {
               System.out.println("hjhhhhh");
            URL url = getClass().getResource("Choix.fxml");
        FXMLLoader fxmlloader = new FXMLLoader();
    fxmlloader.setLocation(url); 
    fxmlloader.setBuilderFactory(new JavaFXBuilderFactory());
    splash.getChildren().clear();
               try {
                   splash.getChildren().add((Node) fxmlloader.load(url.openStream()));
               } catch (IOException ex) {
                   Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
               }
     
           }
       });
       // veil.visibleProperty().bind(task.runningProperty());
       // p6.visibleProperty().bind(task.runningProperty());
    
      
//         for (int i = 0; i < 4; i++) {
//             try {
//                 System.out.println("hello");
//                 Thread.sleep(1000);
//                 
//                 p6.setProgress(i);
//             } catch (InterruptedException ex) {
//                 Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
//             }
//            }
 
 
      
    }
    
}
  class GetDailySalesTask extends Task<ObservableList<DailySales>> {       
        @Override protected ObservableList<DailySales> call() throws Exception {
            for (int i = 0; i < 500; i++) {
                updateProgress(i, 500);
                Thread.sleep(5);
            }
            ObservableList<DailySales> sales = FXCollections.observableArrayList();
            sales.add(new DailySales(1, 5000, new Date()));
            sales.add(new DailySales(2, 2473, new Date(0)));
            return sales;
        }
    }
 
   class DailySales {
 
        private Integer dailySalesId;
        private Integer quantity;
        private Date date;
 
        public DailySales() {
        }
 
        public DailySales(int id, int qty, Date date) {
            this.dailySalesId = id;
            this.quantity = qty;
            this.date = date;
        }
 
        public Integer getDailySalesId() {
            return dailySalesId;
        }
 
        public void setDailySalesId(Integer dailySalesId) {
            this.dailySalesId = dailySalesId;
        }
 
        public Integer getQuantity() {
            return quantity;
        }
 
        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
 
        public Date getDate() {
            return date;
        }
 
        public void setDate(Date date) {
            this.date = date;
        }
    }

