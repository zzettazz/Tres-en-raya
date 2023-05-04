package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class EnRayaControllerIaFacil {

    private ArrayList<TextField> lista;
    private boolean hanSidoAnyadidos;
    private int turno;
    private String textoTurno;
    private boolean hayGanador = false;
    private boolean haColocadoFicha = false;
    private int jugadorGanador;
    private int[][] miArray;
    private TextField[][] arrayCasillas;
    @FXML
    private Button botonEmpezar;

    @FXML
    private Button botonResetear;

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
    private TextField txtGanador;

    @FXML
    private TextField txtTurno;

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
            setArrays();
            comprobarEstado();
            siguienteTurno();
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
            setArrays();
            comprobarEstado();
            siguienteTurno();
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
            setArrays();
            comprobarEstado();
            siguienteTurno();
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
            setArrays();
            comprobarEstado();
            siguienteTurno();
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
            setArrays();
            comprobarEstado();
            siguienteTurno();
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
            setArrays();
            comprobarEstado();
            siguienteTurno();
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
            setArrays();
            comprobarEstado();
            siguienteTurno();
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
            setArrays();
            comprobarEstado();
            siguienteTurno();
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
            setArrays();
            comprobarEstado();
            siguienteTurno();
        }
    }

    void compruebaCasillas()
    {
        actualizarTablero();
    }

    void hacerJugada()
    {
        //PONEMOS ALEATORIO
        if(haColocadoFicha == false)
        {
            if (casilla5.getText().isBlank()) casilla5.setText("O");
            else colocaAleatoriamente();
            haColocadoFicha = true;
        }
    }

    void setArrays()
    {
        if (miArray == null)
        {
            miArray = new int[3][3];
            for (int fila = 0;fila<3;fila++)
            {
                for(int columna = 0;columna<3;columna++)
                {
                    miArray[fila][columna] = 0;
                }
            }
        }

        if (arrayCasillas == null)
        {
            arrayCasillas = new TextField[3][3];
            arrayCasillas[0][0] = casilla1;
            arrayCasillas[0][1] = casilla2;
            arrayCasillas[0][2] = casilla3;
            arrayCasillas[1][0] = casilla4;
            arrayCasillas[1][1] = casilla5;
            arrayCasillas[1][2] = casilla6;
            arrayCasillas[2][0] = casilla7;
            arrayCasillas[2][1] = casilla8;
            arrayCasillas[2][2] = casilla9;
        }
    }

    void actualizarTablero()
    {
        for(int fila = 0;fila<3;fila++)
        {
            for(int columna = 0;columna<3;columna++)
            {
                TextField campoTemporal = arrayCasillas[fila][columna];
                if (campoTemporal.getText().equalsIgnoreCase("X")) miArray[fila][columna] = 1;
                else if (campoTemporal.getText().equalsIgnoreCase("O")) miArray[fila][columna] = -50;
            }
        }
    }

    void ia()
    {
        if (turno%2!=0)
        {
            haColocadoFicha = false;
            compruebaCasillas();
            hacerJugada();
        }
    }

    @FXML
    void empezarPartida(ActionEvent event)
    {
        txtTurno.setText("Jugador 1");
        txtGanador.setText("0");
    }

    @FXML
    void resetear(ActionEvent event)
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
        txtTurno.setText("Jugador");
        txtGanador.setText("0");
        lista = null;
        hanSidoAnyadidos = false;
        turno = 0;
        haColocadoFicha = false;
        hayGanador = false;
        jugadorGanador = 0;
        miArray = null;
        arrayCasillas = null;
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

    private void comprobarEstado()
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
            hayGanador = true;
        }
        else hayGanador = false;
    }

    private void siguienteTurno()
    {
        if (hayGanador == false)
        {
            cambiarTurno();
            if (turno%2!=0)
            {
                ia();
                comprobarEstado();
                cambiarTurno();
            }
        }
    }

    private void cambiarTurno()
    {
        turno = turno + 1;
        if (turno%2==0) textoTurno = "Jugador";
        else if (turno%2!=0) textoTurno = "Maquina";
        txtTurno.setText(textoTurno);
    }

    private void colocaAleatoriamente()
    {
        if (turno%2!=0)
        {
            if (hanSidoAnyadidos == false)
            {
                lista = new ArrayList<TextField>();
                lista.add(casilla1);
                lista.add(casilla2);
                lista.add(casilla3);
                lista.add(casilla4);
                lista.add(casilla5);
                lista.add(casilla6);
                lista.add(casilla7);
                lista.add(casilla8);
                lista.add(casilla9);
                hanSidoAnyadidos = true;
            }
            int aleatorio = generarAleatorios();
            if (!lista.get(aleatorio).getText().isBlank())
            {
                while (!lista.get(aleatorio).getText().isBlank())
                {
                    aleatorio = generarAleatorios();
                }
                TextField temporal = lista.get(aleatorio);
                temporal.setText("O");
            }
            else if (lista.get(aleatorio).getText().isBlank())
            {
                TextField temporal = lista.get(aleatorio);
                temporal.setText("O");
            }
        }
    }

    private int generarAleatorios()
    {
        double aleatorio = Math.random() * 8 + 1;
        String numero = String.valueOf(aleatorio);
        String num = numero.substring(0,1);
        int numeroFinal = Integer.parseInt(num);
        return  numeroFinal;
    }

}