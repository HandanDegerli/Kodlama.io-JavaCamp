public class Main {

    public static void main(String[] args) {

        //abstract --> soyut
        //absract class yapısal olarak class ile aynı ancak kullanım farkı var
        //bir class sadece bir sınıfı veya sadece bir abstract
        // sınıfı extend edebilir aynı anda olmaz inheritance açısından mümkün değil
        //Syntax anlamında farklılık var o da ihtiyaç odaklı olduğu için"

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        // abstract class
        // bir methodum var ama onu base etmek istemiyorum
        // onun yerine abstract kullanıyorum sen override etmek zorundasın
        // kurallar
        // bir class abstract olması için abstract imzası olmak zorunda
        // yine methodun da abstract imzası taşıması lazım
        // abstract bir class ta bir abstract olmak zorunda değil
        // buna tamamlanmış operasyon deniyor işi bitmiş çalışan bir operasyon
        // veya sadece abstract olabilir. onlarca tanımlanmış operasyon veya abstract olabilir
        //Base i gizlemek istersen yine abstract kullanabilirsin
        // yani

        /*
        GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void calculate() {
                }
            }*/
        // abstract sınıflar new lenemez. new kullanılabilmesi için
        // : yukarıdaki gb yazılması override edilmesi lazım o da tercih edilmemeli
        //abstractlar yapısal olarak normal class tan farkı yok

        GameCalculator gameCalculator = new WomanGameCalculator();

        //bir operasyona parametre olarak GameCalculator verip WomanGameCalculator ekleyebilirsiniz
        //yararı ise
        //Yeni bir özellik eklenmek istendiğinde bu şekilde polimorfik bir yapı kolaylık sağlar
        //abstraction new lenemez; Zorunlu operasyonlar doldurabiliyoruz





    }
}
