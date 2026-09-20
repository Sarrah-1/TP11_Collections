# 📚 TP 11 : Les Collections Java (`List`, `Set`, `Map`)

Ce dépôt rassemble les exercices pratiques du TP 11 axés sur la manipulation avancée du Framework Collections en Java : gestion de listes dynamiques, suppression de doublons et dictionnaires clé-valeur.

## 📝 Résumé des Exercices
# Exercice 1 : Liste de courses (List & ArrayList)

Concepts : Opérations de base sur les listes dynamiques (add, remove, contains, get).

# Exercice 2 : Gestionnaire de tâches (List & Streams)

Concepts : Tri personnalisé (Comparator), filtrage par attribut via Streams Java 8+, et modification dynamique.

# Exercice 3 : Mots uniques (Set)

Concepts : Analyse des comportements des ensembles (HashSet pour la vitesse, LinkedHashSet pour l'ordre d'insertion, TreeSet pour le tri alphabétique).

# Exercice 4 : Dictionnaire bilingue (Map)

Concepts : Association clé-valeur (HashMap, LinkedHashMap, TreeMap) et recherche par préfixe sur une NavigableMap.

# Exercice 5 : Gestion de bibliothèque (Projet de synthèse)

Concepts : Utilisation conjointe de List<Book>, Map<Book, Integer> (stock) et Map<User, List<Book>> (emprunts) avec redéfinition rigoureuse de equals et hashCode.

## 🛠️ Structure du Projet

```text
TP11_Collections/
└── src/
    └── com.example.tp/
        ├── ShoppingList.java     (Ex 1 : Manipulation de List<String>)
        ├── MainShopping.java
        ├── Status.java           (Ex 2 : Énumération d'état)
        ├── Task.java             (Ex 2 : Modèle métier Task)
        ├── TaskManager.java      (Ex 2 : Filtrage et tri de List<Task>)
        ├── MainTasks.java
        ├── WordManager.java      (Ex 3 : Comparaison HashSet, LinkedHashSet, TreeSet)
        ├── MainWords.java
        ├── DictionaryManager.java (Ex 4 : Comparaison HashMap, LinkedHashMap, TreeMap)
        ├── MainDict.java
        ├── Book.java             (Ex 5 : Modèle Book avec equals/hashCode)
        ├── User.java             (Ex 5 : Modèle User avec equals/hashCode)
        ├── Library.java          (Ex 5 : Synthèse List, Set, Map)
        └── MainLibrary.java

---
```
## 👩‍💻 Auteure
* **Sara OUADAY**

---
