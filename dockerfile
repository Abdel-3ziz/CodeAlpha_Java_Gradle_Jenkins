FROM jenkins/jenkins:lts

USER root
RUN apt-get update && apt-get install -y wget unzip

RUN wget https://services.gradle.org/distributions/gradle-8.7-bin.zip \
    && unzip gradle-8.7-bin.zip -d /opt \
    && ln -s /opt/gradle-8.7/bin/gradle /usr/bin/gradle