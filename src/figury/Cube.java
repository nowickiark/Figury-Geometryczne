package figury;

public class Cube extends Square {
    public Cube(double side) {
        super("cube", side);
    }
    @Override
    public double getArea() {
        return super.getArea()*6;
    }
}
