package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EnRayaController {

    @FXML
    private Button botonEmpezar;

    @FXML
    private TextField casilla1;

    @FXML
    private TextField casilla2;

    @FXML
    private TextField casilla3;

    @FXML
    private TextField casilla4;

    @FXML
    private TextField casilla5;

    @FXML
    private TextField casilla6;

    @FXML
    private TextField casilla7;

    @FXML
    private TextField casilla8;

    @FXML
    private TextField casilla9;

    @FXML
    public TextField txtTurno;

    @FXML
    private TextField txtGanador;

    @FXML
    private Button botonResetear;

    @FXML
    void setX1(MouseEvent event)
    {
        if (!casilla1.getText().isBlank())
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null); // Podemos dejarlo a null
            alerta.setTitle("CASILLA OCUPADA");
            alerta.setContentText("Debes seleccionar una casilla vacía");
            alerta.showAndWait();
        }
        else if (casilla1.getText().isBlank())
        {
            if(turno%2==0) casilla1.setText("X");
            else if (turno%2!=0) casilla1.setText("O");
            else casilla1.setText("ERROR");
            siguienteTurno();
            comprobarEstado();
        }
    }

    @FXML
    void setX2(MouseEvent event)
    {
        if (!casilla2.getText().isBlank())
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null); // Podemos dejarlo a null
            alerta.setTitle("CASILLA OCUPADA");
            alerta.setContentText("Debes seleccionar una casilla vacía");
            alerta.showAndWait();
        }
        else if (casilla2.getText().isBlank())
        {
            if(turno%2==0) casilla2.setText("X");
            else if (turno%2!=0) casilla2.setText("O");
            else casilla2.setText("ERROR");
            siguienteTurno();
            comprobarEstado();
        }
    }

    @FXML
    void setX3(MouseEvent event)
    {
        if (!casilla3.getText().isBlank())
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null); // Podemos dejarlo a null
            alerta.setTitle("CASILLA OCUPADA");
            alerta.setContentText("Debes seleccionar una casilla vacía");
            alerta.showAndWait();
        }
        else if (casilla3.getText().isBlank())
        {
            if(turno%2==0) casilla3.setText("X");
            else if (turno%2!=0) casilla3.setText("O");
            else casilla3.setText("ERROR");
            siguienteTurno();
            comprobarEstado();
        }
    }

    @FXML
    void setX4(MouseEvent event)
    {
        if (!casilla4.getText().isBlank())
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null); // Podemos dejarlo a null
            alerta.setTitle("CASILLA OCUPADA");
            alerta.setContentText("Debes seleccionar una casilla vacía");
            alerta.showAndWait();
        }
        else if (casilla4.getText().isBlank())
        {
            if(turno%2==0) casilla4.setText("X");
            else if (turno%2!=0) casilla4.setText("O");
            else casilla4.setText("ERROR");
            siguienteTurno();
            comprobarEstado();
        }
    }

    @FXML
    void setX5(MouseEvent event)
    {
        if (!casilla5.getText().isBlank())
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null); // Podemos dejarlo a null
            alerta.setTitle("CASILLA OCUPADA");
            alerta.setContentText("Debes seleccionar una casilla vacía");
            alerta.showAndWait();
        }
        else if (casilla5.getText().isBlank())
        {
            if(turno%2==0) casilla5.setText("X");
            else if (turno%2!=0) casilla5.setText("O");
            else casilla5.setText("ERROR");
            siguienteTurno();
            comprobarEstado();
        }
    }

    @FXML
    void setX6(MouseEvent event)
    {
        if (!casilla6.getText().isBlank())
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null); // Podemos dejarlo a null
            alerta.setTitle("CASILLA OCUPADA");
            alerta.setContentText("Debes seleccionar una casilla vacía");
            alerta.showAndWait();
        }
        else if (casilla6.getText().isBlank())
        {
            if(turno%2==0) casilla6.setText("X");
            else if (turno%2!=0) casilla6.setText("O");
            else casilla6.setText("ERROR");
            siguienteTurno();
            comprobarEstado();
        }
    }

    @FXML
    void setX7(MouseEvent event)
    {
        if (!casilla7.getText().isBlank())
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null); // Podemos dejarlo a null
            alerta.setTitle("CASILLA OCUPADA");
            alerta.setContentText("Debes seleccionar una casilla vacía");
            alerta.showAndWait();
        }
        else if (casilla7.getText().isBlank())
        {
            if(turno%2==0) casilla7.setText("X");
            else if (turno%2!=0) casilla7.setText("O");
            else casilla7.setText("ERROR");
            siguienteTurno();
            comprobarEstado();
        }
    }

    @FXML
    void setX8(MouseEvent event)
    {
        if (!casilla8.getText().isBlank())
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null); // Podemos dejarlo a null
            alerta.setTitle("CASILLA OCUPADA");
            alerta.setContentText("Debes seleccionar una casilla vacía");
            alerta.showAndWait();
        }
        else if (casilla8.getText().isBlank())
        {
            if(turno%2==0) casilla8.setText("X");
            else if (turno%2!=0) casilla8.setText("O");
            else casilla8.setText("ERROR");
            siguienteTurno();
            comprobarEstado();
        }
    }

    @FXML
    void setX9(MouseEvent event)
    {
        if (!casilla9.getText().isBlank())
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null); // Podemos dejarlo a null
            alerta.setTitle("CASILLA OCUPADA");
            alerta.setContentText("Debes seleccionar una casilla vacía");
            alerta.showAndWait();
        }
        else if (casilla9.getText().isBlank())
        {
            if(turno%2==0) casilla9.setText("X");
            else if (turno%2!=0) casilla9.setText("O");
            else casilla9.setText("ERROR");
            siguienteTurno();
            comprobarEstado();
        }
    }

    private int turno = 0;

    @FXML
    void empezarPartida(ActionEvent event){
        txtTurno.setText("Jugador 1");
        txtGanador.setText("0");
    }

    private String textoTurno;
    void siguienteTurno()
    {
        turno = turno + 1;
        if (turno%2==0) textoTurno = "Jugador 1";
        else if (turno%2!=0) textoTurno = "Jugador 2";
        txtTurno.setText(textoTurno);
    }

    private int jugadorGanador = 0;
    private boolean hayGanador = false;
    void comprobarEstado()
    {
        if ((casilla1.getText().equalsIgnoreCase("X") &&
                casilla2.getText().equalsIgnoreCase("X") &&
                casilla3.getText().equalsIgnoreCase("X")) ||

                (casilla4.getText().equalsIgnoreCase("X") &&
                        casilla5.getText().equalsIgnoreCase("X") &&
                        casilla6.getText().equalsIgnoreCase("X")) ||

                (casilla7.getText().equalsIgnoreCase("X") &&
                        casilla8.getText().equalsIgnoreCase("X") &&
                        casilla9.getText().equalsIgnoreCase("X")) ||

                (casilla1.getText().equalsIgnoreCase("X") &&
                        casilla4.getText().equalsIgnoreCase("X") &&
                        casilla7.getText().equalsIgnoreCase("X")) ||

                (casilla2.getText().equalsIgnoreCase("X") &&
                        casilla5.getText().equalsIgnoreCase("X") &&
                        casilla8.getText().equalsIgnoreCase("X")) ||

                (casilla3.getText().equalsIgnoreCase("X") &&
                        casilla6.getText().equalsIgnoreCase("X") &&
                        casilla9.getText().equalsIgnoreCase("X")) ||

                (casilla1.getText().equalsIgnoreCase("X") &&
                        casilla5.getText().equalsIgnoreCase("X") &&
                        casilla9.getText().equalsIgnoreCase("X")) ||

                (casilla3.getText().equalsIgnoreCase("X") &&
                        casilla5.getText().equalsIgnoreCase("X") &&
                        casilla7.getText().equalsIgnoreCase("X")))
        {
            hayGanador=true;
            txtGanador.setText("1");
            jugadorGanador = 1;
            mandarAlerta();
        }
        else if ((casilla1.getText().equalsIgnoreCase("O") &&
                casilla2.getText().equalsIgnoreCase("O") &&
                casilla3.getText().equalsIgnoreCase("O")) ||

                (casilla4.getText().equalsIgnoreCase("O") &&
                        casilla5.getText().equalsIgnoreCase("O") &&
                        casilla6.getText().equalsIgnoreCase("O")) ||

                (casilla7.getText().equalsIgnoreCase("O") &&
                        casilla8.getText().equalsIgnoreCase("O") &&
                        casilla9.getText().equalsIgnoreCase("O")) ||

                (casilla1.getText().equalsIgnoreCase("O") &&
                        casilla4.getText().equalsIgnoreCase("O") &&
                        casilla7.getText().equalsIgnoreCase("O")) ||

                (casilla2.getText().equalsIgnoreCase("O") &&
                        casilla5.getText().equalsIgnoreCase("O") &&
                        casilla8.getText().equalsIgnoreCase("O")) ||

                (casilla3.getText().equalsIgnoreCase("O") &&
                        casilla6.getText().equalsIgnoreCase("O") &&
                        casilla9.getText().equalsIgnoreCase("O")) ||

                (casilla1.getText().equalsIgnoreCase("O") &&
                        casilla5.getText().equalsIgnoreCase("O") &&
                        casilla9.getText().equalsIgnoreCase("O")) ||

                (casilla3.getText().equalsIgnoreCase("O") &&
                        casilla5.getText().equalsIgnoreCase("O") &&
                        casilla7.getText().equalsIgnoreCase("O")))
        {
            hayGanador = true;
            txtGanador.setText("1");
            jugadorGanador = 2;
            mandarAlerta();
        }
        else if (!casilla1.getText().isEmpty() &&
                !casilla2.getText().isEmpty() &&
                !casilla3.getText().isEmpty() &&
                !casilla4.getText().isEmpty() &&
                !casilla5.getText().isEmpty() &&
                !casilla6.getText().isEmpty() &&
                !casilla7.getText().isEmpty() &&
                !casilla8.getText().isEmpty() &&
                !casilla9.getText().isEmpty())
        {
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setHeaderText(null); // Podemos dejarlo a null
            alerta.setTitle("FIN DE LA PARTIDA");
            alerta.setContentText("EMPATE");
            alerta.showAndWait();
        }
        else hayGanador = false;
    }

    private void mandarAlerta()
    {
        String frase;
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setHeaderText(null); // Podemos dejarlo a null
        alerta.setTitle("FIN DE LA PARTIDA");
        if (jugadorGanador == 1) frase = String.format("Ha ganado el Jugador %d (X)",jugadorGanador);
        else if (jugadorGanador == 2) frase = String.format("Ha ganado el Jugador %d (O)",jugadorGanador);
        else frase = String.format("ERROR");
        alerta.setContentText(frase);
        alerta.showAndWait();
    }

    @FXML
    void resetear()
    {
        casilla1.setText("");
        casilla2.setText("");
        casilla3.setText("");
        casilla4.setText("");
        casilla5.setText("");
        casilla6.setText("");
        casilla7.setText("");
        casilla8.setText("");
        casilla9.setText("");
        txtTurno.setText("Jugador 1");
        txtGanador.setText("0");
    }

}
