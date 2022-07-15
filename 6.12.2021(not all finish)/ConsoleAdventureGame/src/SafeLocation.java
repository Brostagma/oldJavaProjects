public abstract class SafeLocation extends Location{

    public SafeLocation(Player player,String name) {
        super(player);
        this.name = name;
    }

    public abstract boolean getLocation();
}
