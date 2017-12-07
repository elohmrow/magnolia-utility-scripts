import info.magnolia.jcr.predicate.NodeTypePredicate;

session = ctx.getJCRSession('website')

pages = NodeUtil.collectAllChildren(session.getRootNode(), new NodeTypePredicate("mgnl:page"))
pages.each { page ->
    node = NodeUtil.unwrap(page)
    template = node.getProperty("mgnl:template").getValue().getString()
   // println template

    newt = template.replace("old-template-name", "new-template-name")
    node.setProperty("mgnl:template", newt)

   // printlin newt
}

session.save()
