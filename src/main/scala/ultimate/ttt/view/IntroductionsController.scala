package ultimate.ttt.view

import scalafxml.core.macros.sfxml
import ultimate.ttt.MainApp

@sfxml
class IntroductionsController {

  def handleInstructions(): Unit = {
    MainApp.showInstructions()
  }

  def handleBegin(): Unit = {
    MainApp.showBoards()
  }

}
