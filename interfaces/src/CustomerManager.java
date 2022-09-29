public class CustomerManager {
    //Polimorphism with interfaces
    //first design pattern
    /*
    ICustomerDal customerDal;
    public void add(){
        //iş kodları
        customerDal.add();
    }*/

    //second design pattern

    private ICustomerDal customerDal;

    public CustomerManager (ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        customerDal.add();
    }


}
