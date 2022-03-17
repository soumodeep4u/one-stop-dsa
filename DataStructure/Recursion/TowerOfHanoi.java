class TowerOfHanoi {

    public static void towerOfHanoi (int n, char fromPeg, char toPeg, char auxPeg) {

        //base condition//
        if(n == 1) {
            System.out.println("Move disk "+n+" from "+fromPeg+" to "+toPeg+" using "+auxPeg+ "from 7");
            return;
        }
        towerOfHanoi(n-1, fromPeg, auxPeg, toPeg);
        System.out.println("Move disk "+n+" from "+fromPeg+" to "+toPeg+" using "+auxPeg +"from line 11");
        towerOfHanoi(n-1, auxPeg, toPeg, fromPeg);
    }

    public static void main (String args[]) {

        char fromPeg = 'A';
        char toPeg = 'C';
        char auxPeg = 'B';
        int numberOfDisc = 3;
        towerOfHanoi(numberOfDisc, fromPeg, toPeg, auxPeg);
    }
}

n = 3, toh(2, A, C, B)
n = 2, toh(1, A, B, C)
n = 1, A