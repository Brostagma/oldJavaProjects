public class Launcher {

    static String[] strings = {"Bi","Li","Gi","Zi"};
    static Character[] characters = {'A','B','C','D','E'};
    static Integer[] integers = {1,2,3,4,5,6};
    public static void main(String[] args) {

        //Class Generic------
        GenericExample<Integer> integerGenericExample = new GenericExample<Integer>();
        integerGenericExample.write(integers);
        GenericExample<Character> characterGenericExample = new GenericExample<Character>();
        characterGenericExample.write(characters);
        GenericExample<String> stringGenericExample = new GenericExample<>();
        stringGenericExample.write(strings);

        //Method Generic-----
        SchoolBla schoolBla1 = new SchoolBla(40,33,13,12,"400BLA");
        SchoolBla schoolBla2 = new SchoolBla(33,45,11,9,"401BLA");

        SchoolAlb schoolAlb1 = new SchoolAlb(13,14,39,36,"300ALB");
        SchoolAlb schoolAlb2 = new SchoolAlb(10,20,35,37,"301ALB");

        SchoolBla schoolBla = numberOne(schoolBla1,schoolBla2);
        SchoolAlb schoolAlb = numberOne(schoolAlb1,schoolAlb2);
        System.out.println(schoolBla.getId() + "-->" + schoolBla.calculate());
        System.out.println(schoolAlb.getId() + "-->" + schoolAlb.calculate());

    }

    private static <Generic extends Candidate> Generic numberOne(Generic generic1, Generic generic2) {

        if (generic1.calculate() > generic2.calculate()){
            return generic1;
        }
        else{
            return generic2;
        }
    }
}
