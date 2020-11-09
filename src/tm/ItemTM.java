package tm;

import javafx.scene.control.Button;

public class ItemTM {
    private String code;
    private String description;
    private int qtyOnHand;
    private double price;
    private Button btn;

    public ItemTM() {
    }

    public ItemTM(String code, String description, int qtyOnHand, double price, Button btn) {
        this.setCode(code);
        this.setDescription(description);
        this.setQtyOnHand(qtyOnHand);
        this.setPrice(price);
        this.setBtn(btn);
    }
    

    @Override
    public String toString() {
        return "ItemTM{" +
                "code='" + getCode() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", qtyOnHand=" + getQtyOnHand() +
                ", price=" + getPrice() +
                ", btn=" + getBtn() +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
