class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] rN = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();

        for (int i = 0; i< rN.length;i++){
            boolean hit = false;
            for (int j = 0; j <mag.length && hit==false;j++){
                if(rN[i]==mag[j]){
                    mag[j]='\u0000';
                    hit=true;
                }            
            }
            if(hit==false)
                return false;         
    }
        return true;
    }
}