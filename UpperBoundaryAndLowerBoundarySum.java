public class UpperBoundaryAndLowerBoundarySum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i=0;
 
        int sum=0;
        while(i<arr.length){
           int j=0;
            while(j<arr[i].length){
                sum+=arr[i][j];
                j++;
            }
i=i+arr.length-1;
        }
        System.out.println(sum);
    }
}
