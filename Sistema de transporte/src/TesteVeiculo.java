import java.util.ArrayList;

public class TesteVeiculo {
    public static void main(String[] args) {

        Veiculo v;

        v = new Aviao("Aether Dynamics", "AD-9", 800, 12000);
        System.out.println(v); // mostra dados
        v.mover();

        System.out.println("===================================================================");

        v = new CarroEletrico("BYD", "Dolphin", 190, 254);
        System.out.println(v); // mostra dados
        v.mover();
    }
}