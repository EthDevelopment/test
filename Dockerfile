FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Gradle build files
COPY build.gradle gradlew ./
COPY gradle ./gradle

# Copy the source code from the correct path
COPY api_creation/src ./src

# Build the application
RUN ./gradlew bootJar

# Copy the JAR file to the container
COPY build/libs/api_creation-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]