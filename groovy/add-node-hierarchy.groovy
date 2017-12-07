// get workspace
workspace = ctx.getJCRSession("config")
// add a hierarchy
apps = NodeUtil.unwrap(workspace.getNode("/modules/tools/apps"))

myThing = NodeUtil.createPath(apps, "test3", "mgnl:contentNode", true)
subApps = NodeUtil.createPath(myThing, "subApps", "mgnl:contentNode", true)
main = NodeUtil.createPath(subApps, "main", "mgnl:contentNode", true)
permissions = NodeUtil.createPath(myThing, "permissions", "mgnl:contentNode", true)
roles = NodeUtil.createPath(permissions, "roles", "mgnl:contentNode", true)

// add some properties 
appClass = myThing.setProperty("appClass", "info.magnolia.ui.framework.app.BaseApp")
name = myThing.setProperty("name", "test3")
closable = main.setProperty("closable", "false")
subAppClass = main.setProperty("subAppClass", "info.magnolia.tools.app.ToolsSubApp")
permissionsRoles = roles.setProperty("superuser","superuser")

// commit
workspace.save()
