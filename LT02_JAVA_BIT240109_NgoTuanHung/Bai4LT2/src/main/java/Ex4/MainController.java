package Ex4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField txtCelsius;

    @FXML
    private Label lblResult;

    @FXML
    private void convertTemperature() {

        double c = Double.parseDouble(txtCelsius.getText());

        double f = c * 9 / 5 + 32;

        lblResult.setText("Fahrenheit: " + f);
    }
}