FROM openjdk:11
EXPOSE 8085
COPY /target/Lab2-EMT-193060-0.0.1-SNAPSHOT.jar labapp.jar
CMD ["java","-jar","labapp.jar"]
