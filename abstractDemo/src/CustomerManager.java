public class CustomerManager {
    //strategy pattern
    BaseDatabaseManager databaseManager;


    public void getCustomers(){
    databaseManager.getData();
    }
}
