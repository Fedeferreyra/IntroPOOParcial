package vista;

import vista.IMostrador;

public class VistaForo implements IMostrador{

    @Override
    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }
}
