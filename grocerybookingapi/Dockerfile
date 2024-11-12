# Use the official OpenJDK image from Docker Hub as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file from the target directory to the container
COPY target/grocery-booking-api.jar grocery-booking-api.jar

# Expose the port your application will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "grocery-booking-api.jar"]
