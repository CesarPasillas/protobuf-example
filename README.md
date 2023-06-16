# protobuf-example
This project is to understand how to use the Protocol buffer aka. protobuf with gRPC.

In this project, we don't go deeper into gRPC, but is a basic example and configuration of protobuf, you can use it to understand how to protobuf works.


## Requirements
1. **Java 11** The best, we use Java 11, but it also works with Java 8 and you can download it from [here!](https://www.oracle.com/java/technologies/downloads/#java11). I recomend to use openJDK.
2. **IntelliJ** This project needs to have installed IntelliJ, you can download the community edition [here!](https://www.jetbrains.com/idea/download/), you need to download the Community Edition and follow the [Standalone installation instructions](https://www.jetbrains.com/help/idea/installation-guide.html).
3. **Gradle** Use the one that is on your IntelliJ.

##Instalation
Clone the project into your local environment and open from IntelliJ.

##Characteristics
This projects generetes the classes for the **person.proto** (This file is located under the main/proto directory, this is the standard and reviewing the documentation is the expected place, so is better not to move).
```shell
- src
  |- main
     |- java
     |- proto
        |- person.proto
     |- resources
  |- test
     |- java
     |- resources
```

##  Proto-Generated Classes
This example uses the next proto class:
```proto
package com.programingsquirrel;

message Person {
    required string name = 1;
    optional int64 age = 2;
}
```
When we generate the proto class using the task-> other -> generateProto of the gradle plugin **protobuf**, for this project the class PersonOuterClass.java is created in teh next directory.
```shell
-src
-build
  |-generated
    |-source
      |-proto
        |-main
          |-java
            |-com
              |-programingsquirrel
                |-PersonOuterClass.java
```

## Contributors
Cesar "Aran" Pasillas

## Contact
If you have some comments or improvments you can reach me through: 
1. email cesar.epasillas@gmail.com
2. LinkedIn ![](https://content.linkedin.com/content/dam/me/business/en-us/amp/brand-site/v2/bg/LI-Bug.svg.original.svg) [cesar-pasillas](https://www.linkedin.com/in/cesar-pasillas/)
3. My page [Programming Squirrel](https://programmingsquirrel.wordpress.com/)
   ![](https://programmingsquirrel.files.wordpress.com/2023/05/cropped-logo_ardilla_programmer_yellow.png?w=84&h=80)

## License
This project uses a MIT license that can be read in [LICENSE](/LICENSE)
