module com.controlhand.controlhandinteration {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.controlhand.controlhandinteration to javafx.fxml;
    exports com.controlhand.controlhandinteration;
}