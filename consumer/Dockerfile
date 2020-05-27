FROM java:8
WORKDIR /usr/local
COPY ./build/libs/consumer-1.0.0.jar Dockerfile ./
VOLUME /tmp
EXPOSE 8888
CMD java -jar ./consumer-1.0.0.jar
