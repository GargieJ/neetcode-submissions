class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        HashMap<Character,Character>map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for (int x=0;x<s.length();x++){
            if (map.containsKey(s.charAt(x))){
                stack.push(s.charAt(x));
            }
            else{
                if (s.charAt(x)==map.get(stack.peek())){
                    stack.pop();
                }
                else{return false;}
            }
        }
    if (stack.empty()){return true;}
    else{return false;}
    }
}
