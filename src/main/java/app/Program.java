package app;

import data.Persistencia;
//import java.util.InvalidPropertiesFormatException;
//import views.ListarVehiculosView;
import views.MenuPrincipal;

public class Program {
    //public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
      public static void main(String[] args) {
       Persistencia.inicializar();

        new MenuPrincipal().setVisible(true);

        //ListarVehiculosView view = new ListarVehiculosView();
        //view.setVisible(true); 
     }
}