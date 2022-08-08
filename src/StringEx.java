
public class StringEx 
{		
    static String s1="Ashutosh";
    static String s2=new String("Rusiya");
    char[] ch= {'a','s','h','u'};
    String s3=new String(ch);
    static String s4="Ashutosh";
   
    public static void concatination()
    {
     String result=StringEx.s2.concat(s1);   
     System.out.println(result);
    }
    
    public static void length()
    {
      int l=s1.length();	
      System.out.println(l);
    }
     public static void checkEqual()
     {
    	boolean b=s1.equals(s4);
         System.out.println(b);
         if(s1==s2)
         {
        	 System.out.println(s1);
         }
         else if(s1.equals(s2))
        	 System.out.println(s1);
         else
        	 System.out.println(s1.hashCode()+" "+ s2.hashCode());
     }
    public static void main(String[] args) 
    {
    	StringEx.concatination();
    	StringEx.length();
    	StringEx.checkEqual();
    }
   }

   
