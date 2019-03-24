
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
import java.lang.*;
 
class TestClass {
    
    static public int count = 0;
    
    public static void cuttingRod(int length){
                        
        if(length<=2){
            return;
        }        
        int minCutLength;
        
        minCutLength=(length-1)/2;
        
        count=count+1;        
        cuttingRod(minCutLength);
        
    }
    
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputLength = Integer.parseInt(br.readLine());          
        int rodLength;
        for(int i=1;i<=inputLength;i++){
            rodLength = Integer.parseInt(br.readLine());   
            cuttingRod(rodLength);
            System.out.println(count);
            count=0;
        }
    }
}