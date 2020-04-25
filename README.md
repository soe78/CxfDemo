# CxfDemo

Hi Martin, 
this is a very basic CXF Spring Boot Demo App, like we have dozens
in our Team (assurance company - SOAP still alive here ;)
Many of those Services were migrated to boot from different SOAP Frameworks, and to keep the URL the same, 
the cxf.path is different in almost every application.properties

On the beans view, I see a cxfServletRegistration Bean created by cxf which is a ServletRegistrationBean

It would be really cool to see the ${cxf.path} on the RequestMapping list and in the path search 
in the properties view on a running instance, or generally plain old Servlets, created by ServletRegistrationBean 
or scanned by @ServletComponentScan - we do so for our podprobe for example.

cu,
Soeren
