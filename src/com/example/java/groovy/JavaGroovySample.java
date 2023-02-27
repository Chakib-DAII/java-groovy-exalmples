package com.example.java.groovy;

import com.example.java.groovy.nativec.NativeCalls;
import com.example.java.groovy.sys.calls.JavaSystemCalls;

public class JavaGroovySample {
  
  static long sum = 0;
  
  public static void main(String[] args) {
    JavaSystemCalls.execute();
    NativeCalls.printText();
    new NativeCalls().printText("Hello Native");
    String s = solvePrefixPalindrome("abbab");
    System.out.println("result: "+s);
    int[] a = {10, 2};
    long sum = concatenationsSum(a);
    System.out.println("result: "+sum);
  }
  
  static String solution(String s) {
    if(s.equals(""))
      return "";
    else if(s.length() == 1)
      return s;
    else {
      s = s.toLowerCase();
      String prefix = "";
      do{
        prefix = getPrefixes(s);
        if(prefix.length() != 1){
          s = s.substring(prefix.length(), s.length());
        } else {
          s = isPalindrome(s) ? "" : s;
          return s;
        }
      }while(!s.equals("") && isPalindrome(prefix));
      return s;
    }
  }

  static String getPrefixes(String s){
    String prefix = "";
    if(s.length() == 0)
      return prefix;
    else{
      int i = 0;
      do{
        prefix = prefix+s.charAt(i++);
      } while(s.length() != 0 && s.length()>i && s.charAt(i) == prefix.charAt(prefix.length()-1));
      return prefix;
    }
  }

  static boolean isPalindrome(String s){
    if(s.length() == 0 || s.length() == 1) return true;

    if(s.charAt(0) == s.charAt(s.length()-1))
      return isPalindrome(s.substring(1, s.length()-1));
    return false;
  }

  public static String solvePrefixPalindrome(String s) {

    int max=0;

    for(int i=2;i<=s.length();i++){

      String s1 = s.substring(0,i);
      StringBuilder go = new StringBuilder(s1);
      String s2= String.valueOf(go.reverse());

      if(s2.equals(s1)){
        if(s2.length()>max)
          max= s2.length();
      }
    }

    if (max>1)
      return solvePrefixPalindrome(s.substring(max));
    else
      return s.substring(max);

  }


  public static long concatenationsSum(int[] a){
    long sum = 0;
    for(int i=0; i<a.length;i++)
      for(int j=0; j<a.length;j++){
        long prod =  Long.parseLong(""+a[i] + ""+a[j]);
        sum += prod;
      }
    return sum;
  }

  public static long concatenationsSumOptimized(int[] a){
    long sum = 0;
    long total = 0;
    for(int i = 0; i < a.length; i++) {
      sum += a[i];
      total += a[i] * Math.pow(10, (int)Math.log10(sum) + 1) + sum;
    }
    return total;
  }



  public static long concatenationsSumRecursive(int[] a, int i, int j) {
    if (i == a.length) {
      return sum;
    }

    if (j == a.length) {
      return concatenationsSumRecursive(a, i + 1, 0);
    }

    sum += Long.parseLong(Integer.toString(a[i]) + Integer.toString(a[j]));

    return concatenationsSumRecursive(a, i, j + 1);
  }
}
