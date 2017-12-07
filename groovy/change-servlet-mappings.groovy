session = ctx.getJCRSession('config')
servlets = NodeUtil.collectAllChildren(session.getNode("/server/filters/servlets"))

servlets.each {
	properties = it.getProperties()

	properties.each {
		if (it.getType() == 1) {
			name = it.getName()
			value = PropertyUtil.getValueString(it)

			if (value.startsWith("/.")) {
				newValue = value.replaceFirst("/.", "/")
				println "I am changing the value of " + name + " from " + value + " to " + newValue

				// and then later when you're sure:
				// servlet.setProperty(name, newValue)
			}
		}
	}
}
