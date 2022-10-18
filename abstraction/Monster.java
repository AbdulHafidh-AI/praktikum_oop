public class Monster extends Enemy {


    private int damage;

    @Override
    public void attacked(int damage){

        this.damage = damage;
    }

    @Override
    public int getDamage(){
        return this.damage;
    }

}
