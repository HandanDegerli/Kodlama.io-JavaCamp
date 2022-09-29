public class Main {

    public static void main(String[] args) {
	String [] [] cities = new String [3] [3];

        cities [0] [0] = "Bursa";
        cities [0] [1] = "Bilecik";
        cities [0] [2] = "Ankara";
        cities [1] [0] = "Konya";
        cities [1] [1] = "Kayseri";
        cities [1] [2] = "Diyarbakır";
        cities [2] [0] = "Sanlıurfa";
        cities [2] [1] = "Gaziantep";
        cities [2] [2] = "İstanbul";
//nested loop satır-sutun
        for(int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                System.out.println(cities[i][j]);
            }
        }
    }
}
