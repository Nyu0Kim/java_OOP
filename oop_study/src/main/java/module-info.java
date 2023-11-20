module com.practice.oop_study {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.practice.oop_study to javafx.fxml;
    exports com.practice.oop_study;
}