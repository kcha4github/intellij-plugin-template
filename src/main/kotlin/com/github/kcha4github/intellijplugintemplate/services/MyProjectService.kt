package com.github.kcha4github.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.kcha4github.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
