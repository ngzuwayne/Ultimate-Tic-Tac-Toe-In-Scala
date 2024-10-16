package ultimate.ttt.view

import scalafx.event.ActionEvent
import scalafx.stage.Stage
import scalafxml.core.macros.sfxml
import ultimate.ttt.MainApp

@sfxml
class ReplayDialogController {

  var dialogStage: Stage = null

  def handleYes(action :ActionEvent){

    MainApp.showBoards()
    dialogStage.close()

  }

  def handleCancel(action :ActionEvent) {

    dialogStage.close()

  }

}
