import java.util.ArrayList;
import java.util.List;

public class NqueenN {


    //to check the queen place in board
    public static boolean isSafe(int row , int col ,char[][] board ){
        //horizantal check
        for(int j=0 ; j<board.length ; j++){
            if(board[row][j]=='Q'){
                return false;
            }   
        }

        //vertical check
        for(int j=0;j<board[0].length;j++){
            if(board[j][col] == 'Q'){
                return false;
            }
        }

        //upper left
        int r = row ;
        for(int i=col ; i>=0 && r>=0 ; i--, r--){
            if(board[r][i] == 'Q'){
                return false;
            }
        }

        //upper right
        int r1 = row ;
        for(int i=col ; i<board.length && r1>=0 ; r1-- , i++){
            if(board[r1][i] == 'Q'){
                return false;
            }
        }

        //lower left
        int r2  = row;
        for(int i=col ; i>=0 && r2<board.length ; i--, r2++){
            if(board[r2][i]=='Q'){
                return false ;
            }
        }

        //lower right
        int r3 = row ;
        for(int i =col ; i<board.length && r3<board.length ; r3++ , i++){
            if(board[r3][i]=='Q'){
                return false;
            }
        }

        return true;

    }


    //to save the queen places in array
    public static void saveBoard(char[][] board , List<List<String>> allBoard){
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i=0 ; i<board.length ; i++){
            row="";//we have to update the row to get individual rows
            for(int j=0 ; j<board[0].length ; j++){
                if(board[i][j]=='Q'){
                    row += 'Q';
                }else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }

    public static void helper(char[][] board , List<List<String>> allBoard , int col){
        if(col == board.length){
            saveBoard(board ,allBoard);
            return;
        }
        for(int row = 0 ; row<board.length; row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoard, col+1);
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> solveQueen(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char [][] board = new char[n][n] ;
        helper(board, allBoard, 0);
        return allBoard;
    }
    public static void main(String [] args ){
        //4X4 combination 
        
        System.out.println(solveQueen(4));
    }
}
