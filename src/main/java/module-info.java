module com.kennet.sistemasoperativos.proyectosistemasoperativos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.kennet.sistemasoperativos.proyectosistemasoperativos to javafx.fxml;
    exports com.kennet.sistemasoperativos.proyectosistemasoperativos;
}