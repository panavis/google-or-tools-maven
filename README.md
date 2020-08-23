# Google OR-Tools for Java

Creating a Maven dependency for Google OR-Tools 

Inspired by: https://github.com/oliviercailloux/google-or-tools-java

Following instructions from the URL above didn't exactly work for Version 7.8.

On Ubuntu 18.04, the following dependencies were needed:

`automake` (`sudo apt-get install automake`)  
`pck-config` (`sudo apt-get install pkg-config`)  
`swig` (`sudo apt-get install swig`)

In addition to those three dependencies, the generated Java classes were missing three classes.

`IntIntToLongFunction.java`  
`LongTernaryOperator.java`  
`LongTernaryPredicate.java`

Added the classes to the repo from the official OR-Tools Java Reference (https://google.github.io/or-tools/java/namespaces.html)

In addition, `protobuf-java` was updated to a later version (some classes were missing from the older version)

### Publishing To Maven Repository

Mostly followed: https://dzone.com/articles/publish-your-artifacts-to-maven-central  
But also used ideas from: https://github.com/oliviercailloux/google-or-tools-java/blob/master/pom.xml