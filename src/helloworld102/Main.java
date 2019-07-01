package helloworld102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {

	public static void main(String args[]) {
		System.out.print("what's your name ?");
		try(BufferedReader sb = new BufferedReader(new InputStreamReader(System.in)))
		{
			String name = sb.readLine();
			System.out.println("hello " + name+"!");
		}catch (IOException e) {
			System.err.println("une erreur s'est produite");
		}
	}
}

