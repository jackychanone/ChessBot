package chess.bots;

import src.chess.interfaces.AbstractSearcher;
import src.chess.interfaces.Board;
import src.chess.interfaces.Move;
import src.exceptions.NotYetImplementedException;

public class AlphaBetaSearcher<M extends Move<M>, B extends Board<M, B>> extends AbstractSearcher<M, B> {
    public M getBestMove(B board, int myTime, int opTime) {
        throw new NotYetImplementedException();
    }
}