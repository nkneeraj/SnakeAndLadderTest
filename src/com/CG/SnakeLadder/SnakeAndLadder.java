package com.CG.SnakeLadder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int start_position = 0;
		int no_of_players = 1;		
		int dice_value = (int)Math.floor(Math.random()*10)%6;
		
		int current_position = start_position;
		int action_taken = (int)Math.floor(Math.random()*10)%3;
		
		int no_play = 0;
		int ladder_value = 1;
		int snake_value = 2;
		
		if(action_taken == no_play)
			return;
		else if(action_taken == ladder_value)
			current_position+=dice_value;
		else 
			current_position-=dice_value;
		
}
}