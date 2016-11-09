/**
 * Created by zyongliu on 09/11/16.
 */
public class Longth {
    private final double amount;
    private final Unit unit;

    public Longth(double amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public boolean equal(Longth other) {
        return toMMeter() == other.toMMeter();
    }

    private double toMMeter() {
        return amount * unit.getScale();
    }

}
