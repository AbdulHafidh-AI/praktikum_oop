public class Main {


    public static void main(String[] args) {
        

         //Enemy e = new Enemy(); // Error --> class abstraction tidak dapat dipanggil melainkan harus di ovveride dari method lain
        Monster m = new Monster();

        m.attacked(10);
        System.out.println("serangan yang terkena sebesar " + m.getDamage());

        

    }

}
