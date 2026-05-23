FROM maven:3.9.6-eclipse-temurin-21 as build
WORKDIR /app
COPY pom.xml .
copy src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

ARG AWS_ACCESS_KEY_ID
ARG AWS_SECRET_ACCESS_KEY

ENV AWS_REGION=us-esat-1
ENV AWS_BUCKET_NAME=jupitters-qrcode-storage

ENTRYPOINT ["java", "-jar", "app.jar"]