FROM openjdk:8u171-jdk-alpine
WORKDIR /usr/local
COPY ./build/libs/consumer-1.0.0.jar Dockerfile ./
VOLUME /tmp
EXPOSE 8888
ENTRYPOINT ["java"]
CMD ["-Duser.timezone=GMT+08", "-jar", "consumer-1.0.0.jar"]
