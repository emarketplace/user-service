FROM openjdk:11
WORKDIR /userservice
ADD ./target/user-service-0.0.1-SNAPSHOT.jar /userservice/user-service-0.0.1-SNAPSHOT.jar
CMD java -jar userservice-0.0.1-SNAPSHOT.jar