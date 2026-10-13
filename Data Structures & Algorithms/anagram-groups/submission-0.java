class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String,ArrayList<String>> group =new HashMap<>();

        for(int i=0;i<str.length;i++){
            int[] arr = new int[26];
            for(int j=0;j<str[i].length();j++){
                int n=(int)str[i].charAt(j);
                arr[n-97]++;
            }
            String s=Arrays.toString(arr);

            if(group.containsKey(s)){
                group.get(s).add(str[i]);
            }else{
                group.put(s,new ArrayList<>());
                group.get(s).add(str[i]);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        group.forEach((key, value) -> {
            ans.add(group.get(key));
        });

        
        return ans;
    }
}
