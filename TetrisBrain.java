package cs1302.arcade;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/** Operates tetris game and combines all the other classes. */
public class TetrisBrain {

	protected TetrisBoard tetrisBoard;
	protected TetrisScore tetrisScore;
	protected int level;

	protected BooleanProperty paused = new SimpleBooleanProperty();

	/**
	* Constructor.
	* @param i
	*/
	public TetrisBrain(int i) {
		level = i;
		tetrisBoard = new TetrisBoard(i);
		tetrisScore = new TetrisScore(this);

		paused.addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean aBoolean2) {
                if (aBoolean2) {
                    pauseGame();
                } else {
                    playGame();
                }
            }
        });
	}

	/**
	* Returns tetris board.
	* @return board
	*/
	public TetrisBoard getBoard() {
		return tetrisBoard;
	}

	/** Starts game. */
	public void startGame() {
		  tetrisBoard.start();
		  tetrisScore.getScore().set(0);
		  tetrisScore.getLines().set(0);
		  paused.set(false);
	  }

		/** Pause game. */
	  public void pauseGame() {
		  tetrisBoard.pause();
	  }

		/** Stops game. */
	  public void stopGame() {
		  tetrisBoard.clear();
		  tetrisScore.getScore().set(0);
		  tetrisScore.getScore().set(0);
		  paused.set(false);
	  }

		/** Plays game. */
	  public void playGame() {
		  paused.set(false);
		  tetrisBoard.play();
	  }

		/**
		* Returns score board.
		* @return score board
		*/
	  public TetrisScore getTetrisScore() {
		  return tetrisScore;
	  }


}
