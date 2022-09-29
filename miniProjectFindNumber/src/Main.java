public class Main {

    public static void main(String[] args) {
	    int [] numbers = new int[] {1, 2, 5, 7, 9, 0};
        int wantedNumber = 6;
        boolean isThere = false;

        for (int number:numbers){
            if( number == wantedNumber){
                isThere = true;
                break;
                }
            }

        if (isThere){
        System.out.println("There is wanted number in the array");
        }else{
        System.out.println("There is NOT");
    }
    }
}
