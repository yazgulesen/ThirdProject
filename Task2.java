package ProjectThree;

public class Task2 {
    //We have to calculate the average of marks obtained in three subjects by student A and by student B.
    //Create   class   'Marks'   with   an   abstract   method 'getPercentage' that will be returning the average
    //percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'.
    // The constructor of student A takes the marks in three subjects as its parameters and the marks in four
    //subjects as its parameters for student B. Test your code

    public static void main(String[] args) {
        A a = new A(10,20,30);
        System.out.println(a.getPercentage());
        B b = new B(40,50,60,70);
        System.out.println(b.getPercentage());
    }
}
abstract class Marks{
    public int a; public int b; public int c; public int e;
    Marks(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    abstract int getPercentage();
}
class A extends Marks{
    A(int a, int b, int c){
        super(a,b,c);
    }
    @Override
    public int getPercentage() {
        return (a+b+c)/3;
    }
}
class B extends Marks{
    B (int a, int b, int c, int e) {
        super(a,b,c);
        this.e=e;

    }
    @Override
    public int getPercentage() {
        return (a+b+c+e)/4;
    }
}