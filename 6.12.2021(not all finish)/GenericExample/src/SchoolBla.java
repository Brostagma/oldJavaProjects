public class SchoolBla extends Candidate{

    public SchoolBla(int math, int physics, int language, int history, String id) {
        super(math, physics, language, history, id);
    }

    @Override
    public int calculate() {
        return getMath() * 5 + getPhysics() * 4 + getLanguage() * 3 + getHistory() * 2;
    }
}
