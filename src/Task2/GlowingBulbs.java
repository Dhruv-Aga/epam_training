//Glowing Bulbs
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static int[] indexArray = new int[40];
    
    public static int[] getAllIndex(String inputString) {
        int arrayCount = 0;
        indexArray = new int[40];
        
        int tempIndex = inputString.indexOf("1")+1;
        
        if(tempIndex==0){
            return indexArray;
        }
        
        indexArray[0] = tempIndex;
        arrayCount++;
        
        while(true){
            tempIndex = inputString.indexOf("1",indexArray[arrayCount-1])+1;
            
            if(tempIndex==0){
                return indexArray;
            }
            
            indexArray[arrayCount] = tempIndex;
            arrayCount++;
        }
        
    }
    
    public static boolean checkNumber(long inputCounter, int[] indexArray) {
        int indexArrayLength = indexArray.length;
        // System.out.println(inputCounter);
        for(int k=0; k<indexArrayLength ; k++) {
            if(indexArray[k]==0){
                break;
            }
            if(inputCounter%indexArray[k]==0) {
                return true;
            }
        } 
        return false;
    }
    
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfInput = Integer.parseInt(br.readLine());
        String inputString = "";
        long inputK;
        int[] tempArray;
        long k;
        long counter;
        for(int i=1; i<=noOfInput; i++){
            inputString = br.readLine();
            inputK = Long.parseLong(br.readLine());
            tempArray = getAllIndex(inputString);
            k=0;
            counter=1;
            while(true){
                if(inputK <= k){
                   break;
                }
                if(checkNumber(counter, tempArray)){
                    k=k+1;
                }
                counter=counter+1;
            }
            System.out.println(counter-1);
        }
    }
}
