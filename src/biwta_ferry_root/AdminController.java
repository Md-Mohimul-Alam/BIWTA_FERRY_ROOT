/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biwta_ferry_root;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class AdminController implements Initializable {

    @FXML
    private AnchorPane ANC_admin;
    @FXML
    private MenuButton Menu_Admin;
    @FXML
    private MenuItem Creat_New_User;
    @FXML
    private MenuItem Update_user;
    @FXML
    private MenuItem Bug_Report;
    @FXML
    private Button Log_Out;
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Creat_New_User(ActionEvent event) {
    }

    @FXML
    private void Update_user(ActionEvent event) {
    }

    @FXML
    private void Bug_Report(ActionEvent event) {
    }

    @FXML
        void clickToLogin(ActionEvent event) throws IOException{
        //if(s.getValue().equals("Manager")){
            root = FXMLLoader.load(getClass().getResource("manager.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        //}
    }
    
}
