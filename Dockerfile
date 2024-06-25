FROM bellsoft/liberica-openjdk-alpine:21.0.3

WORKDIR /usr/share/app

COPY target/*.jar centralhub.jar

CMD ["java","-jar", "centralhub.jar"]