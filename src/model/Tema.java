package model;

import observer.Observado;

import java.util.ArrayList;
import java.util.List;

public class Tema extends Observado {

    private String nombre;
    private List<Post> posts = new ArrayList<>();

    public Tema(String nombre) {
        this.nombre = nombre;
    }

    public void agregarUsuario(Usuario usuario){
        this.agregarObservador(usuario);
        for (Post post :
                posts) {
            usuario.actualizar(post);
        }
    }

    public void agregarPost(Post post){
        actualizarObservadores(post);
    }
}
