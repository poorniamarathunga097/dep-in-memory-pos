package controller;

import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    public JFXTextField txtAddress1;

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
    }

    public void btnUpdateCustomer_OnAction(ActionEvent actionEvent) {
    }

    public void btnSearch_OnAction(ActionEvent actionEvent) {
    }
}
