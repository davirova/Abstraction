public class Restangle extends GeometricFigure{
    Restangle(){}
    Restangle( double sideA, double sideB,double high)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }
    void area(double sideA, double sideB, double high)
    {
        System.out.println("To'rburchak yuzi: "+ sideA*sideB);
    }
    void perimetr(double sideA, double sideB, double high){
        System.out.println("To'rtburchak perimetri: "+2*(sideA+sideB));
    }

    public static void main(String[] args) {
        GeometricFigure restangle = new Restangle();
        restangle.area(2 ,3,0);
        restangle.perimetr(2,3,0);
    }

}
