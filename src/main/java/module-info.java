module com.example.targetheartbeat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.targetheartbeat to javafx.fxml;
    exports com.example.targetheartbeat;
}