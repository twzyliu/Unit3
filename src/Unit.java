/**
 * Created by zyongliu on 09/11/16.
 */
public class Unit {
    private double scale;

    private Unit(double scale) {
        this.scale = scale;
    }

    public static final Unit KM = new Unit(1000000);
    public static final Unit M = new Unit(1000);
    public static final Unit DM = new Unit(100);
    public static final Unit CM = new Unit(10);
    public static final Unit MM = new Unit(1);

    public double getScale() {
        return scale;
    }
}
