/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biwta_ferry.root;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class LOGINController implements Initializable {

    @FXML
    private AnchorPane ANC_login;
    @FXML
    private ComboBox cmb_User;
    @FXML
    private TextField User_ID_input;
    @FXML
    private PasswordField pass_input;
    @FXML
    private Button login_btn;
    @FXML
    private Button cancel_btn;
    
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    void Select(ActionEvent event) {
        String s = cmb_User.getSelectionModel().getSelectedItem().toString();
    }   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list;
        list = FXCollections.observableArrayList("Admin","Passenger","Fairry Operator","BIWTA Supervisor","Technician");
       
        cmb_User.setItems(list);
    }
    @FXML
    private void login_btn_Mouse_click(MouseEvent event) {
    }

    @FXML
    private void Erase_UserID_ONClick(MouseEvent event) {
        User_ID_input.clear();
    }

    @FXML
    private void Erase_Pass_ONClick(MouseEvent event) {
        pass_input.clear();
    }

    @FXML
    private void Cancle_Program(ActionEvent event) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("You Have cancel the process");
        a.showAndWait();
    }

    @FXML
    void Access_next_page(ActionEvent event) throws IOException {
            root = FXMLLoader.load(getClass().getResource("Admin.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Welcome!!!!");
            stage.setScene(scene);
            stage.show();
    }
}
