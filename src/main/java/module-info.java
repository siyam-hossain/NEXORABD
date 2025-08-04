module com.sh.nexorabd {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.sh.nexorabd to javafx.fxml;
    exports com.sh.nexorabd;
}