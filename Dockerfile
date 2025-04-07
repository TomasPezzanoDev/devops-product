FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/api-productos.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
