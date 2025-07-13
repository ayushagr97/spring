FROM openjdk:17
EXPOSE 8082
ADD target/dockerdemo.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","/dockerdemo.jar"]
