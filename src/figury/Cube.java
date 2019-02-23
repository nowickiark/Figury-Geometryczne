package figury;

public class Cube extends Square {
    public Cube(double side) {
        super("cube", side);
    }

    public double getArea() {
        return super.getArea()*6;
    }
}



//dodam jakieś zmieny