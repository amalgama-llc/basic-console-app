# Amalgama Console Application

This project is a minimum console application that uses the Amalgama Platform engine.


## System requirements

### JDK-17+

Make sure that JDK-17+, Maven 3.8.1+ are installed on your computer.
To do this, open a terminal and run the command.

```sh
java -version
```

If you see something like this in the terminal:

```sh
openjdk version "17.0.2" 2022-01-18
OpenJDK Runtime Environment (build 17.0.2+8-86)
OpenJDK 64-Bit Server VM (build 17.0.2+8-86, mixed mode, sharing)
```

This means that you have the appropriate Java version installed.
Otherwise, download JDK-17+ from one of the following links 

[Oracle download section](https://www.oracle.com/java/technologies/downloads/) 

[OpenJDK download section](https://jdk.java.net/archive/)


Install the JDK using the following instructions

[How to install JDK](https://docs.oracle.com/en/java/javase/17/install/overview-jdk-installation.html)


### Maven 3.8.1+

Run the following terminal command.

```sh
mvn -version
```

If you see something like this printed out to the terminal:

```sh
Apache Maven 3.8.6 (84538c9988a25aec085021c365c560670ad80f63)
Maven home: C:\Program Files\Apache\apache-maven-3.8.6
Java version: 17.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-17.0.2
Default locale: ru_RU, platform encoding: Cp1251
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```

...then you have the right version of Maven installed.

Otherwise:
- Download Maven from this link: [Download Maven](https://maven.apache.org/download.cgi)
- Install Maven using the following instructions: [How to install Maven](https://maven.apache.org/install.html)



## Open the project in the IDE

You can import the project in your favorite IDE.
This section contains instructions for IntelliJ IDEA and Eclipse.

If you'd like to work with console only, please proceed to the next section.

### IntelliJ IDEA

If you have [IntelliJ IDEA](https://www.jetbrains.com/idea/download/), 
start the IDE, then select File -> Open.

In the next window specify the folder where the project is located and select pom.xml file.

### Eclipse

If you are using 
[Eclipse IDE](https://www.eclipse.org/downloads/):
- Select File -> Import. 
- In the next window, find and choose the 'Maven' -> 'Existing Maven Projects' item and click 'Next'.
- In the next window, click 'Browse' and specify the project's folder.
- Click Finish.

If there is no 'Maven' -> 'Existing Maven Projects' item, then your Eclipse installation is probably missing a plugin to support Maven projects.

To fix that:
- Select Help -> Eclipse Marketplace.
- Find 'Eclipse m2e - Maven support in Eclipse IDE Latest', click 'Install'.
- In the 'Confirm selected features' window, choose to install only the 'M2E - Maven Integration for Eclipse' feature (marked as 'required'). 
- Confirm Eclipse restart.

After restarting, your Eclipse is ready to import Maven projects.





## Build and run the application from the console

Open the terminal. 
Go to the root folder of the application. 
Build the application using this command:

```sh
mvn clean package
```

Maven will create a "target" folder and put the created application there.

Launch the application using the command:

```sh
java -jar target/amalgama-console-application-1.0.jar
```

The program should start and print this to the standard output:

```sh
engine time is 5.0
```

Congratulations! You have just built and run your first Amalgama console application.

See the [Amalgama Platform tutorials](https://platform.amalgamasimulation.com/amalgama/Tutorials/tutorials_overview.html) to find out how to develop
a fully-functional simulation model.