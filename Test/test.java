2) Difference between premitive and non premitive datatype

Premitive datatype : These datatypes are always starts with lowecase letters.
premitive datatypes are int, float, char, short, double, long, boolean, byte

Non premitive datatype : These datatypes are starts with uppercase letters.
Non premitive datatypes are String, ClassName

3) Class - Class is a blueprint to creat an object or it is a design, it contains states and behaviours.
state is considered to be a variables and behaviour is considered to be as method.

Variables : It is a registered area allocated in the memory.

Ex: 

Class User{

  public static void main(String agrs[]){
  
  String name = "Sneha";
  long mobileNo = 8618461535L;
  int age = 22;
  String branch = "ECE";
  
 }
}

*) In this name , mobileNo, age all are variables.

7) 
class ReverseNumber{
   public static void main(String args[]){
   int n = 1234;
   int rev = 0;
   
   while(n != 0){
    int rem = n%10;
	rev = rev * 10 + rem;
	n = n/10;
	}
	
	Systeem.out.println(rev);
  }
}

1) Platform independence means JVM can run in all the operating systems. Means first source code is written by the developres this source code is human readable, 
compiler will convert the source code into byte code . This byte code is platform independence because it will run in any of the operating system. Then this byte 
code is input to the jvm, jvm will executes the byte code using set of libraries.

8) hours to seconds:

class HoursToSeconds{
    public static void main (String args[]){
	int hours = 2;
	int seconds =1;
	 
	seconds = hours * 60 * 60;
	
	System.out.println(seconds);
	
  }

}

9)
class AmstrongNumber{

      public static void main(String args[]){
	  
	  int number = 371, originalNumber, reminder, result = 0;
	  
	  originalNumber = number;
	  
	  while(originalNumber != 0){
	  
	     reminder = originalNumber % 10;
		 result += Math.pow(reminder, 3);
		 originalNumber = originalNumber / 10;
	   
	  }
	  
	  if(result == number){
	     
		 System.out.println(number + " is an Amstrong number");
	  
	  }
	  
	  else{
	  
	     System.out.println(number + " is not an Amstrong number");	  
	  
	  }
	  
	}

}

4)
class Percentage{

     public static void main(string args[]){
	 
      int totalMarks = 600;
	  int receivedMarks = 545;
	  
	  float percentage = receivedMarks/totalMarks * 100;
	  
	  System.out.println(percentage);
	  retun;
	 }
}

5)
class DuplicateElements{
	
    public static void main(String args[]){
		
    int[] values = new int[]{34, 78, 90, 53, 34, 11, 53, 15, 78, 91, 8, 4, 67, 11};
	
    for(int i=0;i<values.length;i++){
		
      for(int j=i+1; j<values.length;j++){
		  
        if(i!=j && values[i]==values[j]){
			
         System.out.println("Duplicate element found:" + values[i]);
    }
	
  }
  
 }
 
 }
 
}

6)
Method : It is a Collection of statements combined to perform a specific function.
public static void main(){
	
}
*) In this main is method.







