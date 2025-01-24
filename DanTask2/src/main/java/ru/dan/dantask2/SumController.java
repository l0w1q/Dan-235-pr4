package ru.dan.dantask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class SumController {

    @FXML
    private TextField Field;

    @FXML
    private TextField Field2;

    @FXML
    private Label Label;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(Field.getText());
        int b = Integer.parseInt(Field2.getText());
        String Piki;
        String Trefi;
        String Bubni;
        String Chervi;
        String Valet;
        String Dama;
        String Korol;
        String Tuz;
        String One;
        String Two;
        String Three;
        String Four;
        String Five;
        String Six;
        String Seven;
        String Eight;
        String Nine;
        String Ten;
        String resultb = "";
        String resulta = "";

        switch (b) {
            case 6:
                Six = "Шестёрка";
                resultb = Six;
                break;
            case 7:
                Seven = "Семь";
                resultb = Seven;
                break;
            case 8:
                Eight = "Восемь";
                resultb = Eight;
                break;
            case 9:
                Nine = "Девятка";
                resultb = Nine;
                break;
            case 10:
                Ten = "Десятка";
                resultb = Ten;
                break;
            case 11:
                Valet = "Валет";
                resultb = Valet;
                break;
            case 12:
                Dama = "Дама";
                resultb = Dama;
                break;
            case 13:
                Korol = "Король";
                resultb = Korol;
                break;
            case 14:
                Tuz = "Туз";
                resultb = Tuz;
                break;
        }


        switch (a) {
            case 1:
                Piki = "пики";
                resulta = Piki;
                break;
            case 2:
                Trefi = "трефы";
                resulta = Trefi;
                break;
            case 3:
                Bubni = "бубны";
                resulta = Bubni;
                break;
            case 4:
                Chervi = "червы";
                resulta = Chervi;
                break;
        }
        Label.setText(resultb + " " + resulta);
    }


}
