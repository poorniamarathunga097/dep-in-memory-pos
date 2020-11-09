package controller;

import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Item;
import tm.ItemTM;

public class ManageItemFormController {
    public AnchorPane root;
    public JFXTextField txtItemCode;
    public JFXTextField txtDescription;
    public JFXTextField txtQtyOnHand;
    public TableView<ItemTM> tblItem;
    public TableColumn colItemCode;
    public TableColumn colDescription;
    public TableColumn colQtyOnHand;
    public TableColumn colPrice;
    public TableColumn colOperate;
    public JFXTextField txtPrice;

    public void initialize(){
        tblItem.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("code"));
        tblItem.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("description"));
        tblItem.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("qtyOnHand"));
        tblItem.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("price"));
        tblItem.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("btn"));

        loadAllItems();
    }

    private void loadAllItems() {
        ObservableList<ItemTM> iList = FXCollections.observableArrayList();
        for (Item i: Database.itemDataTable
        ) {
            Button btn = new Button("Delete");
            ItemTM tm = new ItemTM(i.getCode(),i.getDescription(),i.getQtyOnHand(),i.getPrice(),btn);
            iList.add(tm);
        }
        tblItem.setItems(iList);
    }

    public void btnAddItem_OnAction(ActionEvent actionEvent) {
        try {
            int qty = Integer.parseInt(txtQtyOnHand.getText());
            double unitPrice = Double.parseDouble(txtPrice.getText());
        } catch (Exception e) {
            new Alert(Alert.AlertType.WARNING,
                    "Something went wrong !",
                    ButtonType.OK).show();
            return;
        }

        Item i = new Item(
                txtItemCode.getText(),
                txtDescription.getText(),
                Integer.parseInt(txtQtyOnHand.getText()),
                Double.parseDouble(txtPrice.getText())
        );
        boolean isAdded = Database.itemDataTable.add(i);
        if (isAdded) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved !!",
                    ButtonType.OK).show();
            loadAllItems();
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
