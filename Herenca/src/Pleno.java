public class Pleno extends Desenvolvedor {
    private String projEntr; // quantidade de projetos entregues

    public Pleno() {
        super(); //chama construtor da superclasse
    }

    public Pleno(String nome, String linguagem, float salarioBase, String projEntr) {
        super(nome, linguagem, salarioBase);
        this.projEntr = projEntr;
    }

    public String getProjEntr() {
        return projEntr;
    }

    public void setProjEntr(String projEntr) {
        this.projEntr = projEntr;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projEntr='" + projEntr + '\'' +
                '}';
    }

    @Override
    public void codar() {
        System.out.println("Pleno desenvolvendo codigo e fazendo Code Review");
    }

    @Override
    public float calcularBonus() {
        return super.calcularBonus() + this.salarioBase * 0.15f;
    }
}
