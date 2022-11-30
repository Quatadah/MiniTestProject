package MiniTestProject;

class PPCM{
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
}