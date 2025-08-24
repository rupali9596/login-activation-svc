FROM openjdk:21
COPY target/*.jar /login-activation-svc.jar
ENTRYPOINT [ "java", "-jar", "login-activation-svc.jar" ]
