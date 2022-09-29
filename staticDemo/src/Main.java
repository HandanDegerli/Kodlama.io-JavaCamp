public class Main {

    public static void main(String[] args) {
	    //static: main classı başka yerden çağırmaya çalışırsak
        // ve içindeki main methodu çağırmaya çalışırsak
        //hiçbir şekilde classı new leyerek
        // bu methoda ulaşamayız
        //onun yerine main.main olarak ulaşabiliriz.
        //app içinde utility dediğimiz araç yazarken staticleri kullanırız

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";
        manager.add(product);

        //static tanımlayınca
        //örnek oluşuyor ve uygulama sıfırlanana kadar bellek te
        //durur ve yer tutar new gb garbage collector a gitmez kendiliğinden
        //ilk çağıran kullanıcı nesne olusturuyor diğerleri kullanıyor
        //kullan bırak araçlar genelde static olur
        //bir method static yapılınca class ismiyle direk çağırılır

        //Best practice uygun değil o yüzden pek önerilmez inner classlar
        //Single Responsebility Priciple a ters
        //birbirine benzeyen methodları parcala
        //bir class sadece bir iş yapar ya crud class
        //ya da connection class seklinde ayrı ayrı olustur
        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.delete();
        //clean code a cok uygun değil kullanılan syntaxlar uygun öğrenme yapıyoruz

    }
}
