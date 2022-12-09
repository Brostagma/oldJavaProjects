
public class Main {

	public static void main(String[] args) {
		
		String txt = "Hello Everybody";
		System.out.println(txt.indexOf("l"));
		System.out.println("****************************************");
		int x = 5;
		int y = 10;
		System.out.println(Math.max(x, y));
		System.out.println("****************************************");
		int x1 = 16;
		System.out.println(Math.sqrt(x));
		System.out.println("****************************************");
		System.out.println(Math.random());
		System.out.println("****************************************");
		int x2 = 10;
		int y2 = 9;
		System.out.println(x2 > y2);
		System.out.println("****************************************");
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening";
		System.out.println(result);
		System.out.println("****************************************");
		int day = 2;
		switch (day) {
		case 1:
			System.out.println("Saturday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		default:
			System.out.println("Weekend");
		}
		System.out.println("****************************************");
		int i = 0;
		while (i < 6) {
			System.out.println("print " + i);
			i++;
		}
		System.out.println("****************************************");
		int i1 = 0;
		do {
			System.out.println("print " + i1);
			i1++;
		}
		while (i1 < 6);
		System.out.println("****************************************");
		String[] cars = {"Volvo", "BMW", "Ford"};
		for (String idk : cars) {
			System.out.println(idk);
		}
		System.out.println("****************************************");
		for (int iko = 0; iko < 10; iko++) {
			if (iko == 5) {
				break;
			}
			System.out.println(iko);
		}
		System.out.println("****************************************");
		for (int iko1 = 0; iko1 < 10; iko1++) {
			if (iko1 == 4) {
				continue;
			}
			System.out.println(iko1);
		}
		System.out.println("****************************************");
		int[][] myNumbers = { {1,2,3}, {0,1,2,3,4,5,6,7}, {9,8,7,6,5,4} };
		for (int arr = 0; arr < myNumbers.length; arr++) {
			for (int arr1 = 0; arr1 < myNumbers[arr].length; arr1++) {
				System.out.println(myNumbers[arr][arr1]);
			}
		}
		System.out.println("****************************************");
		System.out.println("****************************************");
		System.out.println("****************************************");
		System.out.println("****************************************");
		System.out.println("****************************************");
		

	}
}
