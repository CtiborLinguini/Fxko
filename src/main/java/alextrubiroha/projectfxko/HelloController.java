package alextrubiroha.projectfxko;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label menoPriezvisko;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Testing");
    }
    @FXML
    protected void tlacitko() {welcomeText.setText("Testing 2"); }
}