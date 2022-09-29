public class Main {

    public static void main(String[] args) {
        //DON'T  Repeat Yourself -dry
        // keep it simple stupid -kiss
        // class isimleri PascalCase
        findNumber();
    }
    public static void findNumber(){
        int [] numbers = new int [] {1, 2, 3, 7, 9};
        int wantedNumber = 3;
        boolean isThere = true;

        for (int number:numbers){
            if (wantedNumber == number){
                isThere = true;
                break;
            }
        }
        if(isThere){
            giveMessage(wantedNumber);
        }else{
            System.out.println("There is NOT");
        }
    }
    public static void giveMessage(int wantedNumber){
        System.out.println("There is " + wantedNumber + " in the array");
    }
}