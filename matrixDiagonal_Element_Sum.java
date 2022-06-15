public class matrixDiagonal_Element_Sum {
    public static void main(String[] args) {
       // int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        //Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.  (for square matrix)
//sum of primary diagonal

int primary_Diagonal_Sum=0;
    int j=0;int i=0;    
while(i<arr.length && j<arr.length){
    primary_Diagonal_Sum+=arr[i][j];
    i++;
    j++;
}

int secondary_Diagonal_sum=0;
i=0;j=arr.length-1;

while(i<arr.length && j>=0){
    if(i==j){
        i++;
        j--;
    }
    else{
        secondary_Diagonal_sum+=arr[i][j];
        i++;
        j--;
    }
}
System.out.println(primary_Diagonal_Sum);
System.out.println(secondary_Diagonal_sum);
    }
}
