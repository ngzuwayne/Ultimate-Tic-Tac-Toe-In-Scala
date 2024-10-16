package ultimate.ttt.model

import javafx.event.ActionEvent
import javafx.scene.control.Button
import javafx.scene.image.{Image, ImageView}
import javafx.scene.layout.GridPane

class Board(
             private var cells: List[Button], // List of buttons
             private var resultImageView: ImageView,
             private var gridPane: GridPane,
             private var currentPlayer: () => String, // Function to get current player
             private var switchPlayer: () => Unit    // Function to switch player
           ) {

  // Event handler for button clicks
  def handleButtonClick(event: ActionEvent): Option[Button] = {
    val clickedButton = event.getSource.asInstanceOf[Button]

    if (clickedButton.getText.isEmpty) { // Only update if the button is not already marked
      clickedButton.setText(currentPlayer())

      // Check if the game has been won or is a draw
      if (checkForWin()) {
        endGame()
      } else if (checkForDraw()) {
        endGame(isDraw = true)
      } else {
        // Alternate between "X" and "O"
        switchPlayer()
      }

      // Return the clicked button
      Some(clickedButton)
    } else {
      // Return None if the button was already marked
      None
    }
  }

  // Method to check for a win
  def checkForWin(): Boolean = {
    val winningCombinations = List(
      // Horizontal wins
      List(cells(0), cells(1), cells(2)),
      List(cells(3), cells(4), cells(5)),
      List(cells(6), cells(7), cells(8)),
      // Vertical wins
      List(cells(0), cells(3), cells(6)),
      List(cells(1), cells(4), cells(7)),
      List(cells(2), cells(5), cells(8)),
      // Diagonal wins
      List(cells(0), cells(4), cells(8)),
      List(cells(2), cells(4), cells(6))
    )

    // Check if any winning combination has all "X" or all "O"
    winningCombinations.exists(combo => combo.forall(_.getText == currentPlayer()))
  }

  // Method to check for a draw
  def checkForDraw(): Boolean = {
    cells.forall(_.getText.nonEmpty) && !checkForWin()
  }

  // Method to end the game
  def endGame(isDraw: Boolean = false): Unit = {
    // Disable all buttons
    disableAllButtons()

    // Set the opacity of the entire GridPane to 0
    gridPane.setOpacity(0)

    // Set the result image based on the game outcome
    val imagePath = if (isDraw) {
      "/images/draw.png"
    } else if (currentPlayer() == "X") {
      "/images/X.png"
    } else {
      "/images/O.png"
    }

    val resultImage = new Image(imagePath)
    resultImageView.setImage(resultImage)
  }

  // Method to get the result of the board
  def getBoardResult(): Option[String] = {
    if (checkForWin()) {
      Some(currentPlayer())
    } else if (checkForDraw()) {
      Some("Draw")
    } else {
      None
    }
  }

  // Method to disable all buttons
  def disableAllButtons(): Unit = {
    cells.foreach { button =>
      button.setDisable(true)
      button.setOpacity(0) // Set button opacity to 0
    }
  }


}

