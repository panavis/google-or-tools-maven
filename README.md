# Google OR-Tools for Java

Creating a Maven dependency for Google OR-Tools 

Official Google Project: https://github.com/google/or-tools


## Usage

Add both dependencies to your project:  
```
<dependency>
   <groupId>com.panavis.open-source</groupId>
   <artifactId>google-ortools-java</artifactId>
   <version>7.8.7961</version>
</dependency>

<dependency>
   <groupId>com.panavis.open-source</groupId>
   <artifactId>ortools-linux-x86-64</artifactId>
   <version>7.8.7959</version>
</dependency>
```

## How To Reproduce this Project

Inspired by: https://github.com/oliviercailloux/google-or-tools-java

Generated the project using `cmake`  

https://github.com/google/or-tools/blob/stable/cmake/doc/java.md

```sh
cmake -S. -Bbuild -DBUILD_JAVA=ON
cmake --build build
cmake --build build --target java_package
```
**Note**: Execute those commands in the root directory of the repository.  
Otherwise, replace '.' with the actual source directory.

Java classes and JNI libraries will be generated in `or-tools/java`  

From the `ortools-linux-x86-64`, grab the jar file.  
Add to the `ortools-java` project as a local dependency.

## Publishing To Maven Repository

Mostly followed: https://dzone.com/articles/publish-your-artifacts-to-maven-central  
But also used ideas from: https://github.com/oliviercailloux/google-or-tools-java/blob/master/pom.xml
