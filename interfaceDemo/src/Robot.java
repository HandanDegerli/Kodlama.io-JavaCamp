public class Robot implements IWorkable, IMaintainable{
    @Override
    public void work() {
        System.out.println("Robot works");
    }

    @Override
    public void maintain() {
        System.out.println("Robot in maintenance");
    }
}
