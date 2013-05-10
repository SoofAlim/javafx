/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.gui;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JFileChooser;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class MenuClientController implements Initializable {
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    URL url;
    Mail mail = new Mail();
@FXML 
public AnchorPane menuclient ;
@FXML
public AnchorPane propvoiture;
@FXML
public TextField jTextMailAddressSender;
@FXML
public TextField jPassworSender;
@FXML
public TextField jTextMailAddressReceiver;
@FXML
public TextField jTextmailsubject;
@FXML
public TextArea jTextArea1;
@FXML
public Button jButtonSendMail;
@FXML
public Button jButton1 ;
@FXML
public Label jLabelpieceJointe;

   @FXML
    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        JFileChooser chooser = new JFileChooser();
        int option = chooser.showOpenDialog(null);
        if(option == JFileChooser.APPROVE_OPTION){
            try{
                url = chooser.getSelectedFile().toURL();
                System.out.println(url);
                jLabelpieceJointe.setText(url.toString());
               
            }
            catch(MalformedURLException exception){
                System.out.println("The URL was malformed ... ");
              
            }
        }
    
    }
   @FXML
     private void jButtonSendMailActionPerformed(ActionEvent evt) {                                                
        mail.setMailAddressRecipient(jTextMailAddressReceiver.getText());
        mail.setPwd(jPassworSender.getText());
        mail.setMailAddressSender(jTextMailAddressSender.getText());
        mail.setMailSubject(jTextmailsubject.getText());
        String[] lines = jTextArea1.getText().split("\\n");
        String msg="";
        for(String s:lines){
            msg = msg+s;
        }
        mail.setMailObject(msg);
        //System.out.println(jTextArearObject.getToolTipText());
        
        MailConstruction mc = new MailConstruction();
        mc.getMailProperties();
        
        String s = this.cleanUrl(url);
        mc.getMailMessage(s, mail);
        mc.SendMessage();
        
        
        
        
        
    }                                               

    public String cleanUrl(URL url){
        
        String s = url.toString();
        System.out.println("Before Clean");
        System.out.println(s);
        String delims = "/";
        String[] tokens = s.split(delims);
        System.out.println("After Clean");
        String mailPart="";
        for (int i=1;i<tokens.length;i++){
            mailPart+=tokens[i]+"\\\\";
        }
        System.out.println(mailPart);
        return mailPart;
    }
    
     @FXML
    private void DecoClient(ActionEvent event) throws IOException {
        
        URL url = getClass().getResource("AuthClient.fxml");
      
             FXMLLoader fxmlloader = new FXMLLoader();
             
             fxmlloader.setLocation(url); 
             menuclient.getChildren().clear();
             menuclient.getChildren().add((Node) fxmlloader.load(url.openStream()));
             fxmlloader.setBuilderFactory(new JavaFXBuilderFactory());
       
    }
     
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
