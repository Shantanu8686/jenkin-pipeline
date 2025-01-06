FROM openjdk:19
EXPOSE 8080
ADD target/jenkin-pipeline.jar jenkin-pipeline.jar
ENTRYPOINT ["java","-jar","jenkin-pipeline.jar"]