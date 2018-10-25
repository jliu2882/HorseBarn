package jliu2882;

public class HorseRunner {
    public static void main(String[] args)
    {
        Horse horse1 = new Mustang("Secretariat",12000);
        Horse horse2 = new Mustang("Dusty Trail",22000);
        Horse horse3 = new Mustang("Silver",12000);
        Horse horse4 = new Appaloosa("Horesy",12000);
        Horse horse5 = new Appaloosa("Appaloosa",22000);

        Horse[] horses = new Horse[10];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        horses[6] = horse4;
        horses[8] = horse5;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println("Dusty Trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println("Dusty Trail is in space: " + barn.findHorseSpace("Dusty Trail"));
    }
}
