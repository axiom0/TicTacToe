package com.axiom.tictactoe;

public class TicTacToe {
    /*  board 0=empty 1=circle(red) 2=cross(blue)
    *  0=00,1=01,2=02,3=10,4=11,5=12,6=20,7=21,8=22 */
    public int[] board = new int[9];
    int side = 1;
    int turns = 0;
    public static final int EMPTY = 0;
    public static final int RED = 1;
    public static final int BLUE = 2;
    public static final int NOT_SETTLED = 3;
    public static final int DRAW = 4;
    public static final int WIN_RED = 5;
    public static final int WIN_BLUE = 6;

    TicTacToe() {
        for (int i = 0; i < 9; i++) {
                this.board[i] = 0;
        }
    }

    public void changeSide() {
        if(side==RED){
            side =BLUE;
        } else if(side == BLUE){
            side = RED;
        }
    }

    /*This method is assumed to be called only by onClick method of MainActivity.
    *
    * position can be 0 to 8.
    * */
    public int updateBoard(int position){
        int tmp = board[position];
        if(tmp==EMPTY){
            board[position] = side;
            turns++;
            changeSide();
        }

        return board[position];
    }

    /*checkBoardFlag method returns board status (not settled, draw, red win, blue win)*/
    public int checkBoardFlag() {
        int flag;

        int c = board[4];
        if((board[0]==board[1] && board[0]==board[2])||(board[0]==board[3] && board[0]==board[6])){
            flag=convertWin(board[0]);
        }else if((board[8]==board[7] && board[8]==board[6])||(board[8]==board[5] && board[8]==board[2])){
            flag=convertWin(board[8]);
        }else if( (c==board[0]&&c==board[8]) || (c==board[2]&&c==board[6])
                            || (c==board[1]&&c==board[7]) || (c==board[3]&&c==board[5]) ){
            flag=convertWin(c);
        }//WIN
        else if(turns>=9){
            flag=DRAW;
        }//DRAW
        else{
            flag=NOT_SETTLED;
        }
        return flag;
    }

    private int convertWin(int side){
        int t = 0;
        if(side==RED){
            t=WIN_RED;
        }else if (side==BLUE){
            t=WIN_BLUE;
        }

        return t;
    }





}