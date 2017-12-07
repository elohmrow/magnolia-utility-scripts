import info.magnolia.importexport.DataTransporter

hm = ctx.getHierarchyManager('website')
aboutRoot = hm.getContent('/hello')
xmlFileOutput = new FileOutputStream('/Users/bandersen/Desktop/website.hello.xml')

DataTransporter.executeExport(xmlFileOutput, false, false,
  hm.getWorkspace().getSession(), aboutRoot.getHandle(), 'website',
  DataTransporter.XML)
 xmlFileOutput.close()
