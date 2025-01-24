module ru.dan.dantask6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dan.dantask6 to javafx.fxml;
    exports ru.dan.dantask6;
}