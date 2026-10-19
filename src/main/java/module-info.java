module cl.duoc.tienda {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens cl.duoc.tienda to javafx.fxml;
    exports cl.duoc.tienda;
    exports cl.duoc.tienda.controller;
    opens cl.duoc.tienda.controller to javafx.fxml;
}