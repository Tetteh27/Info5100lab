/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import model.User;

/**
 * FXML Controller class
 *
 * @author ProBook
 */
public class PrimaryFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    TextField nameTextField;
    
    @FXML
    TextField ageTextField;
    
    @FXML
    TextField emailTextField;
            
    public void submit (){
        Alert errorAlert = new Alert(AlertType.ERROR);
        errorAlert.setTitle("Error");
        errorAlert.setHeaderText("Input details");
        
        try{
            User userObject = new User();
        userObject.setName(nameTextField.getText().trim()); 
        userObject.setAge(parseInt(ageTextField.getText().trim()));
        userObject.setEmail(emailTextField.getText().trim());
        
        
        
        
        
        if (userObject.getName().isBlank()) {
            errorAlert.setContentText("Please enter your name");
            errorAlert.showAndWait();     
            } else if (userObject.getAge()<=0){
            errorAlert.setContentText("Please enter your Age");
            errorAlert.showAndWait();            
            } else if (userObject.getEmail().isBlank()){
            errorAlert.setContentText("Please enter your email");
            errorAlert.showAndWait();             
            } else {
                Alert userAlert = new Alert(AlertType.INFORMATION);
                userAlert.setTitle("Success");
                userAlert.setHeaderText("Thanks for submitting");
                userAlert.setContentText(userObject.toString());
                userAlert.showAndWait();
            }
        
        
    }catch (NullPointerException ne) {
            errorAlert.setContentText("Please enter details above");
            errorAlert.showAndWait();
            
        } catch (NumberFormatException nfe) {
            errorAlert.setContentText("Please enter valid number for age");
            errorAlert.showAndWait();
            
      } catch (Exception ex) {
            errorAlert.setContentText("An unexpected error occured:");
            errorAlert.showAndWait();
     
      }
}
}
