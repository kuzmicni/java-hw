# Java HelloWorld simple project for getting started

Java is a statically typed language which means variables types must be declared prior to compilation. This is different from dynamically typed where variables are evaluated at runtime. 

Note: making a variable 'private' ensures only accessible inside the Java class itself. 'public' accessible from other Classes in other packages.

**Get Started**

**1. Install Java Open JDK 8** on your local machine. 
For Mac: https://www.oracle.com/ca-en/java/technologies/javase/javase8-archive-downloads.html

<img width="1066" alt="Java SE Development Kit 8u202, jdk-8u202-macosx-x64.dmg" src="https://user-images.githubusercontent.com/26292532/181937137-69557e84-fe97-47e3-9dcd-fc3407e11d21.png">

Once installed, make sure the .jdk file is found under
```
/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk 
```

2. Set **JAVA_HOME** in **.zprofile** file

```
export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home"
export PATH=$PATH:$JAVA_HOME/bin
```

3. Check that **java is setup** properly by running in terminal:

```
java -version
```

4. Install IntelliJ 


5. Create new Maven Project (Import your open jdk1.8.0_202.jdk as 'Project SDK' when creating project for the first time)

5a. Double check SDK was picked up by IntelliJ

<img width="417" alt="File_ProjectStructure" src="https://user-images.githubusercontent.com/26292532/181937740-fbce2302-25ad-4350-91e9-16e6b74db331.png">

<img width="803" alt="SDKEdit" src="https://user-images.githubusercontent.com/26292532/181937760-9650b929-5284-4b60-8c2f-e0d8013f092d.png">

**Compile using Maven & Run the jar locally**

Consider

i) Mark directory as source (right click on Java, and navigate to Mark as source dir)

ii) Might need to click Build prior to compiling using Maven

Steps
1) Compile jar using Maven
```
mvn package
```

2) Test class (TIP: copy jar path from /target folder by 'Shift+Cmd+C')
```
java -cp path/to/jar HelloWorld.HelloWorld
```
