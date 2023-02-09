public class Computer {
  private Displei displei;
  private SSD SSd;
  private Operativ operativ ;
  private USB USB;
  private Klaviatura klaviatura ;
  private  String marka;
  private String color;

  public Computer(Displei displei, SSD SSd, Operativ operativ, USB USB, Klaviatura klaviatura, String marka, String color) {
    this.displei = displei;
    this.SSd = SSd;
    this.operativ = operativ;
    this.USB = USB;
    this.klaviatura = klaviatura;
    this.marka = marka;
    this.color = color;
  }

  public Displei getDisplei() {
    return displei;
  }

  public void setDisplei(Displei displei) {
    this.displei = displei;
  }

  public SSD getSSd() {
    return SSd;
  }

  public void setSSd(SSD SSd) {
    this.SSd = SSd;
  }

  public Operativ getOperativ() {
    return operativ;
  }

  public void setOperativ(Operativ operativ) {
    this.operativ = operativ;
  }

  public USB getUSB() {
    return USB;
  }

  public void setUSB(USB USB) {
    this.USB = USB;
  }

  public Klaviatura getKlaviatura() {
    return klaviatura;
  }

  public void setKlaviatura(Klaviatura klaviatura) {
    this.klaviatura = klaviatura;
  }

  public String getMarka() {
    return marka;
  }

  public void setMarka(String marka) {
    this.marka = marka;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Computer{" +
            "\ndisplei=" + displei +
            "\n, SSd=" + SSd +
            "\n, operativ=" + operativ +
            "\n, USB=" + USB +
            "\n, klaviatura=" + klaviatura +
            "\n, marka='" + marka + '\'' +
            "\n, color='" + color + '\'' +
            '}';
  }
}
