package observer;

import model.Post;

import java.util.ArrayList;
import java.util.List;

public class Observado {

    private List<IObservador> observadores = new ArrayList<>();

    public void agregarObservador(IObservador observador) {
        observadores.add(observador);
    }

    public void removerObservador(IObservador observador) {
        observadores.remove(observador);
    }

    public void actualizarObservadores(Post post) {
        for (IObservador observador : observadores) {
            observador.actualizar(post);
        }
    }
}
