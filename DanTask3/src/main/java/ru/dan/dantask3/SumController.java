package ru.dan.dantask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.sqrt;

public class SumController {

    @FXML
    private TextField Field;

    @FXML
    private TextField Field2;

    @FXML
    private Label Label;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int q;
        double b;
        q = Integer.parseInt(Field.getText());
        b = Double.parseDouble(Field2.getText());

        double a = 0;
        double c = 0;
        double h = 0;
        double S = 0;

        switch (q) {
            case 1:
                a = b;
                c = a * sqrt(2);
                h = c / 2;
                S = (a * a) / 2;
                break;
            case 2:
                c = b;
                a = c / sqrt(2);
                h = c / 2;
                S = (c * c) / 4;
                break;
            case 3:
                h = b;
                c = h * 2;
                a = c / sqrt(2);
                S = (a * h) / 2;
                break;
            case 4:
                S = b;
                a = sqrt(S * 2);
                c = a * sqrt(2);
                h = c / 2;
                break;
            default:
                Label.setText("Ошибка: выберите правильный элемент");
                return;
        }
        Label.setText(String.format("Катет a: %.2f\nГипотенуза c: %.2f\nВысота h: %.2f\nПлощадь S: %.2f", a, c, h, S));

    }
}
