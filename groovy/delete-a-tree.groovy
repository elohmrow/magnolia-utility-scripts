hm = ctx.getHierarchyManager('website')
pages = hm.getContent('/').getChildren('mgnl:page')

pages.each { page ->
    println page
    page.delete()
}

hm.save()
