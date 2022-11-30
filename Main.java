class Main{
    public static int ppcm(int a, int b){
        int ppcm = 0;
        int i = 1;
        while(ppcm == 0){
            if(i%a == 0 && i%b == 0){
                ppcm = i;
            }
            i++;
        }
        return ppcm;
    }
    
    public static void main(String[] args){
        int a = 12;
        int b = 18;
        System.out.println(ppcm(a,b));        
    }
}