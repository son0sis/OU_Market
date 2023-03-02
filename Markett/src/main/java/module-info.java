module com.son.markett {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.son.markett to javafx.fxml;
    exports com.son.markett;
}
