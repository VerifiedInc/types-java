# Unum ID Java Types

## Compile

`mvn clean install`
Will create a fat jar and (for now) will publish to one's local maven repo, `~/.m2`.

## Protobufs

Protocol Buffer definitions from the protobuf [repo](https://github.com/UnumID/protobufs) are in `src/main/protobufs`
and are setup build to `target/generated-sources` via `maven install`.
References: [1](https://medium.com/@knoldus/compile-protocol-buffers-using-maven-d6f1795a3257)
, [2](https://developers.google.com/protocol-buffers/docs/reference/java-generated)
, [3](https://developers.google.com/protocol-buffers/docs/javatutorial)

## Maven Artifact Publishing

### Github Maven Packages

Releases and publishing of Maven artifacts is automated via Github Actions CI job. In order to trigger a release that
publish to Github's Maven repo one should push a git tag with a preceding `v` with semver notation, ie `v1.1.1`, to
the `main` branch. This will trigger the CI job publish the artifact with version specified, bump the version to the
next patch SNAPSHOT version, make a release commit, and make a Github Release. The message of the git tag will be the
release message so please make it meaningful. For
example, `git tag v1.1.1 -m "Updated the SDK with a new CI job" && push origin v1.1.1`.

Note: one can manually deploy an artifact to Github Maven repo via `mvn clean deploy -P ossrh`, if they have the proper
Github access tokens via in m2 settings.xml, but it is not advised.

### Maven Central

This release process is not yet automated. However if one would like to trigger a the deployment and publishing of a new
version one needs to setup their local env to have proper access rights and a GPG key.

Information [here](https://central.sonatype.org/publish/requirements/gpg/) for how to create and pubish a GPG key for
signatures.

Information [here](https://www.youtube.com/watch?v=b5D2EBjLp40) for how to populate your local m2 settings with proper
access credentials. The credentials to https://s01.oss.sonatype.org/#welcome are in 1Password. The access token can be
found [here](https://s01.oss.sonatype.org/#profile;User%20Token). For examnple the key name that works on my machine
is `A40CC86120560B5631B693172DE7B3CB0F11DB7F` and in order to specify it I use the `-Dgpg.keyname=` environment
variable.

If using Java version 16 one might need to use [this](https://issues.sonatype.org/browse/NEXUS-27902) work around:

To publish to maven central use the following command with your local key name/identifier.

```
mvn clean deploy -P ossrh -Dgpg.keyname=A40CC86120560B5631B693172DE7B3CB0F11DB7F
```

If not using Java 16 this work around is necessary [[1]](https://issues.sonatype.org/browse/NEXUS-27902).

```
export JDK_JAVA_OPTIONS='--illegal-access=warn
mvn clean deploy -P ossrh -Dgpg.keyname=A40CC86120560B5631B693172DE7B3CB0F11DB7F
```

