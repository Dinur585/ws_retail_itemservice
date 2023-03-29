FROM openjdk:8-jdk-alpine
MAINTAINER Team
COPY target/ws_retail_itemservice-1.0-SNAPSHOT.jar ws-retail-itemservice.jar
ENTRYPOINT ["java","-jar","ws-retail-itemservice.jar"]
#EXPOSE 8009