FROM openjdk:11.0.14.1-jre
ADD ./target/product-api-exec.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/product-api-exec.jar"]

EXPOSE 8080