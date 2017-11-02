package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.modelo.Persona;

public class Controller {
    public TextField txtBuscar;
    public Button btnBuscar;

    public void Busqueda(ActionEvent actionEvent) {

        Persona.buscarRegex(txtBuscar.getText());
    }
}
