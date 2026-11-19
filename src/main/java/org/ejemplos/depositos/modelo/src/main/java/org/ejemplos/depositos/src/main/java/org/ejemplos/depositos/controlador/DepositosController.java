package org.ejemplos.depositos.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import org.ejemplos.depositos.modelo.Cilindro;

public class DepositosController {
    @FXML private RadioButton rbRadio;
    @FXML private RadioButton rbDiametro;
    @FXML private TextField txtMedida;
    @FXML private TextField txtAltura;
    @FXML private Label lblArea;
    @FXML private Label lblVolumen;

    private ToggleGroup grupoMedida;

    @FXML
    public void initialize() {
        grupoMedida = new ToggleGroup();
        rbRadio.setToggleGroup(grupoMedida);
        rbDiametro.setToggleGroup(grupoMedida);
        rbRadio.setSelected(true);
        limpiarResultados();
    }

    @FXML
    private void onCalcular() {
        try {
            double medida = Double.parseDouble(txtMedida.getText().trim().replace(",", "."));
            double altura = Double.parseDouble(txtAltura.getText().trim().replace(",", "."));

            if (medida <= 0 || altura <= 0) {
                mostrarAlerta("Datos inválidos", "La medida y la altura deben ser mayores que cero.");
                return;
            }

            double radio = rbDiametro.isSelected() ? medida / 2.0 : medida;
            Cilindro cilindro = new Cilindro(radio, altura);

            lblArea.setText(String.format("%.4f m²", cilindro.getArea()));
            lblVolumen.setText(String.format("%.4f m³", cilindro.getVolumen()));
        } catch (NumberFormatException e) {
            mostrarAlerta("Formato incorrecto", "Ingresa valores numéricos válidos.");
        }
    }

    @FXML
    private void onLimpiar() {
        txtMedida.clear();
        txtAltura.clear();
        rbRadio.setSelected(true);
        limpiarResultados();
    }

    private void limpiarResultados() {
        lblArea.setText("0.0000 m²");
        lblVolumen.setText("0.0000 m³");
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
