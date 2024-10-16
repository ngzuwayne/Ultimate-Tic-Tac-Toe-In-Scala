package ultimate.ttt.view

import javafx.scene.control.Button
import scalafx.event.ActionEvent
import scalafx.scene.control.Label
import scalafx.scene.image.ImageView
import scalafx.scene.layout.GridPane
import scalafxml.core.macros.sfxml
import scalafx.scene.media.AudioClip
import ultimate.ttt.MainApp
import ultimate.ttt.model.Board

import scala.collection.mutable.ListBuffer

@sfxml
class UltimateBoardController(
         private var board1Cell1: Button, private var board1Cell2: Button, private var board1Cell3: Button,
         private var board1Cell4: Button, private var board1Cell5: Button, private var board1Cell6: Button,
         private var board1Cell7: Button, private var board1Cell8: Button, private var board1Cell9: Button,
         private var board1ResultImageView: ImageView, private var board1GridPane: GridPane,

         private var board2Cell1: Button, private var board2Cell2: Button, private var board2Cell3: Button,
         private var board2Cell4: Button, private var board2Cell5: Button, private var board2Cell6: Button,
         private var board2Cell7: Button, private var board2Cell8: Button, private var board2Cell9: Button,
         private var board2ResultImageView: ImageView, private var board2GridPane: GridPane,

         private var board3Cell1: Button, private var board3Cell2: Button, private var board3Cell3: Button,
         private var board3Cell4: Button, private var board3Cell5: Button, private var board3Cell6: Button,
         private var board3Cell7: Button, private var board3Cell8: Button, private var board3Cell9: Button,
         private var board3ResultImageView: ImageView, private var board3GridPane: GridPane,

         private var board4Cell1: Button, private var board4Cell2: Button, private var board4Cell3: Button,
         private var board4Cell4: Button, private var board4Cell5: Button, private var board4Cell6: Button,
         private var board4Cell7: Button, private var board4Cell8: Button, private var board4Cell9: Button,
         private var board4ResultImageView: ImageView, private var board4GridPane: GridPane,

         private var board5Cell1: Button, private var board5Cell2: Button, private var board5Cell3: Button,
         private var board5Cell4: Button, private var board5Cell5: Button, private var board5Cell6: Button,
         private var board5Cell7: Button, private var board5Cell8: Button, private var board5Cell9: Button,
         private var board5ResultImageView: ImageView, private var board5GridPane: GridPane,

         private var board6Cell1: Button, private var board6Cell2: Button, private var board6Cell3: Button,
         private var board6Cell4: Button, private var board6Cell5: Button, private var board6Cell6: Button,
         private var board6Cell7: Button, private var board6Cell8: Button, private var board6Cell9: Button,
         private var board6ResultImageView: ImageView, private var board6GridPane: GridPane,

         private var board7Cell1: Button, private var board7Cell2: Button, private var board7Cell3: Button,
         private var board7Cell4: Button, private var board7Cell5: Button, private var board7Cell6: Button,
         private var board7Cell7: Button, private var board7Cell8: Button, private var board7Cell9: Button,
         private var board7ResultImageView: ImageView, private var board7GridPane: GridPane,

         private var board8Cell1: Button, private var board8Cell2: Button, private var board8Cell3: Button,
         private var board8Cell4: Button, private var board8Cell5: Button, private var board8Cell6: Button,
         private var board8Cell7: Button, private var board8Cell8: Button, private var board8Cell9: Button,
         private var board8ResultImageView: ImageView, private var board8GridPane: GridPane,

         private var board9Cell1: Button, private var board9Cell2: Button, private var board9Cell3: Button,
         private var board9Cell4: Button, private var board9Cell5: Button, private var board9Cell6: Button,
         private var board9Cell7: Button, private var board9Cell8: Button, private var board9Cell9: Button,
         private var board9ResultImageView: ImageView, private var board9GridPane: GridPane,

         private var largeBoardResultLabel: Label,
         private var printPlayerLabel: Label
                               ) {

  val winSound = new AudioClip(getClass.getResource("/audio/win.mp3").toString)
  val drawSound = new AudioClip(getClass.getResource("/audio/draw.mp3").toString)

  // Shared player state
  private var currentPlayer: String = "X"

  // Method to get the current player
  private def getCurrentPlayer: String = currentPlayer

  // Method to switch the current player
  private def switchPlayer(): Unit = {
    currentPlayer = if (currentPlayer == "X") "O" else "X"
  }

  def printPlayer(): Unit = {
    printPlayerLabel.setText(currentPlayer)
  }

  // Create independent Board instances
  private val boardOne = new Board(
    cells = List(board1Cell1, board1Cell2, board1Cell3, board1Cell4, board1Cell5, board1Cell6, board1Cell7, board1Cell8, board1Cell9),
    resultImageView = board1ResultImageView,
    gridPane = board1GridPane,
    currentPlayer = () => getCurrentPlayer,
    switchPlayer = () => switchPlayer()
  )

  private val boardTwo = new Board(
    cells = List(board2Cell1, board2Cell2, board2Cell3, board2Cell4, board2Cell5, board2Cell6, board2Cell7, board2Cell8, board2Cell9),
    resultImageView = board2ResultImageView,
    gridPane = board2GridPane,
    currentPlayer = () => getCurrentPlayer,
    switchPlayer = () => switchPlayer()
  )

  private val boardThree = new Board(
    cells = List(board3Cell1, board3Cell2, board3Cell3, board3Cell4, board3Cell5, board3Cell6, board3Cell7, board3Cell8, board3Cell9),
    resultImageView = board3ResultImageView,
    gridPane = board3GridPane,
    currentPlayer = () => getCurrentPlayer,
    switchPlayer = () => switchPlayer()
  )

  private val boardFour = new Board(
    cells = List(board4Cell1, board4Cell2, board4Cell3, board4Cell4, board4Cell5, board4Cell6, board4Cell7, board4Cell8, board4Cell9),
    resultImageView = board4ResultImageView,
    gridPane = board4GridPane,
    currentPlayer = () => getCurrentPlayer,
    switchPlayer = () => switchPlayer()
  )

  private val boardFive = new Board(
    cells = List(board5Cell1, board5Cell2, board5Cell3, board5Cell4, board5Cell5, board5Cell6, board5Cell7, board5Cell8, board5Cell9),
    resultImageView = board5ResultImageView,
    gridPane = board5GridPane,
    currentPlayer = () => getCurrentPlayer,
    switchPlayer = () => switchPlayer()
  )

  private val boardSix = new Board(
    cells = List(board6Cell1, board6Cell2, board6Cell3, board6Cell4, board6Cell5, board6Cell6, board6Cell7, board6Cell8, board6Cell9),
    resultImageView = board6ResultImageView,
    gridPane = board6GridPane,
    currentPlayer = () => getCurrentPlayer,
    switchPlayer = () => switchPlayer()
  )

  private val boardSeven = new Board(
    cells = List(board7Cell1, board7Cell2, board7Cell3, board7Cell4, board7Cell5, board7Cell6, board7Cell7, board7Cell8, board7Cell9),
    resultImageView = board7ResultImageView,
    gridPane = board7GridPane,
    currentPlayer = () => getCurrentPlayer,
    switchPlayer = () => switchPlayer()
  )

  private val boardEight = new Board(
    cells = List(board8Cell1, board8Cell2, board8Cell3, board8Cell4, board8Cell5, board8Cell6, board8Cell7, board8Cell8, board8Cell9),
    resultImageView = board8ResultImageView,
    gridPane = board8GridPane,
    currentPlayer = () => getCurrentPlayer,
    switchPlayer = () => switchPlayer()
  )

  private val boardNine = new Board(
    cells = List(board9Cell1, board9Cell2, board9Cell3, board9Cell4, board9Cell5, board9Cell6, board9Cell7, board9Cell8, board9Cell9),
    resultImageView = board9ResultImageView,
    gridPane = board9GridPane,
    currentPlayer = () => getCurrentPlayer,
    switchPlayer = () => switchPlayer()
  )

  // List of all board controllers
  private val boards = List(
    boardOne,
    boardTwo,
    boardThree,
    boardFour,
    boardFive,
    boardSix,
    boardSeven,
    boardEight,
    boardNine
  )

  private def checkLargeBoard(): Unit = {
    // List to track the results of each board
    val boardResults = boards.map(_.getBoardResult())

    // Check if there's a win on the large board
    val winningCombinations = List(
      // Rows
      List(0, 1, 2),
      List(3, 4, 5),
      List(6, 7, 8),
      // Columns
      List(0, 3, 6),
      List(1, 4, 7),
      List(2, 5, 8),
      // Diagonals
      List(0, 4, 8),
      List(2, 4, 6)
    )

    val winner = winningCombinations.collectFirst {
      case combo if combo.map(boardResults).forall {
        case Some("X") => true
        case _ => false
      } => "X"
      case combo if combo.map(boardResults).forall {
        case Some("O") => true
        case _ => false
      } => "O"
    }

    winner match {
      case Some("X") =>
        largeBoardResultLabel.setText("X is the winner!")
        winSound.play()
        disableAllBoards()
      case Some("O") =>
        largeBoardResultLabel.setText("O is the winner!")
        winSound.play()
        disableAllBoards()
      case None =>
        if (boardResults.forall(_.isDefined)) {
          disableAllBoards()
        }
    }
  }

  // Method to disable all boards
  private def disableAllBoards(): Unit = {
    boards.foreach(_.disableAllButtons())
  }

  var clickedButtons: ListBuffer[Button] = ListBuffer.empty

  // Delegate button click handling to the appropriate controller
  def handleBoard1ButtonClick(event: ActionEvent): Unit = {
    val clickedButton = boardOne.handleButtonClick(event)
    printPlayer()
    clickedButtons ++= clickedButton
    handleUltimateLogic()
    handleDraw()
    checkLargeBoard()
  }
  def handleBoard2ButtonClick(event: ActionEvent): Unit = {
    val clickedButton = boardTwo.handleButtonClick(event)
    printPlayer()
    clickedButtons ++= clickedButton
    handleUltimateLogic()
    handleDraw()
    checkLargeBoard()
  }
  def handleBoard3ButtonClick(event: ActionEvent): Unit = {
    val clickedButton = boardThree.handleButtonClick(event)
    printPlayer()
    clickedButtons ++= clickedButton
    handleUltimateLogic()
    handleDraw()
    checkLargeBoard()
  }
  def handleBoard4ButtonClick(event: ActionEvent): Unit = {
    val clickedButton = boardFour.handleButtonClick(event)
    printPlayer()
    clickedButtons ++= clickedButton
    handleUltimateLogic()
    handleDraw()
    checkLargeBoard()
  }
  def handleBoard5ButtonClick(event: ActionEvent): Unit = {
    val clickedButton = boardFive.handleButtonClick(event)
    printPlayer()
    clickedButtons ++= clickedButton
    handleUltimateLogic()
    handleDraw()
    checkLargeBoard()
  }
  def handleBoard6ButtonClick(event: ActionEvent): Unit = {
    val clickedButton = boardSix.handleButtonClick(event)
    printPlayer()
    clickedButtons ++= clickedButton
    handleUltimateLogic()
    handleDraw()
    checkLargeBoard()
  }
  def handleBoard7ButtonClick(event: ActionEvent): Unit = {
    val clickedButton = boardSeven.handleButtonClick(event)
    printPlayer()
    clickedButtons ++= clickedButton
    handleUltimateLogic()
    handleDraw()
    checkLargeBoard()
  }
  def handleBoard8ButtonClick(event: ActionEvent): Unit = {
    val clickedButton = boardEight.handleButtonClick(event)
    printPlayer()
    clickedButtons ++= clickedButton
    handleUltimateLogic()
    handleDraw()
    checkLargeBoard()
  }
  def handleBoard9ButtonClick(event: ActionEvent): Unit = {
    val clickedButton = boardNine.handleButtonClick(event)
    printPlayer()
    clickedButtons ++= clickedButton
    handleUltimateLogic()
    handleDraw()
    checkLargeBoard()
  }

  def handleUltimateLogic(): Unit = {

    clickedButtons.lastOption match {
      case Some(latestButton) =>

        val triggerCells1 = Set("board1Cell1", "board2Cell1", "board3Cell1", "board4Cell1", "board5Cell1", "board6Cell1", "board7Cell1", "board8Cell1", "board9Cell1")
        val triggerCells2 = Set("board1Cell2", "board2Cell2", "board3Cell2", "board4Cell2", "board5Cell2", "board6Cell2", "board7Cell2", "board8Cell2", "board9Cell2")
        val triggerCells3 = Set("board1Cell3", "board2Cell3", "board3Cell3", "board4Cell3", "board5Cell3", "board6Cell3", "board7Cell3", "board8Cell3", "board9Cell3")
        val triggerCells4 = Set("board1Cell4", "board2Cell4", "board3Cell4", "board4Cell4", "board5Cell4", "board6Cell4", "board7Cell4", "board8Cell4", "board9Cell4")
        val triggerCells5 = Set("board1Cell5", "board2Cell5", "board3Cell5", "board4Cell5", "board5Cell5", "board6Cell5", "board7Cell5", "board8Cell5", "board9Cell5")
        val triggerCells6 = Set("board1Cell6", "board2Cell6", "board3Cell6", "board4Cell6", "board5Cell6", "board6Cell6", "board7Cell6", "board8Cell6", "board9Cell6")
        val triggerCells7 = Set("board1Cell7", "board2Cell7", "board3Cell7", "board4Cell7", "board5Cell7", "board6Cell7", "board7Cell7", "board8Cell7", "board9Cell7")
        val triggerCells8 = Set("board1Cell8", "board2Cell8", "board3Cell8", "board4Cell8", "board5Cell8", "board6Cell8", "board7Cell8", "board8Cell8", "board9Cell8")
        val triggerCells9 = Set("board1Cell9", "board2Cell9", "board3Cell9", "board4Cell9", "board5Cell9", "board6Cell9", "board7Cell9", "board8Cell9", "board9Cell9")

        if (triggerCells1.contains(latestButton.getId)) {

          val boardOneButtons = List(
            board1Cell1, board1Cell2, board1Cell3, board1Cell4, board1Cell5, board1Cell6, board1Cell7, board1Cell8, board1Cell9
          )

          boardOneButtons.foreach(_.setDisable(false))

          val notBoardOneButtons = List(
            board2Cell1, board2Cell2, board2Cell3, board2Cell4, board2Cell5, board2Cell6, board2Cell7, board2Cell8, board2Cell9,
            board3Cell1, board3Cell2, board3Cell3, board3Cell4, board3Cell5, board3Cell6, board3Cell7, board3Cell8, board3Cell9,
            board4Cell1, board4Cell2, board4Cell3, board4Cell4, board4Cell5, board4Cell6, board4Cell7, board4Cell8, board4Cell9,
            board5Cell1, board5Cell2, board5Cell3, board5Cell4, board5Cell5, board5Cell6, board5Cell7, board5Cell8, board5Cell9,
            board6Cell1, board6Cell2, board6Cell3, board6Cell4, board6Cell5, board6Cell6, board6Cell7, board6Cell8, board6Cell9,
            board7Cell1, board7Cell2, board7Cell3, board7Cell4, board7Cell5, board7Cell6, board7Cell7, board7Cell8, board7Cell9,
            board8Cell1, board8Cell2, board8Cell3, board8Cell4, board8Cell5, board8Cell6, board8Cell7, board8Cell8, board8Cell9,
            board9Cell1, board9Cell2, board9Cell3, board9Cell4, board9Cell5, board9Cell6, board9Cell7, board9Cell8, board9Cell9
          )

          notBoardOneButtons.foreach(_.setDisable(true))

          if (board1ResultImageView.image() != null) {

            notBoardOneButtons.foreach(_.setDisable(false))

          }

        }
        if (triggerCells2.contains(latestButton.getId)) {

          val boardTwoButtons = List(
            board2Cell1, board2Cell2, board2Cell3, board2Cell4, board2Cell5, board2Cell6, board2Cell7, board2Cell8, board2Cell9
          )

          boardTwoButtons.foreach(_.setDisable(false))

          val notBoardTwoButtons = List(
            board1Cell1, board1Cell2, board1Cell3, board1Cell4, board1Cell5, board1Cell6, board1Cell7, board1Cell8, board1Cell9,
            board3Cell1, board3Cell2, board3Cell3, board3Cell4, board3Cell5, board3Cell6, board3Cell7, board3Cell8, board3Cell9,
            board4Cell1, board4Cell2, board4Cell3, board4Cell4, board4Cell5, board4Cell6, board4Cell7, board4Cell8, board4Cell9,
            board5Cell1, board5Cell2, board5Cell3, board5Cell4, board5Cell5, board5Cell6, board5Cell7, board5Cell8, board5Cell9,
            board6Cell1, board6Cell2, board6Cell3, board6Cell4, board6Cell5, board6Cell6, board6Cell7, board6Cell8, board6Cell9,
            board7Cell1, board7Cell2, board7Cell3, board7Cell4, board7Cell5, board7Cell6, board7Cell7, board7Cell8, board7Cell9,
            board8Cell1, board8Cell2, board8Cell3, board8Cell4, board8Cell5, board8Cell6, board8Cell7, board8Cell8, board8Cell9,
            board9Cell1, board9Cell2, board9Cell3, board9Cell4, board9Cell5, board9Cell6, board9Cell7, board9Cell8, board9Cell9
          )

          notBoardTwoButtons.foreach(_.setDisable(true))

          if (board2ResultImageView.image() != null) {

            notBoardTwoButtons.foreach(_.setDisable(false))

          }
        }
        if (triggerCells3.contains(latestButton.getId)) {

          val boardThreeButtons = List(
            board3Cell1, board3Cell2, board3Cell3, board3Cell4, board3Cell5, board3Cell6, board3Cell7, board3Cell8, board3Cell9
          )

          boardThreeButtons.foreach(_.setDisable(false))

          val notBoardThreeButtons = List(
            board1Cell1, board1Cell2, board1Cell3, board1Cell4, board1Cell5, board1Cell6, board1Cell7, board1Cell8, board1Cell9,
            board2Cell1, board2Cell2, board2Cell3, board2Cell4, board2Cell5, board2Cell6, board2Cell7, board2Cell8, board2Cell9,
            board4Cell1, board4Cell2, board4Cell3, board4Cell4, board4Cell5, board4Cell6, board4Cell7, board4Cell8, board4Cell9,
            board5Cell1, board5Cell2, board5Cell3, board5Cell4, board5Cell5, board5Cell6, board5Cell7, board5Cell8, board5Cell9,
            board6Cell1, board6Cell2, board6Cell3, board6Cell4, board6Cell5, board6Cell6, board6Cell7, board6Cell8, board6Cell9,
            board7Cell1, board7Cell2, board7Cell3, board7Cell4, board7Cell5, board7Cell6, board7Cell7, board7Cell8, board7Cell9,
            board8Cell1, board8Cell2, board8Cell3, board8Cell4, board8Cell5, board8Cell6, board8Cell7, board8Cell8, board8Cell9,
            board9Cell1, board9Cell2, board9Cell3, board9Cell4, board9Cell5, board9Cell6, board9Cell7, board9Cell8, board9Cell9
          )

          notBoardThreeButtons.foreach(_.setDisable(true))

          if (board3ResultImageView.image() != null) {

            notBoardThreeButtons.foreach(_.setDisable(false))

          }
        }
        if (triggerCells4.contains(latestButton.getId)) {

          val boardFourButtons = List(
            board4Cell1, board4Cell2, board4Cell3, board4Cell4, board4Cell5, board4Cell6, board4Cell7, board4Cell8, board4Cell9
          )

          boardFourButtons.foreach(_.setDisable(false))

          val notBoardFourButtons = List(
            board1Cell1, board1Cell2, board1Cell3, board1Cell4, board1Cell5, board1Cell6, board1Cell7, board1Cell8, board1Cell9,
            board2Cell1, board2Cell2, board2Cell3, board2Cell4, board2Cell5, board2Cell6, board2Cell7, board2Cell8, board2Cell9,
            board3Cell1, board3Cell2, board3Cell3, board3Cell4, board3Cell5, board3Cell6, board3Cell7, board3Cell8, board3Cell9,
            board5Cell1, board5Cell2, board5Cell3, board5Cell4, board5Cell5, board5Cell6, board5Cell7, board5Cell8, board5Cell9,
            board6Cell1, board6Cell2, board6Cell3, board6Cell4, board6Cell5, board6Cell6, board6Cell7, board6Cell8, board6Cell9,
            board7Cell1, board7Cell2, board7Cell3, board7Cell4, board7Cell5, board7Cell6, board7Cell7, board7Cell8, board7Cell9,
            board8Cell1, board8Cell2, board8Cell3, board8Cell4, board8Cell5, board8Cell6, board8Cell7, board8Cell8, board8Cell9,
            board9Cell1, board9Cell2, board9Cell3, board9Cell4, board9Cell5, board9Cell6, board9Cell7, board9Cell8, board9Cell9
          )

          notBoardFourButtons.foreach(_.setDisable(true))

          if (board4ResultImageView.image() != null) {

            notBoardFourButtons.foreach(_.setDisable(false))

          }
        }
        if (triggerCells5.contains(latestButton.getId)) {

          val boardFiveButtons = List(
            board5Cell1, board5Cell2, board5Cell3, board5Cell4, board5Cell5, board5Cell6, board5Cell7, board5Cell8, board5Cell9
          )

          boardFiveButtons.foreach(_.setDisable(false))

          val notBoardFiveButtons = List(
            board1Cell1, board1Cell2, board1Cell3, board1Cell4, board1Cell5, board1Cell6, board1Cell7, board1Cell8, board1Cell9,
            board2Cell1, board2Cell2, board2Cell3, board2Cell4, board2Cell5, board2Cell6, board2Cell7, board2Cell8, board2Cell9,
            board3Cell1, board3Cell2, board3Cell3, board3Cell4, board3Cell5, board3Cell6, board3Cell7, board3Cell8, board3Cell9,
            board4Cell1, board4Cell2, board4Cell3, board4Cell4, board4Cell5, board4Cell6, board4Cell7, board4Cell8, board4Cell9,
            board6Cell1, board6Cell2, board6Cell3, board6Cell4, board6Cell5, board6Cell6, board6Cell7, board6Cell8, board6Cell9,
            board7Cell1, board7Cell2, board7Cell3, board7Cell4, board7Cell5, board7Cell6, board7Cell7, board7Cell8, board7Cell9,
            board8Cell1, board8Cell2, board8Cell3, board8Cell4, board8Cell5, board8Cell6, board8Cell7, board8Cell8, board8Cell9,
            board9Cell1, board9Cell2, board9Cell3, board9Cell4, board9Cell5, board9Cell6, board9Cell7, board9Cell8, board9Cell9
          )

          notBoardFiveButtons.foreach(_.setDisable(true))

          if (board5ResultImageView.image() != null) {

            notBoardFiveButtons.foreach(_.setDisable(false))

          }
        }
        if (triggerCells6.contains(latestButton.getId)) {

          val boardSixButtons = List(
            board6Cell1, board6Cell2, board6Cell3, board6Cell4, board6Cell5, board6Cell6, board6Cell7, board6Cell8, board6Cell9
          )

          boardSixButtons.foreach(_.setDisable(false))

          val notBoardSixButtons = List(
            board1Cell1, board1Cell2, board1Cell3, board1Cell4, board1Cell5, board1Cell6, board1Cell7, board1Cell8, board1Cell9,
            board2Cell1, board2Cell2, board2Cell3, board2Cell4, board2Cell5, board2Cell6, board2Cell7, board2Cell8, board2Cell9,
            board3Cell1, board3Cell2, board3Cell3, board3Cell4, board3Cell5, board3Cell6, board3Cell7, board3Cell8, board3Cell9,
            board4Cell1, board4Cell2, board4Cell3, board4Cell4, board4Cell5, board4Cell6, board4Cell7, board4Cell8, board4Cell9,
            board5Cell1, board5Cell2, board5Cell3, board5Cell4, board5Cell5, board5Cell6, board5Cell7, board5Cell8, board5Cell9,
            board7Cell1, board7Cell2, board7Cell3, board7Cell4, board7Cell5, board7Cell6, board7Cell7, board7Cell8, board7Cell9,
            board8Cell1, board8Cell2, board8Cell3, board8Cell4, board8Cell5, board8Cell6, board8Cell7, board8Cell8, board8Cell9,
            board9Cell1, board9Cell2, board9Cell3, board9Cell4, board9Cell5, board9Cell6, board9Cell7, board9Cell8, board9Cell9
          )

          notBoardSixButtons.foreach(_.setDisable(true))

          if (board6ResultImageView.image() != null) {

            notBoardSixButtons.foreach(_.setDisable(false))

          }
        }
        if (triggerCells7.contains(latestButton.getId)) {

          val boardSevenButtons = List(
            board7Cell1, board7Cell2, board7Cell3, board7Cell4, board7Cell5, board7Cell6, board7Cell7, board7Cell8, board7Cell9
          )

          boardSevenButtons.foreach(_.setDisable(false))

          val notBoardSevenButtons = List(
            board1Cell1, board1Cell2, board1Cell3, board1Cell4, board1Cell5, board1Cell6, board1Cell7, board1Cell8, board1Cell9,
            board2Cell1, board2Cell2, board2Cell3, board2Cell4, board2Cell5, board2Cell6, board2Cell7, board2Cell8, board2Cell9,
            board3Cell1, board3Cell2, board3Cell3, board3Cell4, board3Cell5, board3Cell6, board3Cell7, board3Cell8, board3Cell9,
            board4Cell1, board4Cell2, board4Cell3, board4Cell4, board4Cell5, board4Cell6, board4Cell7, board4Cell8, board4Cell9,
            board5Cell1, board5Cell2, board5Cell3, board5Cell4, board5Cell5, board5Cell6, board5Cell7, board5Cell8, board5Cell9,
            board6Cell1, board6Cell2, board6Cell3, board6Cell4, board6Cell5, board6Cell6, board6Cell7, board6Cell8, board6Cell9,
            board8Cell1, board8Cell2, board8Cell3, board8Cell4, board8Cell5, board8Cell6, board8Cell7, board8Cell8, board8Cell9,
            board9Cell1, board9Cell2, board9Cell3, board9Cell4, board9Cell5, board9Cell6, board9Cell7, board9Cell8, board9Cell9
          )

          notBoardSevenButtons.foreach(_.setDisable(true))

          if (board7ResultImageView.image() != null) {

            notBoardSevenButtons.foreach(_.setDisable(false))

          }
        }
        if (triggerCells8.contains(latestButton.getId)) {

          val boardEightButtons = List(
            board8Cell1, board8Cell2, board8Cell3, board8Cell4, board8Cell5, board8Cell6, board8Cell7, board8Cell8, board8Cell9
          )

          boardEightButtons.foreach(_.setDisable(false))

          val notBoardEightButtons = List(
            board1Cell1, board1Cell2, board1Cell3, board1Cell4, board1Cell5, board1Cell6, board1Cell7, board1Cell8, board1Cell9,
            board2Cell1, board2Cell2, board2Cell3, board2Cell4, board2Cell5, board2Cell6, board2Cell7, board2Cell8, board2Cell9,
            board3Cell1, board3Cell2, board3Cell3, board3Cell4, board3Cell5, board3Cell6, board3Cell7, board3Cell8, board3Cell9,
            board4Cell1, board4Cell2, board4Cell3, board4Cell4, board4Cell5, board4Cell6, board4Cell7, board4Cell8, board4Cell9,
            board5Cell1, board5Cell2, board5Cell3, board5Cell4, board5Cell5, board5Cell6, board5Cell7, board5Cell8, board5Cell9,
            board6Cell1, board6Cell2, board6Cell3, board6Cell4, board6Cell5, board6Cell6, board6Cell7, board6Cell8, board6Cell9,
            board7Cell1, board7Cell2, board7Cell3, board7Cell4, board7Cell5, board7Cell6, board7Cell7, board7Cell8, board7Cell9,
            board9Cell1, board9Cell2, board9Cell3, board9Cell4, board9Cell5, board9Cell6, board9Cell7, board9Cell8, board9Cell9
          )

          notBoardEightButtons.foreach(_.setDisable(true))

          if (board8ResultImageView.image() != null) {

            notBoardEightButtons.foreach(_.setDisable(false))

          }
        }
        if (triggerCells9.contains(latestButton.getId)) {

          val boardNineButtons = List(
            board9Cell1, board9Cell2, board9Cell3, board9Cell4, board9Cell5, board9Cell6, board9Cell7, board9Cell8, board9Cell9
          )

          boardNineButtons.foreach(_.setDisable(false))

          val notBoardNineButtons = List(
            board1Cell1, board1Cell2, board1Cell3, board1Cell4, board1Cell5, board1Cell6, board1Cell7, board1Cell8, board1Cell9,
            board2Cell1, board2Cell2, board2Cell3, board2Cell4, board2Cell5, board2Cell6, board2Cell7, board2Cell8, board2Cell9,
            board3Cell1, board3Cell2, board3Cell3, board3Cell4, board3Cell5, board3Cell6, board3Cell7, board3Cell8, board3Cell9,
            board4Cell1, board4Cell2, board4Cell3, board4Cell4, board4Cell5, board4Cell6, board4Cell7, board4Cell8, board4Cell9,
            board5Cell1, board5Cell2, board5Cell3, board5Cell4, board5Cell5, board5Cell6, board5Cell7, board5Cell8, board5Cell9,
            board6Cell1, board6Cell2, board6Cell3, board6Cell4, board6Cell5, board6Cell6, board6Cell7, board6Cell8, board6Cell9,
            board7Cell1, board7Cell2, board7Cell3, board7Cell4, board7Cell5, board7Cell6, board7Cell7, board7Cell8, board7Cell9,
            board8Cell1, board8Cell2, board8Cell3, board8Cell4, board8Cell5, board8Cell6, board8Cell7, board8Cell8, board8Cell9
          )

          notBoardNineButtons.foreach(_.setDisable(true))

          if (board9ResultImageView.image() != null) {

            notBoardNineButtons.foreach(_.setDisable(false))

          }
        }

      case None =>
        println("No buttons clicked yet")
    }

  }

  // handle draw
  def handleDraw(): Unit = {
    if (board1ResultImageView.image() != null &&
        board2ResultImageView.image() != null &&
        board3ResultImageView.image() != null &&
        board4ResultImageView.image() != null &&
        board5ResultImageView.image() != null &&
        board6ResultImageView.image() != null &&
        board7ResultImageView.image() != null &&
        board8ResultImageView.image() != null &&
        board9ResultImageView.image() != null) {

      largeBoardResultLabel.setText("It's a draw!")
      drawSound.play()

    }
  }

  def handleLeave(): Unit = MainApp.showLeaveMatchDialog()

  def handleGames(): Unit = MainApp.showReplayDialog()



}
