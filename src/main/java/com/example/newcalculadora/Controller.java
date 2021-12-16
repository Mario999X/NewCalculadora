package com.example.newcalculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Model model = new Model();
    @FXML
    private TextField espacioNumero;


    @FXML
    public void manejaBotonNumerico(ActionEvent e){
        espacioNumero.setText(espacioNumero.getText()+ ((Button)e.getSource()).getText());
    }

    @FXML
    public void manejaBotonC(ActionEvent e){
        espacioNumero.setText("");
    }

    @FXML
    public void manejaBotonOperacion(ActionEvent e){
        if (((Button)e.getSource()).getText().equals("=")) {
            model.setNumero2(Float.parseFloat(espacioNumero.getText()));
            espacioNumero.setText(String.valueOf(model.calcular()));
            System.out.println(espacioNumero.getText());
        }else{
            model.setNumero1(Float.parseFloat(espacioNumero.getText()));
            model.setOperador(((Button) e.getSource()).getText());
            espacioNumero.setText("");
        }

    }

}
