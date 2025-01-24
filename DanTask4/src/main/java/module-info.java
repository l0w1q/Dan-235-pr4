module ru.dan.dantask4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dan.dantask4 to javafx.fxml;
    exports ru.dan.dantask4;
}