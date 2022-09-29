public abstract class GameCalculator {
    //GameCalculate i kim implement ediyorsa calculate i override etmek zorunda kendi calculateini oluştursun
    public abstract void calculate();

    //GameCalculate i kim kullanıyorsa game over ı olduğu gb kullanmak zorunda değişmeyen bir kural
    public final void gameOver(){
        System.out.println("Game is over");
    }
}
