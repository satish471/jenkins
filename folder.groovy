import util.Helperfolder_name = 'dsl pipeline'view_name = 'pipeline'display_name = 'jenkins pipeline'folder(Helper.fullyQualifiedName(folder_name)) {  displayName(display_name)  primaryView(view_name)  listView(view_name) {    filterBuildQueue()    filterExecutors()    jobs {      regex(".*")    }    columns {      status()      weather()      name()      lastSuccess()      lastFailure()      lastDuration()      configureProject()      buildButton()      lastBuildConsole()    }  }}