public class Main {
    //inheritance da bir class sadece bir class ı extend edebilir
    public static void main(String[] args) {

        //TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        //AgricultureCreditManager agricultureCreditManager = new AgricultureCreditManager();

        CreditUI creditUI = new CreditUI();
        creditUI.CalculateCredit(new MilitaryCreditManager());//or TeacherCreditManager(), AgricultureCreditManager()-->Polimorphism
        //BaseCreditManager parent olduğu için hata vermez ve bu code works



    }
}
