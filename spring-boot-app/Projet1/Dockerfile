# 1️⃣ Use Java 21 JDK as the base image
FROM eclipse-temurin:21-jdk-alpine

# 2️⃣ Set working directory inside container
WORKDIR /app

# 3️⃣ Copy the Spring Boot JAR file into the container
COPY target/Projet1-0.0.1-SNAPSHOT.jar app.jar

# 4️⃣ Expose port 8080 so the host can access it
EXPOSE 8080

# 5️⃣ Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
