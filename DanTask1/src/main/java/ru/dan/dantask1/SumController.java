package ru.dan.dantask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label Label;

    @FXML
    private TextField TextField;

    @FXML
    private TextField TextField2;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(TextField.getText());
        int b = Integer.parseInt(TextField2.getText());
        double Izmass;

        switch (a) {
            case 1:
                Izmass = b;
                Label.setText("Масса в килограммах: " + Izmass);
                break;
            case 2:
                Izmass = b * 1_000_000;
                Label.setText("Масса в миллиграммах: " + Izmass);
                break;
            case 3:
                Izmass = b * 1_000;
                Label.setText("Масса в граммах: " + Izmass);
                break;
            case 4:
                Izmass = b / 1_000;
                Label.setText("Масса в тоннах: " + Izmass);
                break;
            case 5:
                Izmass = b / 0.1;
                Label.setText("Масса в центнерах: " + Izmass);
                break;
            default:
                Label.setText("неверный номер");
                break;
        }

    }

}
