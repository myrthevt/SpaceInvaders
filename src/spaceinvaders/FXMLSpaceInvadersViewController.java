/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class FXMLSpaceInvadersViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane achtergrond;

    @FXML
    private ImageView alien;

    @FXML
    void initialize() {
        assert achtergrond != null : "fx:id=\"achtergrond\" was not injected: check your FXML file 'Untitled'.";
        assert alien != null : "fx:id=\"alien\" was not injected: check your FXML file 'Untitled'.";

    }
}
   
    

