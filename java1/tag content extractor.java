import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.Scanner;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          

    String regex = "<(.+)>([^<>]+)</(\\1)>";
    Pattern p = Pattern.compile(regex);

   

        Matcher m = p.matcher(line);

        boolean bandera = true;
        while (m.find()) {
            System.out.println(m.group(2));
            bandera = false;
        }

        if (bandera) {
            System.out.println("None");
        }

        testCases--;
    }
}	
		
}



