public class Main {


    public static void main(String[] args) {
       Monster m = new Monster();

       m.attacked(20);
       System.out.println("Serangan yang terkena oleh monster adalah " + m.getDamage());

       m.healed(50);
       System.out.println("Kesembuhan yang diberikan oleh monster adalah " + m.getHealed() );
    }
}
