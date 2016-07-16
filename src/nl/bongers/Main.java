package nl.bongers;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            line = line.toLowerCase();
            System.out.println(line);
        }
    }
}