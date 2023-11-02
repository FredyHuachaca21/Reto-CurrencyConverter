FROM amazoncorretto:17.0.4

WORKDIR /app

COPY ./target/CurrencyConverterAPI-0.0.1-SNAPSHOT.jar /app

EXPOSE 8585

ENTRYPOINT ["java", "-jar", "CurrencyConverterAPI-0.0.1-SNAPSHOT.jar"]