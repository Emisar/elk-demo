FROM openjdk:17-oracle
WORKDIR /app
COPY ["/target/elk-demo-0.0.1.jar", "app.jar"]
CMD ["java", "-jar", "app.jar"]
EXPOSE 8080
