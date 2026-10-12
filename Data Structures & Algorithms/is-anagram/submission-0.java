class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable <Character,Integer> tableS=new Hashtable<>();

        for(int i=0;i<s.length();i++){
            if(tableS.containsKey(s.charAt(i))){
                int temp=tableS.get(s.charAt(i));
                tableS.replace(s.charAt(i),temp+1);
            }else{
                tableS.put(s.charAt(i),1);
            }
        }

        Hashtable <Character,Integer> tableT=new Hashtable<>();

        for(int i=0;i<t.length();i++){
            if(tableT.containsKey(t.charAt(i))){
                int temp=tableT.get(t.charAt(i));
                tableT.replace(t.charAt(i),temp+1);
            }else{
                tableT.put(t.charAt(i),1);
            }
        }

        return tableS.equals(tableT);
    }
}
