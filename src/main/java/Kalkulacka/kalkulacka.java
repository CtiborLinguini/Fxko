package Kalkulacka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class kalkulacka {

public class KalkulackaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(KalkulackaApplication.class
                .getResource("kalfxml.fxml"));
        Scene scene = new Scene();
        stage.setTitle("GridPane Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setAlwaysOnTop(false);
        stage.show();
    }
        public static void main(String[] args) {
            launch();
        }
    }
}
