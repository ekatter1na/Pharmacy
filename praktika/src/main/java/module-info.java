module com.example.praktika {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.praktika to javafx.fxml;
    exports com.example.praktika;
}