package Strings;

import java.util.Scanner;

public class StringMethods {
    void method1(){
        //.length(),.isEmpty(),.trim()
        Scanner sc= new Scanner(System.in);
        String name=" ";
        String email_id=sc.next();
        String password="1234";

        System.out.println(name.length());//RETURN STRING VALUE
        System.out.println(email_id.trim());//RETURN STRING VALUE
        System.out.println(password.isEmpty());//RETURN BOOLEAN VALUE
        if(name.trim().length()==0){
            System.out.println("name is empty");
        }else{
            System.out.println("name is not empty");
        }
    }
    void method2(){
        //.equalsIgnoreCase(),.compareTo(),.compareToIgnoreCase()
        String s="deepak";
        String s1="DEEPAK";
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.compareToIgnoreCase(s1));
        System.out.println(s.compareTo(s1));
    }
    void method3(){
        //.conCat(),.join(",",s1,s2...),+;
        String s="arman";
        System.out.println(s.concat("mm"));
        System.out.println(s.join("mm"));

    }
    void method4(){
        /*.subSequence(int beginIndex,int endIndex),.substring(indexNumber),.replace("",""),
        .replaceAll(),.replaceFirst(String regex,String replacement)*/
        String s="This is the first demo";
        System.out.println(s.substring(5));
        System.out.println(s.substring(1,9));
        System.out.println(s.subSequence(5,6));
        System.out.println(s.replace("h","m"));
        System.out.println(s.replaceAll("s","h"));
        System.out.println(s.replaceFirst("s","l"));
        searchingMethod(s);


    }
    void searchingMethod(String s){
        /* .indexOf(),.lastIndex(),.contains(),.charAt(),.endsWith(),.startsWith()*/
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("s"));
        System.out.println(s.contains("s"));
        System.out.println(s.charAt(0));
        System.out.println(s.endsWith("m"));
        System.out.println(s.startsWith("l"));
    }
    void stringConversion(String s){
        /* 1.CASE CONVERSION
        * - toLoweCase()
        * - toUpperCase()
        * 2.TYPE CONVERSION
        * - valueOf()
        * -toCharArray()*/
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.toCharArray());
    }
}
class Strings{
    public static void main(String[] args) {
        StringMethods sm=new StringMethods();
        //sm.method1();
        //sm.method2();
       // sm.method4();
        String s="arman siddi";
        System.out.println(s.charAt(0));
        System.out.println(s.substring(2));
        System.out.println(s.subSequence(3,5));
        System.out.println(s.replaceFirst("a","m"));
        System.out.println(s.replaceAll("m","a"));
        System.out.println(s.replace("a","s"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.compareToIgnoreCase("d"));
        System.out.println(s.compareTo("a"));
        String str="c";
        String abr="b";
        System.out.println(str.compareTo(abr));

    }
}
