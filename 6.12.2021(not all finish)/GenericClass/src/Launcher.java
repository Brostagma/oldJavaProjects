
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"Ahmet","Mehmet","Asli"};
		Integer[] number = {1,2,3,4,5,6};
		
		WriterClass<String> nameWriter = new WriterClass<String>();
		WriterClass<Integer> numberWriter = new WriterClass<Integer>();
		
		nameWriter.write(name);
		numberWriter.write(number);
		
	}

}
