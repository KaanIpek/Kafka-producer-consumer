FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY build/libs/kafkaprod.jar kafkaprod.jar
ENTRYPOINT ["java","-jar","kafkaprod.jar"]