#Remote Debugging in Gradle

This example explains how to debug using gradle. Gradle will let your ide to set break points. And using your ide you can debug the code. This example describes the process using eclipse.


##gradle file (Add this part in gradle to make it possible)
```
tasks.withType(JavaExec) {
    if (System.getProperty('DEBUG', 'false') == 'true') {
        jvmArgs '-Xdebug', '-Xrunjdwp:transport=debug_socket,server=y,suspend=y,address=9099'
    }
}
```

To know what's happening with the arguments read this about the arguments that you need to send to jvm to make remote debugging possible:
```
https://www.eclipse.org/jetty/documentation/9.3.x/enable-remote-debugging.html
```

##Running instructions

###Step1:

```
gradle -DDEBUG=true run
```
Now in console you will see something like this:
```
Listening for transport debug_socket at address: 9099
```

###Step2:

Now set breakpoints using eclipse.

###Step3:

Now from eclipse right click on your project>debug as>debug configuration>Remote java application
set these fields:

	1. project
	2. host (here its localhost)
	3. port (in this example it will be 9099)

Click "debug"


Enjoy debugging....