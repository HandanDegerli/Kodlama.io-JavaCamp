public class Main {

    public static void main(String[] args) {
            String student1 = "Engin";
            String student2 = "Derin";
            String student3 = "Salih";
            String student4 = "Ahmet";

            String[] students = new String[4];
            students[0] = "Helin";
            students[1] = "Derin";
            students[2] = "Selin";
            students[3] = "Pelin";


            for(int i = 0; i <students.length; i++){
                System.out.println(students[i]);
            }

            for(String student:students){
                System.out.println(student);
            }
    }
}
