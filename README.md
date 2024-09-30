# Projet de Démonstration JDBC (Java Database Connectivity)

Ce projet démontre l'utilisation de JDBC pour interagir avec une base de données MySQL, en se concentrant sur l'insertion et la récupération de données via des requêtes SQL en Java.

## Structure du Projet

- **Package : `beans`**
  - `Site.java` : Représente la structure de la table 'site' dans la base de données.

- **Package : `service`**
  - `Connexion.java` : Gère la connexion à la base de données.
  - `DevDataService.java` : Gère la création de tables et l'insertion de données.
  - `ExoJDBC.java` : Contient des méthodes pour l'analyse et la récupération de données.

- **Classe principale :**
  - `Test.java` : Point d'entrée de l'application, démontrant diverses opérations JDBC.

## Configuration et Installation

1. Assurez-vous d'avoir MySQL installé et en cours d'exécution.
2. Créez une base de données nommée 'demo'.
3. Mettez à jour les détails de connexion à la base de données dans `Connexion.java` si nécessaire.
4. Ajoutez le pilote JDBC MySQL au classpath de votre projet.

## Fonctionnalités

1. **Connexion à la Base de Données** : Établir et gérer les connexions à la base de données MySQL.
2. **Création de Table** : Créer une table 'DevData' pour stocker les informations sur les scripts des développeurs.
3. **Insertion de Données** : Insérer des données d'exemple dans la table 'DevData'.
4. **Récupération et Analyse de Données** :
   - Trouver le développeur ayant le nombre maximum de scripts en une journée.
   - Lister les développeurs triés par leur nombre total de scripts en ordre décroissant.
   - Calculer le nombre total de scripts créés en une semaine.
   - Calculer le nombre total de scripts pour chaque développeur.

## Comment Exécuter

1. Compilez tous les fichiers Java.
2. Exécutez la classe `Test` pour effectuer toutes les opérations.

## Exemples de Code

### Établir une Connexion
```java
// Voir Connexion.java pour les détails d'implémentation
Connection conn = Connexion.getCn();
