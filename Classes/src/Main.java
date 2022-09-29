public class Main {
        // call the class- creating an object on type of CustomerManager
        //class is reference type
        // new is expensive --> slack to heap: herhangi bir referans kullanılmazsa Garbage Collector a gider
        //Arrays are reference type
        //value type is different with reference type
        // this difference is important for polimorphism

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Remove();
        customerManager.CustomerList();

        //value types
        int x = 10;
        int y = 20;
        //int y = x;
       // int x = 30;
        System.out.println(y);//--> 10

        int[] numbers1 = {1, 2, 3,};
        int[] numbers2 = {4, 5, 6,};//number 1 in reference typeına dondugunden result is 10
        numbers2 = numbers1;
        numbers1[0] =10;
        System.out.println(numbers2[0]);


    }


}

