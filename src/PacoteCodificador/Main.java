package PacoteCodificador;

public class Main {
    public static void main(String[] args) {
       Codificador x = new Codificador("ABCDEAFAAAAAAAAAAAAAAAAAA");
       x.definirListas();
        System.out.println(x.codificar());
    }
}