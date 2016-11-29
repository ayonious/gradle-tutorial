#Gradle Wrapper


##Reasons to use gradle wrapper:

1. You dont need gradle installed in your computer if you have gradle wrapper present in the project
2. You can mention the version of the gradle to be used inside the gradle wrapper configuration file. This way everyone will run the same version of gradle
3. Leged says it makes gradle builds fast


## Gradle wrapper project structure

The project structure difference between a gradle-project without gradle wrapper and a gradle-project with gradle wrapper is
(this is structure of this project)
```
.
├── README.md
├── bin
│   └─── XXX
├── build.gradle
└── src
    └── XXX
```

```
.
├── README.md
├── bin
│   └── XXX
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
└── src
    └── XXXX
```

## How To add gradle wrapper in a simple gradle-project without gradle wrapper
```
1. Make sure you have gradle installed in the system
2. $ gradle wrapper --gradle-version X.X
```

Now you will see these extra files/folders for gradle-wrapper
```
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
└── gradlew.bat
```

After acreating gradle-wrapper you can run any gradle instruction from your project like this:
```
./gradlew <gradle_task>
```

Instead of
```
gradle <gradle_task>
```

## Running gradle tasks without installing gradle in your computer

Suppose you cloned a project that already have gradle wrapper but your computer dont have gradle installed. In that case you dont need to install it in your system at all but can run all gradle tasks like this
```
./gradlew <gradle_task>
```


## Change gradle version to be used in gradle wrapper

So you are using gradle wrapper and its running gradle tasks with a praticular version of gradle. Now you want to use a different version of gradle to run the peoject each time you `./gradlew <task>`. 
```
1. Change the version number is file "gradle-wrapper.properties"
2. First time you run "./gradlew build" will download that particular version of gradle and then
```


NOTE: Because of having gradle wrapper. Gradle is installed locally inside the project. So there is a .jar file inside the gradle folder and the project gets a little bigger.