FROM openjdk:8
EXPOSE 8787
ADD target/Docker-0.0.1-SNAPSHOT.jar /
ENTRYPOINT ["java","-jar","/Docker-0.0.1-SNAPSHOT.jar"]
