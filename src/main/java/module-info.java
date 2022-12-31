module com.example.apipractise {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.apipractise to javafx.fxml;
    exports com.example.apipractise;
}