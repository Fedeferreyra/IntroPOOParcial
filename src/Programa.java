import model.*;

public class Programa {

    public static void main(String[] args) {

        Foro foro = new Foro();

        Tema uadeProgra3 = foro.crearTema("UADEProgra3");
        Tema uadeaioo = foro.crearTema("UADEAIOO");

        Usuario pedro = foro.crearUsuario("Pedro");
        Usuario maria = foro.crearUsuario("Maria");
        Usuario fernando = foro.crearUsuario("Fernando");

        uadeProgra3.agregarUsuario(pedro);
        uadeProgra3.agregarUsuario(maria);

        uadeaioo.agregarUsuario(maria);
        uadeaioo.agregarUsuario(fernando);

        pedro.postearEnTema(uadeProgra3, new PostDeTexto());
        fernando.postearEnTema(uadeaioo, new PostDeLink());
        maria.postearEnTema(uadeProgra3, new PostDeImagen());

        foro.logearCantUsuarios();

    }
}
