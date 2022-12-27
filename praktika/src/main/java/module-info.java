module com.example.praktika {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    requires org.testng;
    requires org.junit.jupiter.api;
    requires java.desktop;


    opens com.example.praktika to javafx.fxml;
    exports com.example.praktika;
}