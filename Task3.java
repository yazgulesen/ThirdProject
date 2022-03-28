package ProjectThree;

    public class Task3 {

    class Car{
        double carPrice;
        String color;
        double calculateSalePrice(){
            return carPrice;
        }
        Car(double carPrice, String color){
            this.carPrice=carPrice;
            this.color=color;}}

    class Sedan extends Car{
        double sedanLength;

        Sedan(double carPrice, String color) {
            super(carPrice, color);
            this.sedanLength=sedanLength;
        }
        double calculateSalePrice() {
            if (sedanLength>20){ System.out.println((carPrice*5)/100);}
            else { System.out.println((carPrice*10)/100);}
            return carPrice;
        }}

    class Truck extends Car{
        double truckWeight;
        Truck(double carPrice, String color) {
            super(carPrice, color);
            this.truckWeight=truckWeight;
        }
        double calculateSalePrice() {
            if(truckWeight>2000){System.out.println((carPrice*10)/100);}
            else {System.out.println((carPrice*20)/100);}
            return carPrice;
        }}

}
