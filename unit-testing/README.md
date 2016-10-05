#Unit Test Integration in Gradle

##My solution

I tested this code in 
Linux Mint

##Running instructions

To test all test cases in unit testing 
```
$ gradle test
```

If you use gradle test second time usually it does not run the test cases, for some caching reasons. To make sure all the test cases are run every time you want it to run, you should use this command:
```
gradle cleanTest test
```

If you want to run only a partucular test:
```
gradle test --tests '*TestLibs.testGetResponse'
```

##Misc

What ever you put in src/test/java folder gradle will recognize it as unit tests. If the path is different then you have to add it in sourcesets like this: 

http://stackoverflow.com/questions/21161845/gradle-custom-source-set-as-dependency-for-the-main-and-test-ones

http://stackoverflow.com/questions/11581419/how-do-i-add-a-new-sourceset-to-gradle

you can also put filters on test to run including/excluding tests in gradle like this:
http://stackoverflow.com/questions/22505533/how-to-run-a-one-test-class-only-on-gradle