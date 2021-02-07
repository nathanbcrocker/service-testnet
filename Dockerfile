FROM openjdk:11.0.10-jre
COPY build/libs/acme-testnet-*.jar acme-testnet.jar
ENTRYPOINT ["java", "-jar", "/acme-testnet.jar"]