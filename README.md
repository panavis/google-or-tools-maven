# Google OR-Tools for Java

Creating a Maven dependency for Google OR-Tools 

Official Google Project: https://github.com/google/or-tools

Inspired by: https://github.com/oliviercailloux/google-or-tools-java

Generated the project using `cmake`  

https://github.com/google/or-tools/blob/stable/cmake/doc/java.md

```
cmake -S. -Bbuild -DBUILD_JAVA=ON .
cmake --build .
cmake --build . --target java_package
```
**Note**: Execute those commands in the root directory of the repository.  
Otherwise, replace '.' with the actual source directory.

Java classes and JNI libraries will be generated in `or-tools/java`  

From the `ortools-linux-x86-64`, grab the jar file.  
Add to the `ortools-java` project as a local dependency.

**Note**: To create a jar for the whole project,  
make sure you're running with `jar-with-dependencies`

### Publishing To Maven Repository

Mostly followed: https://dzone.com/articles/publish-your-artifacts-to-maven-central  
But also used ideas from: https://github.com/oliviercailloux/google-or-tools-java/blob/master/pom.xml