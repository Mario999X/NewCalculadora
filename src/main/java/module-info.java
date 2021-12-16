module com.example.newcalculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newcalculadora to javafx.fxml;
    exports com.example.newcalculadora;
}