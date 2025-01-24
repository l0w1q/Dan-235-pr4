module ru.dan.dantask5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dan.dantask5 to javafx.fxml;
    exports ru.dan.dantask5;
}