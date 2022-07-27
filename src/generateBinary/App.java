package generateBinary;

import java.util.ArrayList;

public class App {

	public static void main(String[] args)
	{
		ArrayList<String> res = new ArrayList<String>();
		GenerateBinary generateBinary = new GenerateBinary(30,res);
		generateBinary.generate();
		System.out.println(res);
	}
}
