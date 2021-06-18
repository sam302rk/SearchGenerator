package net.BlockVillage.ggle.srch;

import java.awt.Desktop;
import java.net.URL;
import java.util.Scanner;

public class MainClass {

	public static String google = "https://www.google.de/search?q=";
	public static String bing = "https://www.bing.com/search?q=";
	public static String yahoo = "https://de.search.yahoo.com/search?p=";
	public static String dckdckgo = "https://duckduckgo.com/?q=";

	static String input;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Web-Engine:\n[google|bing|yahoo|duckduckgo]");

		input = sc.nextLine();

		if (input.equalsIgnoreCase("google")) {
			System.out.println("Please type now what you want to search.");
			input = sc.nextLine();
			input = input.replaceAll("\\s", "+");
			
			System.out.println("Opening" + google + input + "...");
			
			try {
		        Desktop.getDesktop().browse(new URL(google + input).toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		} else if (input.equalsIgnoreCase("bing")) {
			System.out.println("Please type now what you want to search.");
			input = sc.nextLine();
			input = input.replaceAll("\\s", "+");
			
			System.out.println("Opening " + bing + input + "...");
			
			try {
		        Desktop.getDesktop().browse(new URL(bing + input).toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		} else if (input.equalsIgnoreCase("yahoo")) {
			System.out.println("Please type now what you want to search.");
			input = sc.nextLine();
			input = input.replaceAll("\\s", "+");
			
			System.out.println("Opening " + yahoo + input + "...");
			
			try {
		        Desktop.getDesktop().browse(new URL(yahoo + input).toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		} else if (input.equalsIgnoreCase("duckduckgo")) {
			System.out.println("Please type now what you want to search.");
			input = sc.nextLine();
			input = input.replaceAll("\\s", "+");
			
			System.out.println("Opening " + dckdckgo + input + "...");
			
			try {
		        Desktop.getDesktop().browse(new URL(dckdckgo + input).toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		} else {
			System.out.println("Error: Web-Engine \"" + input + "\" doesn't exist.");
		}

	}

}
