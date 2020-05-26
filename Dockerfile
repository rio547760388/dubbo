FROM java:8
WORKDIR /usr/local
COPY ./provider/build/libs/provider-1.0.0.jar ./consumer/build/libs/consumer-1.0.0.jar /usr/local/
VOLUME /tmp
EXPOSE 8888
CMD java -jar ./provider-1.0.0.jar && java -jar ./consumer-1.0.0.jar
