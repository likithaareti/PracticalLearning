import java.util.*;
import java.lang.Math;
public class Password{

   public static void main(String [] args){
		int length=10;
		System.out.println(getPassword(length));
   }
   
   public static char[] getPassword(int len){
		String capitalAlpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallAlpha="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String symbols="!@#$%^&*(-_*/";
		String values=capitalAlpha+smallAlpha+numbers+symbols;
		
		Random rand=new Random();
		char [] pass= new char[10];
		
		
		for(int i=0;i<len;i++)
		{
		   pass[i]=values.charAt(rand.nextInt(values.length()));
		   
		}
		return pass;
   }
  }