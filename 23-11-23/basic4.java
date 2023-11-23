package java_programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

//public class basic4{
//	public static void main(String[] args) {
//		int arr[]=  {1,2,3,2,3,4,5,34,45};
//		for(int i:arr) {
//			if (i%2!=0) {
//				System.out.println(i);
//			}
//		
//		}
//	}
//}

// How to Remove White Spaces in a String



//public class basic4
//{
//   public static void main(String []args)
//   {
//       
//      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter the String :");
//      String str=sc.nextLine();    
//      
//      str = str.replaceAll("\\s", ""); 
//     
//      System.out.println("After Removing :"+str); 
//   }
//}


// How to Count Occurrences of a Character in a string

//public class basic4 {
//	public static void main(String[] args){
//		String str = "abracadabra-banana";
//		System.out.println(str);
//		
//		int count = str.length() - str.replace("a", "").length();
//		System.out.println("occurrence of a: "+count);
//	}
//}




// How to Count Words in a String


//
//public class basic4 {
//
//    public static void main(String[] args) {
//        String str = "welcome to java   tutorial on Java2blog";
//
//        int count = 1;
//
//        for (int i = 0; i < str.length() - 1; i++)
//        {
//            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
//            {
//                count++;
//            }
//        }
//        System.out.println("Number of words in a string : " + count);
//    }
//}


// How to Reverse Each Word in a String

//public class basic4 {
//	public static void main(String[] args) {
//		String str = "Java";
//
//		
//		String[] words = str.split(" ");
//		String revString = "";
//		for (int i = 0; i < words.length; i++) {
//			String word = words[i];
//			String revWord = "";
//			for (int j = word.length() - 1; j >= 0; j--) {
//				revWord = revWord + word.charAt(j);
//			}
//			revString = revString + revWord + " ";
//		}
//		System.out.println(revString);
//	}
//}


// How to Read Data From Text File



//public class basic4 {
//	   public static void main(String[] args) {
//	      try (BufferedReader br = new BufferedReader(new FileReader("myFile"))) {
//	         String sCurrentLine;
//	         
//	         while ((sCurrentLine = br.readLine()) != null) {
//	            System.out.println(sCurrentLine);
//	         }
//	      } catch (IOException e) {
//	         e.printStackTrace();
//	      }
//	   }
//	}


// How to Write Data Into Text File





public class basic4 {

	public static void main(String[] args) throws IOException {

		String text = "Welcome to geekforgeeks\nHappy Learning!";

		Path fileName = Path.of("C:/Users/SightSpectrum/Desktop/rrr/demo.txt");

		Files.writeString(fileName, text);

		String file_content = Files.readString(fileName);

		System.out.println(file_content);
	}
}










































































