FROM eclipse-temurin:17-jdk-focal
EXPOSE 9001
ADD target/springboot-docker-jenkin-0.0.1-SNAPSHOT.jar springboot-docker-jenkin-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springboot-docker-jenkin-0.0.1-SNAPSHOT.jar"]