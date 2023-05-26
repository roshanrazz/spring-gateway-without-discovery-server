FROM openjdk:17

EXPOSE 8080

ADD ./target/*.jar spring-gateway-service.jar

ENTRYPOINT [ "java","-jar","spring-gateway-service.jar"]
