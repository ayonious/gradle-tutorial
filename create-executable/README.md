#Creating a executable file from java

NOTE: this project is using gradle>=3.0 (otherwise use gradle installApp instead of installDist)

installDist task helps to create such an instance
```
gradle installDist
./build/install/<project_name>/bin/<project_name> <parameters>
```

example:
```
gradle installDist
./build/install/create-executable/bin/create-executable add 10 12
```



#Creating you own command line tool that can be run anywhere like this
```
<command> <params>
```

Try this from the __project folder__: 
```
sudo ln -sf $PWD/build/install/<proj_name>/bin/<proj_name> /usr/local/bin/<name_of_the_command_you_want>
```


Example:
```
sudo ln -sf $PWD/build/install/create-executable/bin/create-executable /usr/local/bin/math_helper_nk
#now it might ask for password
```
Then you can run this command directly from anywhere:
```
math_helper_nk add 12 23
```