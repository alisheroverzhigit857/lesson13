public class Displei {
   private int diagnol  ;
   private  int proizvoditel ;
   private  int tipMartincy ;

   public Displei(int diagnol, int proizvoditel, int tipMartincy) {
      this.diagnol = diagnol;
      this.proizvoditel = proizvoditel;
      this.tipMartincy = tipMartincy;
   }

   public int getDiagnol() {
      return diagnol;
   }

   public void setDiagnol(int diagnol) {
      this.diagnol = diagnol;
   }

   public int getProizvoditel() {
      return proizvoditel;
   }

   public void setProizvoditel(int proizvoditel) {
      this.proizvoditel = proizvoditel;
   }

   public int getTipMartincy() {
      return tipMartincy;
   }

   public void setTipMartincy(int tipMartincy) {
      this.tipMartincy = tipMartincy;
   }

   @Override
   public String toString() {
      return "Displei{" +
              "diagnol=" + diagnol +
              ", proizvoditel=" + proizvoditel +
              ", tipMartincy=" + tipMartincy +
              '}';
   }
}
