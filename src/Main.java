//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        String message= "Hello there";
        String world = "Universe";
        world = world.toLowerCase();
        System.out.println(world.contains("u"));
        Automovel auto = new Automovel("oi",2009,"Fiat");
        auto.desligar();
        Carro carro = new Carro("Honda", 1991, "SUV",3, "SJAO+D", Boolean.TRUE);

    }
}