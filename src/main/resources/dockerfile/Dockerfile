FROM openjdk:11
WORKDIR /app
ADD ./hello-app.jar /app/hello-app.jar
EXPOSE 8080
ENTRYPOINT java ${JAVA_POTS} -jar /app/hello-app.jar