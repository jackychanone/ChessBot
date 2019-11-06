package chess.bots;

import src.chess.interfaces.AbstractSearcher;
import src.chess.interfaces.Board;
import src.chess.interfaces.Evaluator;
import src.chess.interfaces.Move;
import src.exceptions.NotYetImplementedException;

/**
 * This class should implement the minimax algorithm as described in the
 * assignment handouts.
 */
public class SimpleSearcher<M extends Move<M>, B extends Board<M, B>> extends
        AbstractSearcher<M, B> {

    public M getBestMove(B board, int myTime, int opTime) {
        /* Calculate the best move */
        BestMove<M> best = minimax(this.evaluator, board, ply);
        return best.move;
    }

    static <M extends Move<M>, B extends Board<M, B>> BestMove<M> minimax(Evaluator<B> evaluator, B board, int depth) {
        throw new NotYetImplementedException();
    }
}