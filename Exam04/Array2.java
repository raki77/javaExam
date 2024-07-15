public class Array2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
     // TODO Auto-generated method stub
     int[][] M = new int[4][5];
     
     for(int row=0; row<4; row++) {
      for(int col=0; col <5; col++) {
       M[row][col] = row + col;
      }
     }
     
     for(int row=0; row<4;row++) {
      for(int col=0; col <5; col++) {
       System.out.println("Array M [" + row + "][" + col + "] =" + M[row][col]);
      }
     }
   
    }
   
   }