public class Main {
    public static void main(String[] args) {
Klaviatura klaviatura=new Klaviatura("kuiot","jok");
USB usb=new USB(2,48928529);
Operativ operativ=new Operativ(255,23);
SSD ssd = new SSD(256,0);
Displei displei = new Displei(15,34,6);
        Computer computer = new Computer(displei,ssd,operativ,usb,klaviatura,"Lenovo","Black");
        System.out.println(computer);
    }
}