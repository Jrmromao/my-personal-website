FROM openjdk:8
EXPOSE 8080
ADD target/personal-website.jar personal-website.jar
ENTRYPOINT ["java", "-jar", "/personal-website.jar"]