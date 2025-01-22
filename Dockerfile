# Usa uma imagem base com o JDK para compilar e executar Java
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho no container
WORKDIR /app

# Copia o arquivo específico ListNumbers.java para o diretório de trabalho
COPY src/ListNumbers.java .

# Compila o arquivo Java
RUN javac ListNumbers.java

# Configura o comando padrão para executar o programa
CMD ["java", "ListNumbers"]
