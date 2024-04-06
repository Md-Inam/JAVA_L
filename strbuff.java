import java.util.*;
class strbuff{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.next();
s1.concat("hello");
System.out.println("string after concatenation is"+s1);
StringBuffer sb=new StringBuffer("hi");
sb.append("fai");
System.out.println("string is "+sb);
StringBuffer sb1=new StringBuffer("world");
sb1.insert(0,"wideweb");
System.out.println("string after inserting is=" +sb1);
sb1.reverse();
System.out.println("reverse is=" +sb1);
StringBuffer sb3=new StringBuffer("hello muneeb");
System.out.println("before replace is=" +sb3);
sb3.replace(6,9,"java");
System.out.println(sb3);   
    }
}




/*
 * import java.util.
public static void main(String[] ar){
Scanner sc=new Scanner(System.in);
 System.out.println
 */