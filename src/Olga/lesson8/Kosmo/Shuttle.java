package Olga.lesson8.Kosmo;

public class Shuttle implements IStart{
    @Override
    public boolean checkBeforeStart() {
        int a = (int) (Math.random() * 11);
        if (a > 3){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели Шатла \n" +
                "запущены.\n" +
                "Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
