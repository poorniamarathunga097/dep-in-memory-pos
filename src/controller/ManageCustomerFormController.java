package controller;

import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Customer;
import tm.CustomerTM;

public class ManageCustomerFormController {
    public AnchorPane root;
    public JFXTextField txtCustomerId;
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public TableView<CustomerTM> tblCustomer;
    public TableColumn colCustomerId;
    public TableColumn colFullName;
    public TableColumn colAddress;
    public TableColumn colSalary;
    public TableColumn colOperate;
    public JFXTextField txtSalary;

    public void initialize(){

        tblCustomer.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tblCustomer.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCustomer.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("address"));
        tblCustomer.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("salary"));
        tblCustomer.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("btn"));

        loadAllCustomers();
    }

    private void loadAllCustomers() {
        ObservableList<CustomerTM> cList = FXCollections.observableArrayList();
        for (Customer c: Database.customerDataTable
             ) {
            Button btn = new Button("Delete");
            CustomerTM tm = new CustomerTM(c.getId(),c.getName(),c.getAddress(),c.getSalary(),btn);
            cList.add(tm);
        }
        tblCustomer.setItems(cList);
    }

    public void btnAddCustomer_OnAction(ActionEvent actionEvent) {
        try{
        double salary = Double.parseDouble(txtSalary.getText());
        } catch (Exception e) {
            new Alert(Alert.AlertType.WARNING, e.toString(),
                    ButtonType.OK).show();
            return;
        }

        Customer c1 = new Customer(
                txtCustomerId.getText(),
                txtName.getText(),
                txtAddress.getText(),
                Double.parseDouble(txtSalary.getText())
        );
        boolean isAdded = Database.customerDataTable.add(c1);
        if (isAdded) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved !!",
                    ButtonType.OK).show();
                    loadAllCustomers();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again !!",
                    ButtonType.OK).show();
        }
    }

    public void btnUpdateCustomer_OnAction(ActionEvent actionEvent) {
    }

    public void btnSearch_OnAction(ActionEvent actionEvent) {
    }
}
