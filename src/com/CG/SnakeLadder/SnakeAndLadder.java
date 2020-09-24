package com.CG.SnakeLadder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int start_position = 0;
		int no_of_players = 1;		
		

		int current_position = start_position;


		int no_play = 0;
		int ladder_value = 1;
		int snake_value = 2;

		while(current_position<100)
		{	int dice_value = (int)Math.floor(Math.random()*10)%6;
			int action_taken = (int)Math.floor(Math.random()*10)%3;
			if(action_taken == no_play)
				continue;
			else if(action_taken == ladder_value)
			{
				current_position+=dice_value;
				if(current_position > 100)
					current_position-=dice_value;
			}
			else
			{	
				current_position-=dice_value;
				if(current_position<0)
					current_position=0;
			}	
	}
}