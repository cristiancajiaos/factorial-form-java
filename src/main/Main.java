
package main;

import controllers.FormController;
import models.FactorialModelo;
import views.FormVista;

public class Main {
    public static void main(String[] args) {
        FormVista formVista = new FormVista();
        FactorialModelo factorialModelo = new FactorialModelo();
        FormController formController = new FormController(formVista, factorialModelo);
        formVista.setVisible(true);
    }
    
}
