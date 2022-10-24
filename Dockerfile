FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-aws-codedeploy.jar spring-boot-aws-codedeploy.jar
ENTRYPOINT ["java","-jar","/spring-boot-aws-codedeploy.jar"]