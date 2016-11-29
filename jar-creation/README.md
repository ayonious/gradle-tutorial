#Jar Creation Using Gradle

I tested this code in 
Linux Mint

##Gradle file addition

add this in gradle.build file to see the fat jar created
```
jar {
    manifest {
        attributes 'Main-Class': 'prog.First'
    } 
    doFirst {
        from { configurations.runtime.collect { it.isDirectory() ? it : zipTree(it) } }
    }
}
```

##Running instructions

### step1: build fatjar from source code
install java: (incase you have already installed java you can skip this)
```
sudo apt-get install python-software-properties
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer

java -version
javac -version
sudo update-alternatives --config java
```

install gradle:
```
sudo apt-get install gradle
``` 

now build the fatjar
```
gradle clean build
```

The fatjar will be ready in build/libs/ folder

###step2: (run the fatjar)
```
cd build/libs
java -jar jar-creation.jar add 2 3
java -jar jar-creation.jar sub 2 3
java -jar jar-creation.jar subs 2
```