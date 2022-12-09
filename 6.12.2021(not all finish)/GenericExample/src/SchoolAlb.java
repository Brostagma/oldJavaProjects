public class SchoolAlb extends Candidate{

    public SchoolAlb(int math, int physics, int language, int history, String id) {
        super(math, physics, language, history, id);
    }

    @Override
    public int calculate() {
        return getMath() * 3 + getPhysics() * 2 + getLanguage() * 5 + getHistory() * 4;
    }
}
