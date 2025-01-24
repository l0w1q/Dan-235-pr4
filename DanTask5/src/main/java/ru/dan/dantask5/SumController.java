package ru.dan.dantask5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField Field;

    @FXML
    private Label Label;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double P = Double.parseDouble(Field.getText());
        if (P <= 0 || P >= 50) {
            Label.setText("Введите правильное значение P");
            return;
        }

        double Dist = 10.0;
        double Dist2 = 0.0;
        int day = 0;

        while (Dist2 <= 200.0) {
            Dist2 += Dist;
            Dist += Dist * (P / 100);
            day++;
        }
        Label.setText("Кол-во дней: " + day + " Общий пробег: " + Dist2);


    }
}
