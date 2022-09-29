public class Main {
    //Polimorphism çok cimrilik demek
    //Reference type ın aynı olması lazım ki polimorhism kullanılsın
    public static void main(String[] args) {

//        EmailLogger logger = new EmailLogger();
//        logger.log("Log Message");

//        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()};
//
//        for (BaseLogger logger:loggers){
//            logger.log("Log message");
//        }


        //dependency injection --> - hardly couple - loose

        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();



    }
}
