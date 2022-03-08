import java.util.HashMap;

/* 
@author : Aadil matloob jan
@platform : Leetcode
@problem statement : https://leetcode.com/problems/roman-to-integer/
@difficulty : easy
*/

public class RomanToInteger {
   public static void main(String[] args){
      System.out.println(romanToInteger("XC"));  
      
   }
   public static  int romanToInteger(String s){
      HashMap<String, Integer> map = new HashMap<>(); 
         map.put("I", 1);
         map.put("V", 5);
         map.put("X", 10);
         map.put("L", 50);
         map.put("C", 100);
         map.put("D", 500);
         map.put("M", 1000);
         int total = 0;
         for(int i=0; i<s.length(); i++){
            if(i+1 < s.length() && map.containsKey(s.substring(i,i+1))){
               if(map.get(s.substring(i,i+1)) < map.get(s.substring(i+1,i+2))){
                  total -= map.get(s.substring(i,i+1));
               } else{
                  total += map.get(s.substring(i,i+1));
               }
            }else{
               total += map.get(s.substring(i,i+1));
            }
               
         }
         return total;
   }
}
