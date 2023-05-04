package zzettazz.senth.el3enraya;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage.setTitle("3 en raya");
        stage.setScene(scene);

        //ICONO
        String rutaOriginal = System.getProperty("user.dir");
        String rutaCompleta = rutaOriginal.concat("/media").concat("/icono.png");
        stage.getIcons().add(new Image(rutaCompleta));

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}