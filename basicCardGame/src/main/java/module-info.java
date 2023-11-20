module com.practice.basiccardgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.practice.basiccardgame to javafx.fxml;
    exports com.practice.basiccardgame;
}