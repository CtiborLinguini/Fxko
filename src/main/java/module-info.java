module alextrubiroha.projectfxko {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;

    opens alextrubiroha.projectfxko to javafx.fxml;
    exports alextrubiroha.projectfxko;
}