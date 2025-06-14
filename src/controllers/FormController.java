package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.FactorialModelo;
import views.FormVista;


public class FormController implements ActionListener {
    private FormVista formVista;
    private FactorialModelo factorialModelo;

    public FormController(FormVista formVista, FactorialModelo factorialModelo) {
        this.formVista = formVista;
        this.factorialModelo = factorialModelo;
        this.formVista.btnCalcularFactorial.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String campoTexto = this.formVista.campoFactorial.getText();
        int valorParaFactorial;
        try {
            valorParaFactorial = Integer.parseInt(campoTexto);
            this.factorialModelo.setValor(valorParaFactorial);
            this.formVista.etiquetaCalculoFactorial.setText("Factorial: " + this.factorialModelo.iniciarFactorial());
        }catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Hubo un error: " + exc);
        }
    }
    
    
}
