package com.example.snakeandladders;

import javafx.util.Pair;

import java.util.ArrayList;

public class Board {
    ArrayList<Pair<Integer,Integer>>positionCoordinates;
    ArrayList<Integer>snakeLadderPosition;
    public Board()
    {
        positionCoordinates=new ArrayList<>();
        populatePositionCoordinate();
        populateSnakeLadder();
    }
    private void populatePositionCoordinate()
    {
        // Coordinates to move our coins
        positionCoordinates.add(new Pair<>(0,0));//Dummy values;
        for (int i = 0; i < SnakeAndLadders.height; i++) {
            for (int j = 0; j <SnakeAndLadders.width ; j++) {
                //X Co-ordinate
                int xCord=0;
                if(i%2==0)
                {
                    xCord=j*SnakeAndLadders.tileSize+SnakeAndLadders.tileSize/2;
                }
                else
                {
                    xCord=SnakeAndLadders.tileSize*SnakeAndLadders.height-(j*SnakeAndLadders.tileSize)-SnakeAndLadders.tileSize/2;
                }

                //Y co-ordinate
                int yCord=SnakeAndLadders.tileSize*SnakeAndLadders.height-(i*SnakeAndLadders.tileSize)-SnakeAndLadders.tileSize/2;
                positionCoordinates.add(new Pair<>(xCord,yCord));

            }

        }
    }
    private void populateSnakeLadder()
    {
        snakeLadderPosition=new ArrayList<>();
        for (int i = 0; i < 101; i++)
        {
            snakeLadderPosition.add(i);
        }
        snakeLadderPosition.set(4,25);
        snakeLadderPosition.set(13,46);
        snakeLadderPosition.set(27,5);
        snakeLadderPosition.set(33,49);
        snakeLadderPosition.set(40,3);
        snakeLadderPosition.set(42,63);
        snakeLadderPosition.set(43,18);
        snakeLadderPosition.set(50,69);
        snakeLadderPosition.set(54,31);
        snakeLadderPosition.set(62,81);
        snakeLadderPosition.set(66,45);
        snakeLadderPosition.set(76,58);
        snakeLadderPosition.set(74,92);
        snakeLadderPosition.set(89,53);
        snakeLadderPosition.set(99,41);

    }
    public int getNewPosition(int currPosition)
    {
        if(currPosition>0 && currPosition<=100)
        {
            return snakeLadderPosition.get(currPosition);
        }
        return -1;
    }
    int getXCoordinate(int position)
    {
        if(position>=1 && position<=100)
            return positionCoordinates.get(position).getKey();
        return -1;
    }
    int getYCoordinate(int position)
    {
        if(position>=1 && position<=100)
            return positionCoordinates.get(position).getValue();
        return -1;
    }
    /*public static void main(String[] args) {
        Board board=new Board();
        for (int i = 0; i <board.positionCoordinates.size(); i++) {
            System.out.println(i+"$ x :"+board.positionCoordinates.get(i).getKey()+
                    "y : "+board.positionCoordinates.get(i).getValue());
        }
    }*/
}

