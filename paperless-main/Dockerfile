FROM amazoncorretto:17-alpine-jdk
WORKDIR /app

# Create a dummy file to invalidate the cache
RUN echo 'version 1' > version.txt

# Install Maven (if not already installed)
RUN apk --no-cache add maven

# Copy source code
COPY . /app

# Build the application --> skip tests for now
RUN mvn package -DskipTests

EXPOSE 8088
ENTRYPOINT ["java", "-jar", "target/openapi-spring-1.0.jar"]
