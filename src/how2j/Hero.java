package how2j;

public class Hero {
    public String name;
    public float hp;
    public int damage;

    public void attackHero(Hero hero) {
        try {
            // 为了表示攻击需要时间，每次攻击暂停1000毫秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hero.hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血量变成了 %.0f%n", name, hero.name, hero.name, hero.hp);
        if (hero.isDead()) {
            System.out.println(hero.name + "死了！");
        }
    }

    public boolean isDead() {
        return hp <= 0;
    }
}
