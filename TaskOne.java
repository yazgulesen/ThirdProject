package ProjectThree;

public class TaskOne {
    /* Create an Interface Shape with undefined methdosa as calculate Area and calculateperimeter */
    public static void main(String[] args) {
        Square square = new Square();
        square.calculateArea(10);
        square.calculateArea(5);
        //((Square)square).test;//you can do casting with classes too
    }

}
    interface  Shape {
        void calculateArea( double input );
        void calculatePerimeter( double input);
    }

class Circle implements Shape{

    @Override
    public void calculateArea(double input) {
        double area = Math.PI*Math.pow(input,2);
        System.out.println(area);// when you do complicated tasks it is better to divide the task into small
    }

    @Override
    public void calculatePerimeter(double input) {
        System.out.println(2*Math.PI*input);//you can printout directly
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double input) {
         double area = input*input;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
        double perimeter = 4*input;
        System.out.println(perimeter);
    }
}