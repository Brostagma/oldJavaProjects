public abstract class Candidate {

    private int math;
    private int physics;
    private int language;
    private int history;
    private String id;

    public Candidate(int math, int physics, int language, int history, String id) {
        this.math = math;
        this.physics = physics;
        this.language = language;
        this.history = history;
        this.id = id;
    }

    protected abstract int calculate();

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
