package controlador;

import zzettazz.senth.el3enraya.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class InicioController
{
    @FXML
    private Button jugadorVsIa;

    @FXML
    private Button jugadorVsJugador;

    @FXML
    void empezarJugadorVsJugador()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("raya-jugadorvsjugador-view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Jugador VS Jugador");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Incidencia");
            alert.setContentText("Se ha producido el siguiente error.\n" + ex);
            alert.showAndWait();
        }
    }

    @FXML
    void empezarJugadorVsIa()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("seleccionar-dificultad-view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Jugador VS IA");
            stage.setScene(scene);

            //ICONO
            String rutaOriginal = System.getProperty("user.dir");
            String rutaCompleta = rutaOriginal.concat("/media").concat("/icono.png");
            stage.getIcons().add(new Image(rutaCompleta));

            stage.show();
        }
        catch (IOException ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Incidencia");
            alert.setContentText("Se ha producido el siguiente error.\n" + ex);
            alert.showAndWait();
        }
    }
}
