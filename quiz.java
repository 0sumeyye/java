import java.util.Scanner;
 public class quiz{
 	public static void main(String[]args){
		 Scanner s= new Scanner(System.in);
		 System.out.println("Enter youre name letter");

		 int size = s.nextInt();
		char myName[] = new char [size];

		 System.out.println("inter the letter");

		  for(int a=0;a<myName.length;a++){

			  myName[a]=s.next().charAt(0);

		  }

		  System.out.print("youre name is:");

 	     for(int a=0;a<myName.length;a++){

			 System.out.print(myName[a]);
		 }
		 System.out.println("");







 	}

 }