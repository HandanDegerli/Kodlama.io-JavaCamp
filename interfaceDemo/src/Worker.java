//bizim çalışanımız

public class Worker implements IWorkable, IEatable, IPayable{
    @Override
    public void work() {
        System.out.println("Worker works");
    }

    @Override
    public void eat() {
        System.out.println("Worker has lunch");
    }

    @Override
    public void pay() {
        System.out.println("Worker get pay");
    }
}
