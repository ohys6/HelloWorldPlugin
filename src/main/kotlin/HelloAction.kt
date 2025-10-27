package com.example.helloworldplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloAction : AnAction("Say Hello") {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showMessageDialog(
            e.project,
            "Hello, world from ohys6!",
            "HelloWorldPlugin",
            Messages.getInformationIcon()
        )
    }
}
