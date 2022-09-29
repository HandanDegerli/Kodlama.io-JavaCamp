public class Main {

    public static void main(String[] args) {
        String value ="Lovely day!";
        int degree = temperature(11, 9);
        String place1 = city("Antalya");
        String place2 = city("London");
        if (degree <= 18){
            System.out.println(value + " in " + place1 + " with " + degree + " degrees!");
        }else if (18 < degree && degree < 30){
            System.out.println(value + " in " + place2 + " with " + degree + " degrees!");
        }else {
            System.out.println("Today, the whether is horrible! DON'T go out!");
        }
        update();
        int sumOfNumbers = sum(1, 2, 3, 5, 6, 8, 8, 8, 8, 89);
        System.out.println(sumOfNumbers);
    }
    public static void add(){
        System.out.println("added");
    }
    public static void delete(){
        System.out.println("deleted");
    }
    public static void update(){
        System.out.println("updated");
    }
    public static int temperature(int number1, int number2){
        int degrees = 18;
        int total = number1 + number2;
        if( total <= degrees ){
            return degrees;
        } else{
            return total;
        }
    }
    //... variable arguments : works like an integer array
    public static int sum (int... numbers){
         int total = 0;
         for (int number:numbers){
             total = total + number;// or --> total += number;
         }
         return total;
    }
    public static String city(String value){
       return value;
    }
}
