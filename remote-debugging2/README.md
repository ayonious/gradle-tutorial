#Remote Debugging in Gradle 2

This example is an extension to the last projects "remote-debugging1" and "unit-testing". Here Im going to discuss how you can debug unit tests in gradle

##gradle file (Add this part in gradle to make it possible)
```
tasks.withType(Test) {
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

Now set breakpoints using eclipse. In this case you have to set the break points in your unit test functions.
![Image of brekpoint]
(https://github.com/ayonious/gradle-tutorial/blob/master/remote-debugging1/screenshot_breakpoint2.png)

###Step3:

Now from eclipse right click on your project>debug as>debug configuration>Remote java application
set these fields:

	1. project
	2. host (here its localhost)
	3. port (in this example it will be 9099)

Click "debug"

![Image of remote_debug_config]
(https://github.com/ayonious/gradle-tutorial/blob/master/remote-debugging2/screenshot_remote_debug_config.png)

Enjoy debugging....