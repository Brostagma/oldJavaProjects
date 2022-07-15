import java.util.Scanner;

public class ToolStore extends SafeLocation{

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Paranız : " + player.getMoney());
        System.out.println("1. Silahlar");
        System.out.println("2. Zırhlar");
        System.out.println("3. Çıkış");
        System.out.print("Seçiminiz : ");
        int selection = scn.nextInt();
        int selectItemID;
        switch (selection) {
            case 1:
                selectItemID = weaponMenu();
                buyWeapon(selectItemID);
                break;
            case 2:
                selectItemID = armorMenu();
                buyArmor(selectItemID);
                break;
            case 3:
                break;
            default:
                break;
        }
        return true;
    }

    private void buyArmor(int itemID) {
        int defense = 0,price = 0;
        String armorName = null;
        switch (itemID) {
            case 1:
                defense = 1;
                armorName = "Hafif Zırh";
                price = 15;
                break;
            case 2:
                defense = 3;
                armorName = "Orta Zırh";
                price = 25;
                break;
            case 3:
                defense = 5;
                armorName = "Ağır Zırh";
                price = 40;
                break;
            case 4:
                System.out.println("Çıkış yapılıyor");
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }
        if (price > 0) {
            if (player.getMoney() >= price) {
                player.getInventory().setDefense(defense);
                player.getInventory().setArmor(armorName);
                player.setMoney(player.getMoney() - price);
                System.out.println(player.getInventory().getArmor() + " aldınız: Yeni Savunmanız --> " + player.getInventory().getDefense());
            }
            else {
                System.out.println("Para Yetersiz...");
            }
        }
    }

    private void buyWeapon(int itemID) {
        int damage = 0,price = 0;
        String weaponName = null;
        switch (itemID) {
            case 1:
                damage = 2;
                weaponName = "Kılıç";
                price = 25;
                break;
            case 2:
                damage = 3;
                weaponName = "Tabanca";
                price = 35;
                break;
            case 3:
                damage = 7;
                weaponName = "Tüfek";
                price = 45;
                break;
            case 4:
                System.out.println("Çıkış yapılıyor");
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }
        if (price > 0) {
            if (player.getMoney() >= price) {
                player.getInventory().setDamage(damage);
                player.getInventory().setWeapon(weaponName);
                player.setMoney(player.getMoney() - price);
                System.out.println(player.getInventory().getWeapon() + " Silahı aldınız: Yeni Hasarınız --> " + player.getTotalDamage());
            }
            else {
                System.out.println("Para Yetersiz...");
            }
        }
    }

    private int armorMenu() {
        System.out.println("1. Hafif Zırh : Para -15- : Hasar -1-");
        System.out.println("2. Orta Zırh : Para -25- : Hasar -3-");
        System.out.println("3. Ağır Zırh : Para -40- : Hasar -5-");
        System.out.println("4. Çıkış");
        System.out.print("Seçiminiz : ");
        int selectionArmor = scn.nextInt();
        return selectionArmor;
    }

    private int weaponMenu() {
        System.out.println("1. Kılıç : Para -25- : Hasar -2-");
        System.out.println("2. Tabanca : Para -35- : Hasar -3-");
        System.out.println("3. Tüfek : Para -45- : Hasar -7-");
        System.out.println("4. Çıkış");
        System.out.print("Seçiminiz : ");
        int selectionWeapon = scn.nextInt();
        return selectionWeapon;
    }

}
