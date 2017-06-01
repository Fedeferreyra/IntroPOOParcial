package model;

import observer.IObservador;
import vista.IMostrador;

public class Usuario implements IObservador{

    public static int cantUsuarios = 0;

    private String nombre;
    private IMostrador vista;

    public Usuario(IMostrador vista, String nombre) {
        cantUsuarios += 1;
        this.nombre = nombre;
        this.vista = vista;
    }

    @Override
    public void actualizar(Post post) {
        vista.mostrar(this.nombre + " RECIBIO POST");
        vista.mostrar(post.getContent());
    }

    public String getNombre() {
        return nombre;
    }

    public void postearEnTema(Tema tema, Post post) {
        tema.agregarPost(post);
    }
}
