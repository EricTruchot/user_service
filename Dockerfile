# Utilisez une image Maven pour construire l'application
FROM maven:3.8.3-openjdk-17 AS build

# Copiez les fichiers de l'application dans l'image
COPY ./ /app
WORKDIR /app

# Build de l'application
RUN mvn clean install -DskipTests

# Utilisez une image de base avec Java
FROM eclipse-temurin:17-jdk-alpine

# Copiez le fichier WAR de l'application construite dans l'image
COPY --from=build /app/target/user_service-0.0.1-SNAPSHOT.war /app.war

# Commande pour exécuter l'application
CMD ["java", "-jar", "/app.war"]