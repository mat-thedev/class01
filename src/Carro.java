public class Carro extends Automovel {
    private Integer qtdPortas;
    private String motor;
    private Boolean direcaoHidraulica;
    public Carro(String marca, Integer anoDeFabricacao, String modelo){
            super(marca, anoDeFabricacao, modelo);
    }

    public Carro(String marca, Integer anoDeFabricacao, String modelo, Integer qtdPortas, String motor, Boolean direcaoHidraulica) {
        super(marca, anoDeFabricacao, modelo);
        this.qtdPortas = qtdPortas;
        this.motor = motor;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public void trancarPortas(){}
    public void ligarAlarmes(){}
}
