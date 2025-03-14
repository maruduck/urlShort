# build stage

FROM amazoncorretto:17-alpine-jdk as build

WORKDIR /app

COPY . .

RUN ./gradlew clean bootJar


# Run stage
FROM amazoncorretto:17-alpine-jdk

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
