package Programmers;

import java.util.ArrayList;

import java.util.List;

class CrainDollSelect2 {
	
	public static void main(String[] args) {
		CrainDollSelect2 cds = new CrainDollSelect2();
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4}; // 해당 column 에서 인형 뽑기
       
        int result = cds.solution(board, moves);
        
        System.out.println(result);
	}
	
	public int solution(int[][] board, int[] moves) {
		
        List<Integer> box = new ArrayList<Integer>();
        
        int cnt = 0;
        
        for (int i : moves){
        	for (int k = 0 ; k < board.length; k++) {
        		
        		if (board[k][i-1] != 0) {
        			
        			box.add(board[k][i-1]);
        			board[k][i-1] = 0;
        			
        			break;
        		}
        	}
        	
        	try{
        			
        		if (box.get(box.size() - 1) == box.get(box.size() - 2)){
        				
        				
        			
        				box.remove(box.size()-1);
        				box.remove(box.size()-1);
        				cnt += 2;
        			
        			}
        		}
        		
        			catch(IndexOutOfBoundsException iobe) {
        				
        			}
        		
        	
        }
	
           
        return cnt;
	}

}
