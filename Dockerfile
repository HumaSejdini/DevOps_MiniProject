FROM openjdk:11
WORKDIR /usr/src/app
EXPOSE 8082
COPY target/Lab2-EMT-193060-0.0.1-SNAPSHOT.jar lab.jar
CMD ["java","-jar","lab.jar"]
