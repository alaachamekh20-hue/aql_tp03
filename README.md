# TP3 - Tests Unitaires et d'Intégration (AQL)

Ce projet contient les solutions pour le TP3 sur les tests unitaires et d'intégration en Java utilisant JUnit 5 et Mockito.

## Structure du Projet

- **Exercice 1 : Interaction Simple**
    - `User`, `UserRepository`, `UserService`
    - Test : `UserServiceTest` (Utilisation de Mockito pour simuler le repository).
- **Exercice 2 : Interaction avec Base de Données**
    - `Order`, `OrderDao`, `OrderService`, `OrderController`
    - Test : `OrderControllerTest` (Vérification des appels en cascade).
- **Exercice 3 : Intégration d'API avec Mocking**
    - `Product`, `ProductApiClient`, `ProductService`
    - Test : `ProductServiceTest` (Scénarios : Succès, Format incompatible, Échec API).

## Réponses aux Questions / Objectifs

1.  **Concepts des tests d'intégration** : Ils permettent de vérifier que les différents modules d'une application communiquent correctement entre eux (ex: Controller vers Service vers DAO).
2.  **Utilisation de JUnit 5** : Utilisé pour structurer les tests, définir les assertions (`assertEquals`, `assertThrows`) et gérer le cycle de vie des tests.
3.  **Mocking avec Mockito** : Permet d'isoler le composant testé en simulant ses dépendances. Cela évite d'avoir besoin d'une base de données réelle ou d'une API externe active pendant les tests.

## Comment exécuter les tests ?

Assurez-vous d'avoir Maven installé, puis lancez :
```bash
mvn test
```
