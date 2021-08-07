import java.util.*;
import java.lang.Math;
public class OTP{

   public static void main(String [] args){
		int length=4;
		System.out.println(getOTP(length));
   }
   
   public static char[] getOTP(int len){
		String numbers="0123456789";
		Random rand=new Random();
		char [] pass= new char[4];
		for(int i=0;i<len;i++)
		{
		   pass[i]=numbers.charAt(rand.nextInt(numbers.length()));
		   
		}
		return pass;
   }
  }