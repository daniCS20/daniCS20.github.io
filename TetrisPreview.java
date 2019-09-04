package cs1302.arcade;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import java.util.HashMap;
import java.util.Map;

/** Creates the tetris preview. */
final class TetrisPreview extends StackPane {

    private Map<TetrisPiece, Node> cloneToNode = new HashMap<>();
    private Map<TetrisPiece, TetrisPiece> tetrominoToClone = new HashMap<>();

    /**
    * Constructor.
    * @param brain
    */
    public TetrisPreview(TetrisBrain brain) {

        final ObservableList<TetrisPiece> pieces = brain.getBoard().getPreviews();

        pieces.addListener(new ListChangeListener<TetrisPiece>() {
            @Override
            public void onChanged(Change<? extends TetrisPiece> change) {

                while (change.next()) {
                    if (change.wasRemoved()) {
                        for (final TetrisPiece piece : change.getRemoved()) {
                            final TetrisPiece clone = tetrominoToClone.remove(piece);
                            final Node group = cloneToNode.remove(clone);
                            FadeTransition fadeOutTransition = new FadeTransition(Duration.seconds(0.1), group);
                            fadeOutTransition.setToValue(0);
                            fadeOutTransition.setFromValue(1);
                            fadeOutTransition.setOnFinished(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent actionEvent) {
                                    getChildren().remove(group);
                                }
                            });
                            fadeOutTransition.playFromStart();
                        }
                    }
                    if (change.wasAdded()) {
                        if (change.getList().size() == 1) return;
                        for (TetrisPiece added : change.getAddedSubList()) {

                            SequentialTransition sequentialTransition = new SequentialTransition();
                            TetrisPiece clone = added.clone();

                            Group group = new Group();
                            group.setOpacity(0);
                            group.getChildren().add(clone);
                            getChildren().add(group);
                            ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(0.2), group);
                            scaleTransition.setFromX(0);
                            scaleTransition.setFromZ(0);
                            scaleTransition.setFromY(0);

                            scaleTransition.setToX(1);
                            scaleTransition.setToZ(1);
                            scaleTransition.setToY(1);

                            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.1), group);
                            fadeTransition.setFromValue(0);
                            fadeTransition.setToValue(1);
                            sequentialTransition.getChildren().add(new PauseTransition(Duration.seconds(0.1)));
                            sequentialTransition.getChildren().add(fadeTransition);
                            sequentialTransition.playFromStart();

                            tetrominoToClone.put(added, clone);
                            cloneToNode.put(clone, group);
                        }
                    }
                }

            }
        });

        setPrefHeight(140);
        setPrefWidth(140);
        setAlignment(Pos.CENTER);

        if (!pieces.isEmpty()) {
            getChildren().addAll(pieces.get(0));
        }

    }
}
