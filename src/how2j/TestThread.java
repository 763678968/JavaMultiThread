package how2j;

public class TestThread {
    public static void main(String[] args) {
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        /* 单线程写法 */
//        // 盖伦攻击提莫
//        while (!teemo.isDead()) {
//            gareen.attackHero(teemo);
//        }
//        // 赏金猎人攻击盲僧
//        while (!leesin.isDead()) {
//            bh.attackHero(leesin);
//        }

        /* 多线程写法1:继承Thread类 */
//        KillThread killThread1 = new KillThread(gareen, teemo);
//        killThread1.start();
//        KillThread killThread2 = new KillThread(bh, leesin);
//        killThread2.start();

        /* 多线程写法2:Runnable接口 */
//        Battle battle1 = new Battle(gareen, teemo);
//        new Thread(battle1).start();
//        Battle battle2 = new Battle(bh, leesin);
//        new Thread(battle2).start();

        /* 多线程写法3:匿名类 */
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                // 匿名类中用到外部的局部变量teemo，必须把teemo声明为final
                // 但是在JDK7以后，就不是必须加final了
                while (!teemo.isDead()) {
                    gareen.attackHero(teemo);
                }
            }
        };
        thread1.start();

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                while (!leesin.isDead()) {
                    bh.attackHero(leesin);
                }
            }
        };
        thread2.start();
    }




}
