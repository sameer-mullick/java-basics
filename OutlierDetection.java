public class OutlierDetection{
    public static void main(String arg[]){
        
        int array1[] = {5,8,11,13,17};
        int indx = -1;
        // check if it is 5
        if (array1.length < 5 ){
            indx = 0;
        }
        else {
            int diff = array1[1] - array1[0];  
            for (int i = 2; i < array1.length; i++){
                int expected = array1[i - 1] + diff;
                if (expected != array1[i]){
                    indx = i;
                    break;
                }
                
            }
            if (indx == 0){
                System.out.print("The array contains less than 5 elements ");
            }
            if (indx == -1){
                System.out.print("There is no outlier in the array ");
            }
            else {
                System.out.print("The outlier value is at the index: " + indx );
            }
        }
        
    }
}