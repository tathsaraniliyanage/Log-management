#use openjdk base image (google krla hoygnn oni)
FROM openjdk:17-jdk-slim

#add application (add unu jar ekata namak denn ona)
#(1)
ADD target/hello.jar app.jar
#(2)
#WORKDIR /app
#COPY target/hello.jar/app/app.jar

#expose the port that the app with run on
#(application eke port ekama denn methnta)
EXPOSE 8085

ENTRYPOINT ["java", "-jar", "app.jar"]