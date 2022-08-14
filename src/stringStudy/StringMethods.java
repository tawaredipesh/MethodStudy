package stringStudy;

public class StringMethods {

	public static void main(String[] args)  
	{
		 String s="Hi";// created string without using new keyword
		 String s1= new String("Hello"); // created using new keyword
		 
		 System.out.println(s);
		 // use of length method
		 
		 System.out.println(s1.length());
		 
		 int myLength = s1.length();
		System.out.println(myLength);
		
		String s2="";
		System.out.println(s2.length());
        System.out.println("\n");
	//	String s3=null;
	//	System.out.println(s3.length());  NullPointerException
		
		// Use of touppercase() method
		
		String a="velocity";
		System.out.println(a);
		System.out.println(a.toUpperCase());
		
		String b= a.toUpperCase();
		System.out.println(b);

		
		// use of toLowerCase() method
		
		
		System.out.println(b.toLowerCase());
		System.out.println("\n");
		
		// use of equals() method
		
		String v0="velocity"; //constant pool area
		String v1="velocity"; //constant pool area
		String v2= new String("velocity"); //Non constant pool area
		String v3= new String ("velocity");//Non constant pool area
		String v4= new String ("Velocity");//Non constant pool area
		
		System.out.println(v0==v1);//FOR comparing location
		System.out.println(v1==v2);
        System.out.println(v2==v3);
        System.out.println("\n");
        System.out.println(v0.equals(v1));//for comparing data value
        System.out.println(v1.equals(v2));
        System.out.println(v2.equals(v3));
        System.out.println(v3.equals(v4));
        System.out.println("\n");
        
        // equals Ignore Case()
        System.out.println(v3.equalsIgnoreCase(v4));
        System.out.println("\n");
        
        // contains() method use
        String d="Velocity";
        System.out.println(d.contains("Vel"));
        System.out.println("\n");
        
        
        // isEmpty() method use
        
        String e0="Pune";
        String e1=" ";
        // String e2=null;
        String e3="";
        
        System.out.println(e0.isEmpty());
        
        boolean result = e0.isEmpty();
        System.out.println(result);
        
        System.out.println(e1.isEmpty()); //white space present here so no empty
        //System.out.println(e2.isEmpty());  Null Pointer Exception
         System.out.println(e3.isEmpty());
         System.out.println("\n");
         System.out.println(e0.isBlank());
         System.out.println(e1.isBlank());
         System.out.println("\n");
         
         //charAt method use
         
         String w="Thane";
         System.out.println(w.charAt(0));
         
         char ans=w.charAt(3);
         System.out.println(ans);
         
       //   System.out.println(w.charAt(9)); String Index Out Of Bounds Exception
       // System.out.println(w.charAt(-1));
         
         System.out.println("\n");
         
         //endsWith method use
         String h="abcd";
         
         System.out.println(h.endsWith("d"));
         System.out.println(h.endsWith("cbd"));
         System.out.println(h.endsWith("bcd"));
         System.out.println(h.endsWith("abcd"));
         System.out.println("\n");

         //startsWith method use
         
         String y="India";
         System.out.println(y.startsWith("in"));
         System.out.println(y.startsWith("Ind"));
         System.out.println(y.startsWith("India"));
         System.out.println(y.startsWith("dia",2));
         System.out.println("\n");
         
         
         // substring method use
         
         String m="Maharashtra";
         System.out.println(m.substring(4));
         
         String str= m.substring(2);
         System.out.println(str);
         System.out.println(m.substring(0,4));
         System.out.println("\n");
         
         // concat method use
         System.out.println("Concat() method use: for combining two string");
         String a1="Gov Of ";
         String a2="India";
         
         System.out.println(a1.concat(a2));
         System.out.println(a1.concat("Maharastra"));
         System.out.println("\n");
         
         // indexOf method use
         System.out.println("indexOf() method use: Number of syntax");
         String t="Tea";
         int index =t.indexOf('e');
         System.out.println(index);
         
         // LastIndexOf() method 
         System.out.println("LastIndexOf() method ");
         String t1="India is my country which is 2nd biggest";
         System.out.println(t1.lastIndexOf('i'));
         System.out.println(t1.indexOf('i',24));
         System.out.println("\n");
         
         // replace method ()
         System.out.println("replace method ()");
         String m4="testing";
         System.out.println(m4.replace('t', 'o'));
         System.out.println(m4.replace("ing",""));
         
         
	}

}
