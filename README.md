# 🚀 TP3 - Maîtrise des Tests Unitaires & d'Intégration (AQL)

Bienvenue dans ce projet dédié à l'apprentissage des tests en Java ! L'objectif ici est de comprendre comment construire des applications robustes en utilisant l'**Injection de Dépendances** et le **Mocking**.

## 🎯 Ce que nous avons appris
Ce TP se concentre sur trois piliers du développement moderne :
*   **JUnit 5** : Pour structurer nos tests et valider nos résultats.
*   **Mockito** : Pour simuler le monde extérieur (bases de données, API) et tester nos classes en isolation totale.
*   **Injection de Dépendances** : Pour rendre notre code plus flexible et facile à tester.

---

## 📂 Organisation du Projet
Nous avons choisi une structure claire pour séparer le code partagé des exercices spécifiques :

```text
.
├── tpaql_shared/         # Modèles partagés (User, Order, Product)
├── tp3_part1/
│   ├── src/              # Votre code source par exercice
│   │   ├── ex1/ (UserService)
│   │   ├── ex2/ (OrderController chain)
│   │   └── ex3/ (Product API integration)
│   └── test/             # Vos tests JUnit 5 correspondants
└── pom.xml               # Configuration Maven (JUnit 5 + Mockito)
```

---

## 🛠️ Les Exercices en détail

### 1️⃣ Interaction Simple (Ex 1)
Nous testons `UserService` en isolant son `UserRepository`. 
*   *Concept* : Mocking de base et injection simple.

### 2️⃣ Cascade de Dépendances (Ex 2)
On vérifie la communication entre `Controller` → `Service` → `DAO`.
*   *Concept* : Vérification des interactions dans une architecture à plusieurs couches.

### 3️⃣ Simulation d'API Externe (Ex 3)
On simule un client API externe (`ProductApiClient`) pour tester différents scénarios (succès, erreur de format, panne réseau).
*   *Concept* : Gestion des cas limites et robustesse.

---

## 🚀 Comment lancer les tests ?

Rien de plus simple ! Ouvrez votre terminal et tapez :

```bash
mvn test
```

---
*Réalisé dans le cadre du cours d'Architecture Logique (AQL).*
