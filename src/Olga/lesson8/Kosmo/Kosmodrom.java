package Olga.lesson8.Kosmo;

public class Kosmodrom {
    public static void launch(IStart iStart){
        if (iStart.checkBeforeStart()){
            iStart.startEngines();
            for (int i = 10; i >= 0; i--){
                System.out.println(i + "...");
            }
            iStart.start();
        } else {
            System.out.println("Предстартовая \n" +
                    "проверка\n" +
                    "провалена");
        }
    }
}
