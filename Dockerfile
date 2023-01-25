FROM openjdk:11

EXPOSE 8082

COPY ./target/Lab2-EMT-193060-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "Lab2-EMT-193060-0.0.1-SNAPSHOT.jar"]
