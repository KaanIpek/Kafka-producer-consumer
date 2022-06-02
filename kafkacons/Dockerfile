FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY build/libs/kafkacons.jar kafkacons.jar
ENTRYPOINT ["java","-jar","kafkacons.jar"]