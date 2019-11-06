package tests.gitlab;

import chess.board.ArrayBoard;
import chess.board.ArrayMove;
import chess.game.SimpleEvaluator;
import src.chess.interfaces.Move;
import src.chess.interfaces.Searcher;

import chess.bots.SimpleSearcher;

import tests.TestsUtility;
import tests.gitlab.TestingInputs;

public class MinimaxTests extends SearcherTests {

	public static void main(String[] args) { new MinimaxTests().run(); }
    public static void init() { STUDENT = new SimpleSearcher<ArrayMove, ArrayBoard>(); }
	
	@Override
	protected void run() {
        SHOW_TESTS = true;
        PRINT_TESTERR = true;

        ALLOWED_TIME = 20000;
	    
        test("depth2", TestingInputs.FENS_TO_TEST.length);
        test("depth3", TestingInputs.FENS_TO_TEST.length);
		
		finish();
	} 
}
