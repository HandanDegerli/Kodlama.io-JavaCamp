public class Product {
    //product objecti-nesnesi
    //attribute or field
   /* int id;
    String name;
    String description;
    double price;
    int stockAmount;
    String color;*/

    //SOLID
    //Single responsibility principle-->
    // bir method if blogu veya class ı sadece bir iş yapar aynı
    // anda operasyon ve attribute ları aynı yerde yazmamalıyız. farklı yerlerde yazmalıyız.
    //Atrributelar product classında
    //methodlar productmanager classında olmalı


    //Encapsulation-getter setter

    //public class içindeki alanlar tamamen public oluyor
    //field ları eğer private olarak belirtirsek sadece tanımlandığı class için geçerli olur public olmaktan çıkar

    //encapsulated fields
    //getter setter yapınca default olarak public oluşturuyor get set methodları
    /*private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _color;
    private String kod;*/


    /*public void method(){
        name = "alice";
        System.out.println(name);
    }*//*

    //private String kod; sadece read only yaptırmak istiyoruz. kodumuz --> name ve id yi kullanarak oluşuyor sadece
    //bu durumda encapsulation en önemli konusu getter setterlar devreye giriyor
    //getter
    public int getId(){
        return _id;
    }
    //this içinde bulunduğumuz class demek- id karışmaması için this yazıyoruz.
    //public void setId(int id){
    //  this.id = id;}
    //ama this kullanımı yerine yandaki şekilde bir best practice var-->  private int _id;-->bu şekilde id ler karışmamış olur sadece field olan alttan tireli
    //setter
    public void setId(int id){
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public String getKod() {
        return _name.substring(0, 1) + _id;
    }//.substring(0, 1) 0'dan 1 e sadece 0'ıncı indexi getirir
    */

    //Constructor

    //her Class ın kendi ismiyle kendi içinde bir Constructor ı vardır

    //
    public Product(int id, String name, String description){
        System.out.println("This is a Constructor that worked.");
        this._id = id;
        this._name = name;
        this._description = description;
    }
    //main classında run edince constructor calıstı
    // - main class taki set calısmasını constructor da parametreli constructor olarak olusturabiliriz.
    //new le diğimiz zaman constructor parametreleri girersek bu durumda  class ı kullanabiliriz

    public Product(){

    }
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _color;
    private String kod;

    public int getId() {
        return _id;
    }

    public void setId(int id){
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public String getKod() {
        return _name.substring(0, 1) + _id;
    }

}
