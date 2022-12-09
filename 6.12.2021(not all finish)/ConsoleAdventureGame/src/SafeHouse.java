public class SafeHouse extends SafeLocation{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean getLocation() {
        System.out.println("İyileşiyorsun...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        player.setHealthy(player.getDefaultHealthy());
        System.out.println("********************************");
        System.out.println("İyileştiniz Canınız Doldu : " + player.getHealthy());
        System.out.println("Güvenli evde bekliyorsunuz...");
        return true;
    }
}
