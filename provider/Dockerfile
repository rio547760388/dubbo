FROM java:8
WORKDIR /usr/local
COPY ./build/libs/provider-1.0.0.jar Dockerfile ./
VOLUME /tmp
EXPOSE 2333
CMD export TZ='Asia/Shanghai' && java -jar ./provider-1.0.0.jar >>/tmp/provider.log 2>&1