public class Main {

    public static void main(String[] args) {
	    // oop'nin 3 temel üyesi classlar, abstract classlar ve interfaceler
        // interfaceler bir class değildir ama onlar da reference tutabiliyor
        //classlar: tüm operasyonlar tamamlanmış olmalı methodlar dolu olmalı
        // abstract classlar: kimisi dolu kimisi boş olabilir inharite eden içini doldurmak zorunda
        //interfaceler: tamamlanmmamış operasyonlar tabi sonradan dolduruldugu da oldu ama biz hos karsılamıyoruz
        //interfaceler inheritance edilmez implement edilir bir class birden fazla
        //interface i implement edebilir
        // interfaceler de abstractlar gibi new lenemezler ama
        //interface onu implement eden classın reference ını tutabilir-polimorphism
        //interface: operasyonun implemente edilmesi gereken durumlarda onu kim
        //implemente edecekse ayrıca implemente etsin diyosan interface devreye girer
        /* yazılım  projelerınde katmanlar vardır
        1. arayuz-html son kullanıcı gorur
        2.iş katmanı-managerlar-kontrol kısmı
        3.Data access bu katmanların
        aralarındaki geçişleri interfacelerle yaparız maksat bağımlılıkları
        azaltmak için

        interfacler temel anlamda newlenmez ve imza tasırla
        extend değil implementasyondur
        bir class birden fazla interface i implement edilebilir
        ama bir class sadece bir class ı ya da  bir abstract ıextend edebilir

         */

        //Polimorphism with interfaces

        ICustomerDal customerDal = new OracleCustomerDal();
        //first design pattern
        /*
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new HWSqlCustomerDal();
        customerManager.add();*/

        //second design pattern
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();







    }
}










