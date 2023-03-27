FROM openjdk:8-jdk-alpine
COPY target/ws-retail-itemservice.jar ws-retail-itemservice.jar
CMD ["java","-jar","ws-retail-itemservice.jar"]