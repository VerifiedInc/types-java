# Unum ID Java Types

## Compile
`mvn clean install`
Will create a fat jar and (for now) will publish to one's local maven repo, `~/.m2`.

## Protobufs
Protocol Buffer definitions from the protobuf [repo](https://github.com/UnumID/protobufs) are in `src/main/protobufs` and are setup build to `target/generated-sources` via `maven install`. References: [1](https://medium.com/@knoldus/compile-protocol-buffers-using-maven-d6f1795a3257), [2](https://developers.google.com/protocol-buffers/docs/reference/java-generated), [3](https://developers.google.com/protocol-buffers/docs/javatutorial)

## TODOs
a) setup artifact creation setup so that transitive dependencies can be realized through the pom, not a fat jar, ref: https://stackoverflow.com/questions/57903548/maven-distributing-maven-jar/57904069#57904069
b) publish to maven central, ref: http://tutorials.jenkov.com/maven/publish-to-central-maven-repository.html