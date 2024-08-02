# Use an official Java runtime as a parent image
FROM openjdk:17

# Set the working directory in the container
EXPOSE 8088

# Copy the packaged jar file into the container
ADD target/demo.jar demo.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "demo.jar"]