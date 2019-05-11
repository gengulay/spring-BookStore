FROM java:8
VOLUME /tmp
EXPOSE 8086
ADD /target/bookstore.jar bookstore.jar
ENTRYPOINT ["java","-jar","bookstore.jar"]
