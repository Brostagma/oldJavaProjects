import java.util.Scanner;

public class Player {

    private int damage;
    private int healthy;
    private int money;
    private int defaultHealthy;
    private String playerName, characterName;
    private Inventory inventory;
    Scanner scn = new Scanner(System.in);

    public Player(String playerName) {
        this.playerName = playerName;
        this.inventory = new Inventory();
    }

    public void selectCharacter() {
        switch (characterMenu()) {
            case 1:
                initPlayer("Samuray",5,20,15);
                break;
            case 2:
                initPlayer("Okçu",7,18,20);
                break;
            case 3:
                initPlayer("Şovalye",8,24,5);
                break;
            default:
                initPlayer("Samuray",5,20,15);
                break;
        }
        System.out.println("Karakter Seçiminiz: " + getCharacterName());
    }

    private int characterMenu() {
        System.out.println("********************************");
        System.out.println("Bir karakter seçiniz : ");
        System.out.println("********************************");
        System.out.println("(1) -Samuray- : Hasar -5- : Sağlık -21- : Para -15-");
        System.out.println("(2) -Okçu- : Hasar -7- : Sağlık -18- : Para -20-");
        System.out.println("(3) -Şovalye- : Hasar -8- : Sağlık -24- : Para -5-");
        System.out.print("Seçiminiz : ");
        int characterID = scn.nextInt();

        while(characterID < 1 || characterID > 3) {
            System.out.println("Geçerli bir karakter seçiniz.");
            System.out.print("Seçiminiz : ");
            characterID = scn.nextInt();
        }
        return characterID;
    }

    public void initPlayer(String characterName, int damage, int healthy, int money) {
        setCharacterName(characterName);
        setDamage(damage);
        setHealthy(healthy);
        setMoney(money);
        setDefaultHealthy(healthy);
    }

    public int getTotalDamage() {
        return this.getDamage() + this.getInventory().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String charcaterName) {
        this.characterName = charcaterName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDefaultHealthy() {
        return defaultHealthy;
    }

    public void setDefaultHealthy(int defaultHealthy) {
        this.defaultHealthy = defaultHealthy;
    }
}
