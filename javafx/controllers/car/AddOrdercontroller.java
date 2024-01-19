package javafx.controllers.car;

import javafx.entity.Orders;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class AddOrdercontroller implements Initializable {
    @FXML
    private TextField ipFullName;
    @FXML
    private TextArea ipAddress;

    @FXML
    private TextField ipIDCar;
    @FXML
    private TextField ipDays;
    @FXML
    private TextField ipNameCar;

    public void AddOrderController() {
    }
    public void submit(ActionEvent actionEvent) {
        String fullName = ipFullName.getText();
        String address = ipAddress.getText();
        String car = ipIDCar.getText();
        String days = ipDays.getText();
        String namecar = ipNameCar.getText();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void closeaddorders(ActionEvent actionEvent) {
        Stage parentStage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        parentStage.close();
    }
}
