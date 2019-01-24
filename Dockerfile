FROM openjdk:10-jre
ADD ./target/product-api-exec.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/product-api-exec.jar"]

EXPOSE 8080