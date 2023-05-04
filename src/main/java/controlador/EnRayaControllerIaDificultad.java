package controlador;

import zzettazz.senth.el3enraya.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class EnRayaControllerIaDificultad {

    @FXML
    void empezarjugadorvsiadificil(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("rayaia-dificil-view.fxml"));
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

    @FXML
    void empezarjugadorvsiafacil(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("rayaia-facil-view.fxml"));
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
    void empezarjugadorvsiamedio(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("rayaia-medio-view.fxml"));
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
