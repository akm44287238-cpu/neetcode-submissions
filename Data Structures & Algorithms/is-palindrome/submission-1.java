class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n=s.length();
        String news="";
        for(int i=0;i<n;i++){
            int check=(int)s.charAt(i);
            if((check>=97 && check<=122) || check>=48 && check<=57 ){
                news=news+s.charAt(i);
            }
        }

        int m=news.length();

        for(int i=0;i<m/2;i++){
            char ft=news.charAt(i);
            char bk=news.charAt(m-i-1);
            if(ft != bk){
                return false;
            }
        }
        return true;
    }
}
