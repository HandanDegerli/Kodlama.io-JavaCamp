public class EmployeeManager {
    private IMaintainable maintainable;
    private IWorkable workable;
    private IPayable payable;
    private IEatable eatable;

    public EmployeeManager (IMaintainable maintainable){
        this.maintainable = maintainable;
    }
    public EmployeeManager (IWorkable workable){
        this.workable = workable;
    }
    public EmployeeManager (IPayable payable, IEatable eatable){
        this.payable = payable;
        this.eatable = eatable;
    }

    public void work(){
        workable.work();
    }

    public void maintain(){
        maintainable.maintain();
    }

    public void payable(){
        payable.pay();
    }

    public void eatable(){
        eatable.eat();
    }
}
