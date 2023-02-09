public class SSD {
private int pamyat;
private int disk;

    public SSD(int pamyat, int disk) {
        this.pamyat = pamyat;
        this.disk = disk;
    }

    public int getPamyat() {
        return pamyat;
    }

    public void setPamyat(int pamyat) {
        this.pamyat = pamyat;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "pamyat=" + pamyat +
                ", disk=" + disk +
                '}';
    }
}
