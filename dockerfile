FROM gradle:8.5-jdk17

WORKDIR /app

COPY . .

RUN gradle build


CMD ["gradle", "run"]
