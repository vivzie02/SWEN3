# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the maven executable to the image's bin directory
COPY mvnw .
COPY .mvn .mvn

# Copy the pom.xml file
COPY pom.xml .

# Copy the project files
COPY src src

# Build the application
RUN chmod +x mvnw && ./mvnw package -DskipTests

# Run the jar file
ENTRYPOINT ["java", "-jar", "target/OCRService.jar"]
