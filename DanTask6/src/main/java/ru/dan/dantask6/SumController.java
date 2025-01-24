package ru.dan.dantask6;

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
    void SumButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(Field.getText());
        boolean Value = false;

        while (N > 0) {
            int digit = N % 10;
            if (digit % 2 == 0) {
                Value = true;
                break;
            }
            N /= 10;
        }
        Label.setText(String.valueOf(Value));
    }
}