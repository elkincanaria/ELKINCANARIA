FROM adoptopenjdk/openjdk11-openj9:alpine-slim
VOLUME /tmp
COPY *.jar elkincanaria-java-adv.jar
RUN sh -c 'touch /elkincanaria-java-adv.jar'
ENV JAVA_OPTS=" -Xshareclasses:name=cacheapp,cacheDir=/cache,nonfatal -XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS  -jar elkincanaria-java-adv.jar" ]
