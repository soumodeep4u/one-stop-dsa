class BinaryString {

    static int[] A = new int[4];

    public static void doBinaryString(int n){
        if(n < 1) {
            for(int i=0; i < A.length; i++){
                System.out.println(A.toString());
            }

        }else {
            A[n-1] = 0;
            doBinaryString(n-1);
            A[n-1] = 1;
            doBinaryString(n-1);
        }
    }

    public static void main(String args[]){
            doBinaryString(4);
    }

}