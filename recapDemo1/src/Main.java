public class Main {

    public static void main(String[] args) {
	    int number1 = 25;
        int number2 = 5;
        int number3 = 25;
        int number = number1;

        //mySolution
        if (number1 > number2 & number1 > number3) {
            System.out.println("The Biggest number is: " + number1);
        } else if (number2 > number1 & number2 > number3) {
            System.out.println("The Biggest number is: " + number2);
        } else if (number3 > number2 & number3 > number1) {
            System.out.println("The Biggest number is: " + number3);
        } else {
            System.out.println("The Biggest numbers are equal: " + number);
        }
        //secondSolution
        int theBiggestNumber = number1;

        if(theBiggestNumber < number2){
            theBiggestNumber = number2;
        }

        if(theBiggestNumber < number3){
            theBiggestNumber = number3;
        }

        System.out.println("The Biggest number is: " + theBiggestNumber);
    }
}
