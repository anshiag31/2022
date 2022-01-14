import java.util.*;
public class ABDemo {
    public static void main(String[] args) {
        String s1="ant";   //false
        // String s1="any";   //true
        String s2="nay";
        char[] ch1=new char[s1.length()];
        Scanner s=new Scanner(System.in);

    for (int i = 0; i <ch1.length; i++) {
           ch1[i]=s1.charAt(i);
//            ch1[i]=s.next();
        }
        char ch=s.next().charAt(0);
        char arr1[] = s1.toCharArray();
        char arr2[]= s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));


    }
}
