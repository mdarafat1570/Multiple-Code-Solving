public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void math(){
        double ans = 2*radius*Math.PI;
        System.out.println("This Circle area:"+ ans);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.math();
    }
}
