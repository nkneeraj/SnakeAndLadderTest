package com.CG.SnakeLadder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int p1_position = 0;
		int p2_position = 0;
		int no_of_players = 2;		
		int no_play = 0;
		int ladder_value = 1;
		int snake_value = 2;
		int counter = 0;

		while(p1_position !=100 && p2_position !=100)
		{	
			int dice_value = (int)Math.floor(Math.random()*10)%6;
			int action_taken = (int)Math.floor(Math.random()*10)%3;
			counter++;
			if(action_taken == no_play)
				System.out.println("no play for player1");
			else if(action_taken == ladder_value)
			{
				p1_position+=dice_value;
				if(p1_position > 100)
					p1_position-=dice_value;
			}
			else
			{	
				p1_position-=dice_value;
				if(p1_position<0)
					p1_position=0;
			}
			
			if(p1_position==100)
				break;
			else
			{
				dice_value = (int)Math.floor(Math.random()*10)%6;
				action_taken = (int)Math.floor(Math.random()*10)%3;
				if(action_taken == no_play)
					System.out.println("no play for player1");
				else if(action_taken == ladder_value)
				{
					p2_position+=dice_value;
					if(p2_position > 100)
						p2_position-=dice_value;
				}
				else
				{	
					p2_position-=dice_value;
					if(p2_position<0)
						p2_position=0;
				}
			}
			System.out.println("Counter:" + counter + System.lineSeparator()+ "Player1 Position:"+ p1_position + System.lineSeparator()+ "player2 Position:"+ p2_position );
		}
		if(p1_position==100)
			System.out.println("Player 1 is winner");
		else
			System.out.println("Player 2 is winner");
			
	}
}