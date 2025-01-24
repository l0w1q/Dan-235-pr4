package ru.dan.dantask4;

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
        int N = Integer.parseInt(Field.getText());
        if (N <= 0) {
            Label.setText("Введите число больше 0");
            return;
        }
        int K = 1;
        while (K * K <= N) {
            K++;
        }
        Label.setText("Наименьшее K: " + K);
    }


}

