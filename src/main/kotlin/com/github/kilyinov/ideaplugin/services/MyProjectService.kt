package com.github.kilyinov.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.kilyinov.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
