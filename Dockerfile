FROM openjdk:8-jrecopy target/springboot_test-1.0-SNAPSHOT.jar  /springboot_test-1.0-SNAPSHOT.jarentrypoint ["java","-jar","/springboot_test-1.0-SNAPSHOT.jar"]