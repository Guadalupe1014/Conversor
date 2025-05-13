package BYTE;

public class Bbyte {

    private double bytes;

   
    public enum Unit {
        BIT, BYTE, GIGABIT, GIGABYTE, MEBIBYTE
    }

    public Bbyte(double value, Unit unit) {
        switch (unit) {
            case BIT:
                this.bytes = value / 8.0;
                break;
            case BYTE:
                this.bytes = value;
                break;
            case GIGABIT:
                this.bytes = (value * 1_000_000_000) / 8.0;
                break;
            case GIGABYTE:
                this.bytes = value * 1_000_000_000;
                break;
            case MEBIBYTE:
                this.bytes = value * 1_048_576;
                break;
            default:
                throw new IllegalArgumentException("Unidad no soportada");
        }
    }

    public double getBytes() {
        return bytes;
    }

    public double getBits() {
        return bytes * 8;
    }

    public double getGb() {
        return (bytes * 8) / 1_000_000_000;
    }

    public double getMB() {
        return bytes / 1_000_000_000;
    }

    public double getMiB() {
        return bytes / 1_048_576;
    }
    
}
