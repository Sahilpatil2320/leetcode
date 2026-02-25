class BinaryGap {
    public int binaryGap(int n) {
        int maxd = 0;
        int curr = 0;
        boolean found = false;
        while (n > 0) {
            int bit = n % 2;

            if (bit == 1){
                if (found) {
                    maxd = Math.max (maxd,curr);
                }
                curr = 1;
                found = true;
            }else{
                if(found){
                    curr++;
                }   
            }
            n /= 2;
        }
        return maxd;      
    }
}