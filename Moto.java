public class Moto extends Automovel{
  private String tipo;
  private String motor;
  private Boolean partidaEletrica;

  public class Moto(String marca, Integer anoDeFabricacao, String Modelo){
    super(marca, anoDeFabricacao, modelo);
  }

  public void abrirValvulaCombustivel(){};

}
