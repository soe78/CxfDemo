# CxfDemo

Hi Martin, this is a basic CXF Spring Boot Demo, like we have dozens
in our Team (assurance Company - SOAP still alive here ;)
Many of those Services were migrated to boot from different SOAP Frameworks, and to keep the URL the same, 
the cxf.path is different in almost every application.properties

It would be really cool to see the ${cxf.path} on the RequestMapping list and in the path search 
in the properties view on a running instance.

On the beans view, I see a cxfServletRegistration Bean created by cxf which is a ServletRegistrationBean

