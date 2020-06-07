package Seljava2020;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// multiplication table
		/*for(int j=0;j<=10;j++) {
			
			int i=5;
			int result=i*j;
			
			System.out.println(+i +"*" +j +"=" +result);*/
		
		int count = 0;
		int num = 3453;

        while(num != 0)
        {
           num= num / 10;  // 345  34  3
            ++count;
        }

        System.out.println("Number of digits: " + count);
		
        
        int number=234564;
	      int reverse = 0;
	 
	      while(number != 0)
	      {
	          reverse = reverse * 10;
	          reverse = reverse + number%10;
	          number = number/10;
	      }
	 
	      System.out.println("Reverse of the number is " + reverse);

	}


	}


