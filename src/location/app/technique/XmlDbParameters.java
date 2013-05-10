/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.technique;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author esprit
 */


/*
 * XmlDbParameters : Intéraction avec le fichier xml contenant les paramètres 
 * de connexion à la base de données.
 * Respnsabilités : 
 *  1- Une première création du fichier xml qui contiendra des valeurs par défaut d'une connxion.
 *      la méthode est : createDBProperties.
 *  2- Récupération des valeurs enregistrés dans le fichier xml.
 *      la méthode est : getDBProperties.
 *  3- Mise à jour des valeurs 
 *      la méthode est : updateDBProperty.
 */


public class XmlDbParameters {

    public static String filepath = "./config-db.xml";

    public static Map<String, String> getDBProperties() {
        /**
         * Utilisation d'une collecction de type Map
         *  le fichier xml est de la forme suivante : 
         * **********************************************************
         * <?xml version="1.0" encoding="UTF-8" standalone="no"?>
         *  <datasource>
         *       <servername>127.0.0.1</servername>
         *       <username>root</username>
         *       <password>root</password>
         *       <schema>dbapp</schema>
         *   </datasource>
         * **********************************************************
         * pour accéder à une valeur de l'élément servername par exemple :
         *    - servername : sera la clé de la map.
         *    - 127.0.0.1 : sera la valeur de cette clé.
         */
        Map<String, String> properties = new HashMap<String, String>();
        try {
            File fXmlFile = new File(filepath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            Node node1 = doc.getElementsByTagName("servername").item(0).getChildNodes().item(0);
            String servername = node1.getNodeValue();
            Node node2 = doc.getElementsByTagName("username").item(0).getChildNodes().item(0);
            String username = node2.getNodeValue();
            Node node3 = doc.getElementsByTagName("password").item(0).getChildNodes().item(0);
            String password = node3.getNodeValue();
            Node node4 = doc.getElementsByTagName("schema").item(0).getChildNodes().item(0);
            String schema = node4.getNodeValue();
            properties.put("servername", servername);
            properties.put("username", username);
            properties.put("password", password);
            properties.put("schema", schema);
        } catch (SAXException ex) {
        } catch (IOException ex) {
        } catch (ParserConfigurationException ex) {
        }
        return properties;
    }

    public static void updateDBProperty(String elementName, String elementValue) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);
            Node background = doc.getElementsByTagName("datasource").item(0);
            // loop the datasource child node
            NodeList list = background.getChildNodes();
            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                // get the sub element, and update the value
                if (elementName.equals(node.getNodeName())) {
                    node.setTextContent(elementValue);
                }
            }
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);
            System.out.println("Done");
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
    }

    public static void createDBProperties(String servername, String username, String password, String schema) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            // root element
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("datasource");
            doc.appendChild(rootElement);
            // servername element
            Element server = doc.createElement("servername");
            server.appendChild(doc.createTextNode(servername));
            rootElement.appendChild(server);
            // username element
            Element user = doc.createElement("username");
            user.appendChild(doc.createTextNode(username));
            rootElement.appendChild(user);
            // password element
            Element pwd = doc.createElement("password");
            pwd.appendChild(doc.createTextNode(password));
            rootElement.appendChild(pwd);
            // schema elements
            Element db = doc.createElement("schema");
            db.appendChild(doc.createTextNode(schema));
            rootElement.appendChild(db);
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);
            System.out.println("File saved!");
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }

    }
}
