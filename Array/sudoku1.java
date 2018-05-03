
public class sudoku1{
    public static void main(String[] args){
        // System.out.println("SDP");
        int[][] board;
        board = new int[3][3];
        int x = 0;
        int tempi;
        int temp = 0;
        boolean check = false;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                // x+=1;
                board[i][j] = x;
                // System.out.print(board[i][j] + " ");
            }
            // System.out.println("");
        }
        board[0][1] = 1;

        // -- Printing
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // // -- Checking 3x3
        // for (int i=0; i<3; i++){
        //     for (int j=0; j<3; j++){
        //         if (j>0) 
        //             check = true;
        //         if (check){
        //             temp = board[i][j];
        //             tempi = board[i][j-1];
        //             if(temp.equals(tempi))
        //                 System.out.print("love do coccaine");
        //         }
        //             // if(board[i][j] == board[i][j-1])
        //             // if(1 == 1)
        //     }
        // }
        
        // -- need to fix
        for (int i=1; i<=3; i++){
            for (int j=1; j<=3; j++){
                if(board[i-1][j-1]==board[i-1][j]){
                    temp +=1;
                    System.out.print("sameNum = " + temp );
                }
            }
        }

        // Checking 3x3
        // for (int k=0;i<=3;i++){
        //     for (int l=0;j<=3;j++){
        //         System.out.print(board[k][l] + " ");
        //     }
        //     System.out.println("");
        //         // temp = board[i][j]; 
        //         // if(i>0 && j>0) {if(board[i][j-1]==temp) {System.out.print("dorm");}
        //         // } 
        //     // }
        //     // if (i<2){
        //     //     tempi = i+1;
        //     // }else tempi = i;

        //     // if (board[tempi][0]==board[i][j]) {System.out.print("dormi");}

        //     // if(i>0) if(board[i-1][j]==temp) System.out.print("dorm");
        // }

    }
}




/*
Check 3x3
1 2 3
4 5 6
7 8 9
*/