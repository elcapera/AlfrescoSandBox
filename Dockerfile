Dockerfile# Use an official Java runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the local JAR file to the container
COPY target/myapp.jar /app/myapp.jar

# Set the command to run the application
CMD ["java", "-jar", "myapp.jar"]
