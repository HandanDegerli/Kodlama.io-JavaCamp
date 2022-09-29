public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("My Sql is added");
    }

}
//Dal --> Data Access Layer: veri tabanıyla
// ilgili operasyonları buraya yazarız;
// Manager: iş kodlarını yazdığımız yer