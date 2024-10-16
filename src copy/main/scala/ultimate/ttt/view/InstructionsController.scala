package ultimate.ttt.view

import scalafxml.core.macros.sfxml
import ultimate.ttt.MainApp

@sfxml
class InstructionsController {

  def handleBack(): Unit = {
    MainApp.showIntroductions()
  }

}
