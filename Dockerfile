FROM gradle:8.3.0-jdk17 AS builder
WORKDIR /app
COPY . .
RUN mkdir -p /home/gradle/.gradle && chmod -R 777 /home/gradle/.gradle
RUN gradle build -x test --no-daemon

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
