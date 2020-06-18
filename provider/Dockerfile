FROM openjdk:8u171-jdk-alpine
WORKDIR /usr/local
COPY ./build/libs/provider-1.0.0.jar Dockerfile ./
VOLUME /tmp
EXPOSE 2333
ENTRYPOINT ["java"]
CMD ["-Duser.timezone=GMT+08", "-jar", "provider-1.0.0.jar"]