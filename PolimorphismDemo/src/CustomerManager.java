public class CustomerManager{

    private BaseLogger logger;//private field oluşturduk

    public CustomerManager(BaseLogger logger){
        this.logger = logger;

    }//constructor olusturduk

    public void add(){
        System.out.println("Customer is added");
        this.logger.log("Log Message");


    }
}
