package tests.gitlab;

import chess.board.ArrayBoard;
import chess.board.ArrayMove;
import chess.game.SimpleEvaluator;
import src.chess.interfaces.Move;
import src.chess.interfaces.Searcher;

import chess.bots.ParallelSearcher;

import tests.TestsUtility;
import tests.gitlab.TestingInputs;

public class ParallelMinimaxTests extends SearcherTests {

    public static void main(String[] args) { new ParallelMinimaxTests().run(); }
    public static void init() { STUDENT = new ParallelSearcher<ArrayMove, ArrayBoard>(); }

	
	@Override
	protected void run() {
        SHOW_TESTS = true;
        PRINT_TESTERR = true;

        ALLOWED_TIME = 30000;
	    
        test("depth2", TestingInputs.FENS_TO_TEST.length);
        test("depth3", TestingInputs.FENS_TO_TEST.length);
        test("depth4", TestingInputs.FENS_TO_TEST.length);
		
		finish();
	} 
}
