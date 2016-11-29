#Create your own maven artifacts in maven local


This actually contains 2 gradle projects
1. create-executable
2. run-maven-local-jars

`create-executable` is for creating the jar in the mavenlocal and `run-maven-local-jars` is for running it


##Running instructions:

1. Create the artifact in the local artifactory
```
cd create-executable
gradle clean install
```


2. Now run the artifact:
```
cd run-maven-local-jars
gradle clean build
```


