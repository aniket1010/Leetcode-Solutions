import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else{
               
               if (stack.isEmpty()){
                   return false;
                }
            
                 else {
                    char poppedvalue=stack.pop();
                
                     if     (poppedvalue=='('&&s.charAt(i)!=')')return false;
                     else if(poppedvalue=='['&&s.charAt(i)!=']')return false;
                     else if  (poppedvalue=='{'&&s.charAt(i)!='}')return false;
                   
            }
        }

       
    }
         if(stack.isEmpty()==true)return true;
        
        else return false;
}
}