package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane root;

    public void btn_ManageCustomers_OnAction(ActionEvent actionEvent) {
        try {
            setUI("ManageCustomerForm");
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"No Such Page to load");
            e.printStackTrace();
        }
    }

    public void btn_ManageItems_OnAction(ActionEvent actionEvent) {
    }

    public void btn_PlaceOrder_OnAction(ActionEvent actionEvent) {
    }

    public void btn_OrderDetails_OnAction(ActionEvent actionEvent) {
    }
    public void setUI(String location) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/"+location+".fxml"))));
    }
}
