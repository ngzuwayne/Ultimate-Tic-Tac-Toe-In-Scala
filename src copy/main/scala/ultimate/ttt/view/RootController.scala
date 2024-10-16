package ultimate.ttt.view

import scalafxml.core.macros.sfxml
import ultimate.ttt.MainApp

@sfxml
class RootController {

  def handleIntroductions(): Unit = {
    MainApp.showIntroductions()
  }

  def handleInstructions(): Unit = {
    MainApp.showInstructions()
  }

  def handleGames(): Unit = {
    MainApp.showBoards()
  }



}
