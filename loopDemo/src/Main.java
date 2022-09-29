public class Main {

    public static void main(String[] args) {
        //For Loop; variables are blocked scope of the loop
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("for Loop closed!");

        //While Loop
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while Loop closed!");

        //Do-While Loop
        int j = 1;
        do{
            System.out.println(j);
            j += 3;
        }while(j < 10);
        System.out.println("do-while Loop closed!");
    }
}
