# 🚀 TP3 - Maîtrise des Tests Unitaires & d'Intégration (AQL)

## 📂 Organisation du Projet
Le projet est organisé comme suit pour séparer le code métier des tests :

```text
.
├── tpaql_shared/         # Modèles partagés (User, Order, Product)
├── tp3_part1/
│   ├── src/              # Code source par exercice
│   │   ├── ex1/ (UserService)
│   │   ├── ex2/ (OrderController chain)
│   │   └── ex3/ (Product API integration)
│   └── test/             # Tests JUnit 5 correspondants
└── pom.xml               # Configuration Maven
```

---

## 🛠️ Les Exercices

### 1️⃣ Interaction Simple (Ex 1)
Test de `UserService` avec isolation du `UserRepository`.

### 2️⃣ Cascade de Dépendances (Ex 2)
Vérification de la communication : `Controller` → `Service` → `DAO`.

### 3️⃣ Simulation d'API Externe (Ex 3)
Simulation du client `ProductApiClient` pour tester les différents scénarios de réponse API.

---

## 🚀 Comment lancer les tests ?

```bash
mvn test
```

---

## 📝 Réponses aux Questions

1.  **Tests d'intégration** : Ils servent à s'assurer que les composants d'un système communiquent correctement entre eux (ex: Controller -> Service -> DAO). Ils couvrent les failles que les tests unitaires isolés ne peuvent pas détecter.
2.  **Rôle de JUnit 5** : Fournit le framework de base pour structurer les tests, exécuter les suites de tests et valider les comportements via des assertions (`assertEquals`, `assertThrows`, etc.).
3.  **Utilité du Mocking (Mockito)** : Permet d'isoler une classe en remplaçant ses dépendances réelles (base de données, API externe) par des objets simulés. Cela rend les tests plus rapides, déterministes et indépendants de l'environnement extérieur.
