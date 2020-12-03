package jp.ac.uryukyu.ie.e205759;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
    }

    public boolean isDead(){
        return this.dead;
    }
    
    public String getName(){
        return this.name;
    }

    public void attack(LivingThing opponent){
        if(this.hitPoint > 0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。", name);
        }
    }
    public int getHitPoint(){
        return this.hitPoint;
    }


}
