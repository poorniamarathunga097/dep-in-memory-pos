package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class ManageCustomerFormController {
    public AnchorPane root;
    public JFXTextField txtCustomerId;
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public TableView tblCustomer;
    public TableColumn colCustomerId;
    public TableColumn colFullName;
    public TableColumn colAddress;
    public TableColumn colSalary;
    public TableColumn colOperate;
    public JFXTextField txtAddress1;

    public void btnAddCustomer_OnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateCustomer_OnAction(ActionEvent actionEvent) {
    }

    public void btnSearch_OnAction(ActionEvent actionEvent) {
    }
}
