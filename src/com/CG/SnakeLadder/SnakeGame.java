package com.CG.SnakeLadder;

public class SnakeGame {
	public static void main(String[] args) {
		System.out.println("Welcome to game");
		int start = 0;
		int player1 = start;
		int player2 = start;
		int count = 0;
		
		while(player1 != 100 && player2 != 100) {
			for(int i=0; i<2;) {
				int diceValue = (int) Math.floor(Math.random() * 10) % 6;
				int action = (int) Math.floor(Math.random() * 10) % 3;
				int noPlay = 0;
				int ladder = 2;
				int snake = 1;
				count++; 
				
				if(action == noPlay) {
					System.out.println("Stay in the same position");
					i++;
				}else if(action == ladder) {
					if(i ==1) {
						int after = player1+diceValue;
						if(after >100) {
							System.out.println("Stay in the same position");
						} else {
							player1 +=diceValue;
						}
					} else {
						int after = player2+diceValue;
						if(after >100) {
							System.out.println("Stay in the same position");
						} else {
							player2 +=diceValue;
						}
						
					}	
				} else if(action == snake){
					
					if(i ==1) {
						int after = player1-diceValue;
						if(after <0) {
							System.out.println("moving to zero");
							player1 = 0;
						} else {
							player1 -=diceValue;
						}
					} else {
						int after = player2-diceValue;
						if(after <0) {
							System.out.println("moving to zero");
							player2 = 0;
						} else {
							player2 -=diceValue;
						}
					}
					
					i++;
					
				}
				
				System.out.println("player1: "+ player1 + " player2: " + player2);
			}
			
		}
		
		if(player1 == 100 && player2 !=100) {
			System.out.println("player 1 won");
		}else if(player2 ==10 && player1 != 100) {
			System.out.println("player 2 won");
		}else if(player1 ==100 && player2 ==100) {
			System.out.println("match draw");
		}
		System.out.println(count);
		
	}
}
