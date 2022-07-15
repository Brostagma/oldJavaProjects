import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scn = new Scanner(System.in);

    public void login() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Macera oyununa hoşgeldiniz...");
        System.out.print("Oyuna başlamadan önce isminizi giriniz: ");
        String playerName = scn.nextLine();
        player = new Player(playerName);
        player.selectCharacter();
        start();
    }

    private void start() {
        while (true) {
            System.out.println();
            System.out.println("*******************");
            System.out.println();
            System.out.println("Gitmek istediğiniz yeri seçiniz: ");
            System.out.println("1. Güvenli Ev (Düşman yok) -->");
            System.out.println("2. Mağara (Ayı çıkabilir) -->");
            System.out.println("3. Orman (Kurt çıkabilir) -->");
            System.out.println("4. Nehir (Timsah çıkabilir) -->");
            System.out.println("5. Mağaza (Silah ve zırh alımı) -->");
            System.out.print("Seçiminiz --> ");
            int selectLocation = scn.nextInt();
            while (selectLocation < 0 || selectLocation > 5) {
                System.err.println("Geçerli bir yer seçiniz.");
                System.out.println("Gitmek istediğiniz yeri seçiniz: ");
                System.out.println("1. Güvenli Ev (Düşman yok) -->");
                System.out.println("2. Mağara (Ayı çıkabilir) -->");
                System.out.println("3. Orman (Kurt çıkabilir) -->");
                System.out.println("4. Nehir (Timsah çıkabilir) -->");
                System.out.println("5. Mağaza (Silah ve zırh alımı) -->");
                System.out.print("Seçiminiz --> ");
                selectLocation = scn.nextInt();
            }

            switch (selectLocation) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new Cave(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 4:
                    location = new River(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
            }

            if (!location.getLocation()) {
                System.out.println("Oyun Bitti");
                break;
            }
            System.out.println("Bir tuşa tıklayıp ve enter'a basınız...");
            String wait = scn.next();

        }
    }









}
