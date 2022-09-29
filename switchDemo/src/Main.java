public class Main {

    public static void main(String[] args) {
	char grade = 'C';

        switch (grade){
            case 'A':
                System.out.println("Excellent: Passed!");
                break;
            case 'B':
                System.out.println("Very Good: Passed!");
                break;
            case 'C':
                System.out.println("Satisfactory: Passed!");
                break;
            case 'D':
                System.out.println("Marginal: Conditional Passed!");
                break;
            case 'F':
                System.out.println("Unsatisfactory: Failed!");
                break;
            default:
                System.out.println("Did not!");

        }
    }
}
