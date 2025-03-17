public class Moto extends Automovel{
  private String tipo;
  private String motor;
  private Boolean partidaEletrica;

  public class Moto(String marca, Integer anoDeFabricacao, String Modelo){
    super(marca, anoDeFabricacao, modelo);
  }

  public Moto(String tipo, String motor, Boolean partidaEletrica) {
    this.tipo = tipo;
    this.motor = motor;
    this.partidaEletrica = partidaEletrica;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getMotor() {
    return motor;
  }

  public void setMotor(String motor) {
    this.motor = motor;
  }

  public Boolean getPartidaEletrica() {
    return partidaEletrica;
  }

  public void setPartidaEletrica(Boolean partidaEletrica) {
    this.partidaEletrica = partidaEletrica;
  }

  public void abrirValvulaCombustivel(){};

}

