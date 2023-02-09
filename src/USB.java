public class USB {
private double typePort;
private  long ID;

    public USB(double typePort, long ID) {
        this.typePort = typePort;
        this.ID = ID;
    }

    public double getTypePort() {
        return typePort;
    }

    public void setTypePort(double typePort) {
        this.typePort = typePort;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "USB{" +
                "typePort=" + typePort +
                ", ID=" + ID +
                '}';
    }
}
