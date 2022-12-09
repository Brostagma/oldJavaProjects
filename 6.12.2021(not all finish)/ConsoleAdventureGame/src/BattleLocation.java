public abstract class BattleLocation extends Location{

    protected Obstacle obstacle;
    public BattleLocation(Player player,String name,Obstacle obstacle) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
    }

    @Override
    public boolean getLocation() {
        int obstacleCount = obstacle.getObstacleCount();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol! " + obstacleCount + " tane " + obstacle.getName() + " var");
        System.out.print("<S>avaş veya <K>aç : ");
        String selectionCase = scn.next();
        selectionCase = selectionCase.toUpperCase();
        if (selectionCase.equals("S")) {
            if (combat(obstacleCount)) {
                return true;
            }
            else {
                System.out.println("Kaybettiniz...");
                return false;
            }
        }
        return true;
    }

    private boolean combat(int obstacleCount) {
        int defaultObstacleCount = obstacleCount;
        for (int i = 0; i < obstacleCount;) {
            playerStats();
            obstacleStats();
            while (player.getHealthy() > 0 && obstacleCount > 0) {
                System.out.print("<V>ur veya <K>aç : ");
                String selectionCase = scn.next();
                selectionCase = selectionCase.toUpperCase();
                if (selectionCase.equals("V")) {
                    System.out.println(player.getTotalDamage() + " hasar vuruldu !");
                    obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
                    System.out.println("Düşmanın canı " + obstacle.getHealth());
                    System.out.println();
                    if (obstacle.getHealth() > 0) {
                        System.out.println("Düşman size saldırıyor...");
                        player.setHealthy(player.getHealthy() - (obstacle.getDamage() - player.getInventory().getDefense()));
                        System.out.println("Canınız : " + player.getHealthy() + " kaldı...");
                        if (player.getHealthy() <= 0) {
                            return false;
                        }
                    }
                    else if (obstacle.getHealth() <= 0) {
                        System.out.println("Düşman yenildi...");
                        obstacleCount--;
                        obstacle.setHealth(obstacle.getDefaultHealth());
                        System.out.println(obstacleCount + " tane " + obstacle.getName() + " kaldı...");
                        afterHit();
                        if (obstacleCount == 0) {
                            System.out.println("Tüm düşmanları yendiniz...");
                            System.out.println("Kazanılan toplam para : " + (obstacle.getAward() * defaultObstacleCount));
                            player.setMoney(player.getMoney() + (defaultObstacleCount * obstacle.getAward()));
                            System.out.println("Güncel Mevcut Paranız : " + player.getMoney());
                            return true;
                        }
                    }
                } else {
                    System.out.println("Kaçtınız...");
                    System.out.println("Kazanılan toplam para : " + (obstacle.getAward() * (defaultObstacleCount - obstacleCount)));
                    player.setMoney(player.getMoney() + (obstacle.getAward() * (defaultObstacleCount - obstacleCount)));
                    System.out.println("Güncel Mevcut Paranız : " + player.getMoney());
                    obstacleCount = 0;
                    break;
                }
            }
        }
        return true;
    }

    private void afterHit() {
        System.out.println("Canınız : " + player.getHealthy());
    }

    private void playerStats() {
        System.out.println("Canınız : " + player.getHealthy());
        System.out.println("Hasarınız : " + player.getTotalDamage());
        System.out.println("Zırhınız : " + player.getInventory().getDefense());
    }

    private void obstacleStats() {
        System.out.println("Düşmanın Canı : " + obstacle.getHealth());
        System.out.println("Düşmanın Hasarı : " + obstacle.getDamage());
        System.out.println("Düşman Sayısı : " + obstacle.getObstacleCount());
    }


}
