package MiniTestProject;

class PPCM{
	//PPCM_HLR : This function shall take two integers.
    public int ppcm(int a, int b){
    	//PPCM_LLR : This function shall take two positive integers.
    	if (a <0  || b <0) return -1;
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