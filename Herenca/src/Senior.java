public class Senior extends Desenvolvedor {
    private Float verba; //verba por ser lider

    public Senior() {
        super(); //chama construtor da superclasse
    }

    public Senior(String nome, String linguagem, float salarioBase, float verba) {
        super(nome, linguagem, salarioBase);
        this.verba = verba;
    }

    public Float getVerba() {
        return verba;
    }

    public void setVerba(Float verba) {
        this.verba = verba;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "verba=" + verba +
                ", nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public void codar() {
        System.out.println("Senior definido a arquiteto do software e lideraça de pessoas");
    }

    @Override
    public float calcularBonus() {
        return super.calcularBonus() + this.salarioBase * 0.30f;
    }
}
