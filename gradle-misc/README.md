# This contains all the amazing things you can do with gradle command

gradle build without running some tasks:
```
gradle build -x test
```

you can skip other tasks similar ways:
```
gradle build -x test -x distZip -x distTar
```

use profile flag to make a report on which task takes how much time in completing gradle build
```
gradle build --profile
```
This will generate a *.html  file in build/ folder which you can see to check which tasks are taking how long time
