FROM eclipse-temurin:25-jdk
ARG JAR_FILE=docker/glf-communities.jar
ARG JAVA_AGENT_FILE=docker/opentelemetry-javaagent-2.12.0.jar

# Install curl
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

COPY ${JAR_FILE} app.jar
COPY ${JAVA_AGENT_FILE} /workspace/BOOT-INF/lib/opentelemetry-javaagent-2.12.0.jar
ENTRYPOINT ["java","-jar","/app.jar"]