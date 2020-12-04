package jp.ac.uryukyu.ie.e205759;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    /**
     * attackWithWeaponSkillがattackの150%の固定値を出しているか検証する。
     * 検証手順
     * (1)ちょうどattack*1.5のhitPointを持つ敵に対して、
     * 　 WarriorクラスにattackWith～を使わせる。
     * (2)その敵の現在hitPointが3回連続で0になれば固定値と言える。
     */
    @Test
     void weaponskillTest(){
         int attack = 100;
         Warrior demowarrior = new Warrior("戦士",100,attack);
         //Enemy demoslime = new Enemy("スライム", (int)(attack*1.5),100);
         for(int i=0;i<3;i++){
             Enemy demoslime = new Enemy("スライム", (int)(attack*1.5),100);
             demowarrior.attackWithWeaponSkill(demoslime);
             assertEquals(0,demoslime.getHitPoint());
            }
        }
}
