public class Main {
    public static void main(String[] args) {
        int arr[][]= {{3, 4, 5},
                    {4, 7, 9}}; //[2*3] dimensional array
        float sum=0;
        for(int i=0; i<2; i++){ //for row
            for(int j=0; j<3; j++){ //for column
                sum =  sum+ arr[i][j];
            }
        }
        {
            System.out.println(sum/6);
        }
    }
}