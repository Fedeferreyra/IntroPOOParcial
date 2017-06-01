package model;

import vista.IMostrador;
import vista.VistaForo;

import java.util.ArrayList;
import java.util.List;

public class Foro {

    private List<Usuario> usuarios = new ArrayList<>();
    private List<Tema> temas = new ArrayList<>();
    private IMostrador vista;

    public Foro() {
        this.vista = new VistaForo();
    }

    public Usuario crearUsuario(String nombre) {
        Usuario usuario = new Usuario(vista, nombre);
        usuarios.add(usuario);
        return usuario;
    }

    public Tema crearTema(String nombre) {
        Tema tema = new Tema(nombre);
        temas.add(tema);
        return tema;
    }

    public void logearCantUsuarios(){
        vista.mostrar("Existen " + Usuario.cantUsuarios + " usuarios en el sistema");
    }
}
