FROM adoptopenjdk:11-jdk-openj9
COPY build/libs/gradle-springboot-sample-app-0.0.1-SNAPSHOT.jar /opt/app.jar
EXPOSE 8080
CMD java -jar /opt/app.jar