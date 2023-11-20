module com.practice.cannonball {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.practice.cannonball to javafx.fxml;
    exports com.practice.cannonball;
}