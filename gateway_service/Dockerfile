FROM openjdk:17-alpine

WORKDIR /app

COPY target/gateway_service-0.0.1-SNAPSHOT.jar /app/gateway-service.jar

EXPOSE 8888

CMD ["java", "-jar", "/app/gateway-service.jar"]