public class Monster implements Enemy, Ally {
    
    private int damage;
    private int heal;

    @Override
    public void attacked(int damage) {
        this.damage = damage;
        
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public void healed(int heal){
        this.heal = heal;
    }

    @Override
    public int getHealed(){
        return this.heal;
    }

    
}
