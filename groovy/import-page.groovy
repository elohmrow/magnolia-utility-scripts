import info.magnolia.importexport.DataTransporter
import javax.jcr.ImportUUIDBehavior

hm = ctx.getHierarchyManager('website')
root = hm.getContent('/')
    
xmlFile = new File('/Users/bandersen/Downloads/website.hello.xml')
    
DataTransporter.importFile(xmlFile, 'website', root.getHandle(), false,
ImportUUIDBehavior.IMPORT_UUID_CREATE_NEW, true, true)
