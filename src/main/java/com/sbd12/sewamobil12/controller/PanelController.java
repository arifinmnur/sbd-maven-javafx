package com.sbd12.sewamobil12.controller;


import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class PanelController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTreeTableView<MerkMobil> treeView;

    @FXML
    private JFXTextField tf_Id_merk;

    @FXML
    private JFXTextField tf_produsen;

    @FXML
    private JFXTextField tf_jenis_mobil;

    @FXML
    private JFXTextField tf_nama;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        JFXTreeTableColumn<MerkMobil, String> deptName = new JFXTreeTableColumn<>("Department");
        deptName.setPrefWidth(150);
        deptName.setCellValueFactory((TreeTableColumn.CellDataFeatures<MerkMobil, String> param) -> param.getValue().getValue().idJenis);

        JFXTreeTableColumn<MerkMobil, String> ageCol = new JFXTreeTableColumn<>("Age");
        ageCol.setPrefWidth(150);
        ageCol.setCellValueFactory((TreeTableColumn.CellDataFeatures<MerkMobil, String> param) -> param.getValue().getValue().idProd);

        JFXTreeTableColumn<MerkMobil, String> nameCol = new JFXTreeTableColumn<>("Name");
        nameCol.setPrefWidth(150);
        nameCol.setCellValueFactory((TreeTableColumn.CellDataFeatures<MerkMobil, String> param) -> param.getValue().getValue().idMerkMobil);



        ObservableList<MerkMobil> users = FXCollections.observableArrayList();
        users.add(new MerkMobil("Computer Department", "23", "CD 1"));
        users.add(new MerkMobil("Sales Department", "22", "Employee 1"));
        users.add(new MerkMobil("Sales Department", "22", "Employee 2"));
        users.add(new MerkMobil("Sales Department", "25", "Employee 4"));
        users.add(new MerkMobil("Sales Department", "25", "Employee 5"));
        users.add(new MerkMobil("IT Department", "42", "ID 2"));
        users.add(new MerkMobil("HR Department", "22", "HR 1"));
        users.add(new MerkMobil("HR Department", "22", "HR 2"));


        final TreeItem<MerkMobil> root = new RecursiveTreeItem<MerkMobil>(users, RecursiveTreeObject::getChildren);
        treeView.getColumns().setAll(deptName, ageCol, nameCol);
        treeView.setRoot(root);
        treeView.setShowRoot(false);
    }

    class MerkMobil extends RecursiveTreeObject<MerkMobil> {

        StringProperty idMerkMobil;
        StringProperty idProd;
        StringProperty idJenis;

        public MerkMobil(String idMerkMobil, String idProd,String idJenis ) {
            this.idJenis = new SimpleStringProperty(idJenis);
            this.idMerkMobil = new SimpleStringProperty(idMerkMobil);
            this.idProd = new SimpleStringProperty(idProd);
        }

    }
}
