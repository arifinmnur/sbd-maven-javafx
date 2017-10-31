package com.sbd12.sewamobil12.controller;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class FXMLController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane rootPanel;

    @FXML
    private JFXButton btAC1;
    
   /* @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    } */

   @FXML
   private void clicksTombol1()
   { try{
       rootPanel.getChildren().clear();
       AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Panel.fxml"));
       rootPanel.getChildren().setAll(pane);

       System.out.println("berhasi");
   }catch (Exception e){

   }
       System.out.println("You clicked me!");
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
