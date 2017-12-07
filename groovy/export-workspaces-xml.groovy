import info.magnolia.repository.RepositoryManager
import info.magnolia.objectfactory.Components
import info.magnolia.importexport.DataTransporter

tmpFilesPath = '/Users/bandersen/Desktop/TEST/'

workspaces = Components.getSingleton(RepositoryManager.class).getWorkspaceNames()
workspaces.each { workspace ->
    hm = ctx.getHierarchyManager(workspace)
    workspaceRoot = hm.getContent('/')
    xmlFileOutput = new FileOutputStream(tmpFilesPath + workspace + '.xml')
        println 'Backing up workspace [' + workspace + '] to ' + tmpFilesPath + workspace + '.xml ...'
        DataTransporter.executeExport(xmlFileOutput, false, false, hm.getWorkspace().getSession(), workspaceRoot.getHandle(), workspace, DataTransporter.XML)
    xmlFileOutput.close()
}
