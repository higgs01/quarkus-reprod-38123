# quarkus-reprod-38123
This is a reproduction-project for https://github.com/quarkusio/quarkus/issues/38123

## Steps to reproduce the issue
1. Run `ExampleTest`
2. Error 500 is thrown (although it shouldn't)
3. Change switch from the reactive REST-Client to the non-reactive one:
    ```xml
        <!-- switch those two -->
        <!-- this doesn't work -->
    <!--    <dependency>-->
    <!--      <groupId>io.quarkus</groupId>-->
    <!--      <artifactId>quarkus-rest-client-reactive-jackson</artifactId>-->
    <!--    </dependency>-->
        <!-- this works -->
        <dependency>
          <groupId>io.quarkus</groupId>
          <artifactId>quarkus-rest-client-jackson</artifactId>
        </dependency>
        <!-- -->
    ```
4. Run the test again
5. No error is thrown (as it should be)
