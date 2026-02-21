class NumberOfSpecialChars {
    public int numberOfSpecialChars(String word) {
        int [] arr1 = new int[26];
        int [] arr2 = new int[26];
        int count = 0;

        for(char c: word.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                arr1[c - 'a']++;
            }else{
                arr2[c - 'A']++;
            }
        }

        for(int i = 0; i < 26; i++){
            if(arr1[i] != 0 && arr2[i] != 0){
                count++;
            }
        }

        return count;
        
    }
}