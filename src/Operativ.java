public class Operativ {
     private  int obem;
     private int proizvoditel;

     public Operativ(int obem, int proizvoditel) {
          this.obem = obem;
          this.proizvoditel = proizvoditel;
     }

     public int getObem() {
          return obem;
     }

     public void setObem(int obem) {
          this.obem = obem;
     }

     public int getProizvoditel() {
          return proizvoditel;
     }

     public void setProizvoditel(int proizvoditel) {
          this.proizvoditel = proizvoditel;
     }

     @Override
     public String toString() {
          return "Operativ{" +
                  "obem=" + obem +
                  ", proizvoditel=" + proizvoditel +
                  '}';
     }
}
