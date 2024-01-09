# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Install Tesseract OCR
RUN apt-get update && apt-get install -y tesseract-ocr

# Set the environment variable TESSDATA_PREFIX
ENV TESSDATA_PREFIX /usr/share/tesseract-ocr/4.00/tessdata

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container
COPY ./target/OCRService.jar /app/OCRService.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8090

# Specify the command to run on container start
ENTRYPOINT ["java", "-jar", "OCRService.jar"]
