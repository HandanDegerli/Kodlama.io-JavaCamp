public class CustomerManager {

    public void CustomerList() {

        String[] customers = {"Odie", "Alex", "Volley", "Corry", "Summer"};
        for(String customer:customers){
            System.out.println(customer);
        }
    }

    public void Add(){
        System.out.println("Added customer");
    }
    public void Remove(){
        System.out.println("Removed customer");
    }
    public void Update(){
        System.out.println("Updated customer");
    }
}
