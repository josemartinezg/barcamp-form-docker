#FROM openjdk:11-jdk-slim
#ENV NOMBRE_APP = 'barcamp-from-docker'
#ENV spring.datasource.url='jdbc:mysql://192.168.77.10:3306/barcamp'
#ENV spring.datasource.username='root'
#ENV spring.datasource.password='12345678'
#VOLUME /tmp
#EXPOSE 8080
#COPY build/libs/barcamp-form-docker-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java", "-jar", "app.jar"]

#Dockerfile para HAProxy
FROM haproxy:1.8.8
COPY haproxy.cfg etc/haproxy/haproxy.cfg