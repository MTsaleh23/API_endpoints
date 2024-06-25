//define the class for the Calculator
public class Calculator {

    //create constructor
    public Calculator(){

    }

    //a method that add two numbers
    public int add(int num1, int num2){

        int sum;
        sum = num1 + num2;
        return sum;
    }

    //a method that subtract two numbers
    public int subtract(int num1, int num2){

        int sum;
        sum = num1 - num2;
        return sum;
    }

    //a method that multiply two numbers
    public int multiply(int num1, int num2){

        int sum;
        sum = num1 * num2;
        return sum;
    }

    //a method that divide two numbers
    public int divide(int num1, int num2){

        int sum;
        sum = num1 / num2;
        return sum;
    }

    //a method that calculate the reminder of divide of the two numbers
    public int modulo(int num1, int num2){

        int sum;
        sum = num1 % num2;
        return sum;
    }

    //main for running the code
    public static void main(String[] args){
        //test that main is working
        System.out.println("Main is running");

        //create a Calculator object
        Calculator myCalculator = new Calculator();

        //print the object for now refrance to the memory position
        System.out.println("myCalculator is "+myCalculator+ " it will print the refrance to the memory position ");

        //tests all method
        System.out.println("test add method "+ myCalculator.add(5,7));
        System.out.println("test subtract method "+ myCalculator.subtract(45,11));
        System.out.println("test multiply method "+ myCalculator.multiply(5,11));
        System.out.println("test divide method "+ myCalculator.divide(11,5));
        System.out.println("test modulo method "+ myCalculator.modulo(11,5));

    }


}
