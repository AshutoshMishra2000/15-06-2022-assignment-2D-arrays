public class SearchElement_In_Sorted_Matrix {
    public static void main(String[] args) {
        //int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr[][] = {{18, 21, 27, 38, 55, 67}};
        int i = 0;
        int element = 27;
        int p=0;
        int j = arr[0].length-1;// basically number of columns
        while (i < arr.length && j>=0) {
            if (arr[i][j] == element) 
            {
               // System.out.println("Found");
                p++;
                break;
            } 
            if (arr[i][j] < element) 
            {
                i++;
               
            }
            else 
             {
                while (j >= 0) {
                    if (arr[i][j] == element) {
                       p++;
                       break;
                    }
                    j--;

                }
            }

        }
        if(p==0){
            System.out.println("Not found");
        }
        else{
            System.out.println("found");
        }
    }
}
