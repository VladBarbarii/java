public class Battle {
    public static void startFight(Warrior w1, Warrior w2) throws InterruptedException {
        while (true) {
            if (getAttackResult(w1, w2).equals("Game Over")) {
                System.out.println("Game Over");
                break;
            }
            if (getAttackResult(w2, w1).equals("Game Over")) {
                System.out.println("Game Over");
                break;
            }
        }
    }

        public static String getAttackResult (Warrior wA, Warrior wB) throws InterruptedException {
            int wAAttkAmt = wA.attack();
            int wBBlockAmt = wB.block();

            int dmg2WarB = wAAttkAmt - wBBlockAmt;
            if (dmg2WarB > 0) {
                wB.health -= dmg2WarB;
            } else dmg2WarB = 0;
            System.out.printf("%s Attack %s and deals " + "%d Damage\n", wA.getName(), wB.getName(), dmg2WarB);
            System.out.printf("%s Has %d Health\n\n",
                    wB.getName(), wB.health);
            Thread.sleep(500);
            if (wB.health <= 0) {
                System.out.printf("%s has died and %s is victorious \n", wB.getName(), wA.getName());
                return "Game over";
            } else return "Fight again";
        }


    }
