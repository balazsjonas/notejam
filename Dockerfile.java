FROM openjdk:8

COPY spring/target/spring-0.0.1-SNAPSHOT.jar /usr/src/demo/spring-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar","/usr/src/demo/spring-0.0.1-SNAPSHOT.jar"]

 

