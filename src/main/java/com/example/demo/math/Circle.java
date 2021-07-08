class Circle{
    //constants
    final double pi=3.141592;
    double radius;

    public Circle(double radius) { //지정반지름의 원 개체 설정
        this.radius = radius;
    }
    //기능
    public double area(double rad){
        double result = rad*rad*pi;
        return result;
    }
    public double area(Circle cir){
        double result = cir.radius * cir.radius * pi;
        return result;
    }
}
class Circle00 {
    public static void main(String[] args){
        Circle c1 = new Circle (5.0);
        Circle c2 = new Circle (3.0);
        System.out.println(c1.area(c1));
    }
}