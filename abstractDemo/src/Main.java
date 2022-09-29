public class Main {

    public static void main(String[] args) {
	CustomerManager customerManager = new CustomerManager();
    customerManager.databaseManager = new MySqlDatabaseManager();//burası configuration değişir burada kod no problem
    customerManager.getCustomers();
    }

    //SOLID
    //O: Open Principles--> bir sisteme yeni bir özellik getiricem diye
    // mevcut kodda hiçbir şeyi değiştiremezsin
}
