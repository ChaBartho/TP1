# TPStage

1.Organisation du code :
  - Répartition des classes axée sur l'horaire
  - Méthodes en chaîne dans le Model
  - Utilisation de Treemap
  - Développement de CRUD dans toutes les class du Model
  - Attention particulière sur le MVC pour bien comprendre le fonctionnement
  
  Model:
   - class Agenda: CRUD de Jour, Session et Inscription
   - class Jour: getter des infos de jour + CRUD de Session et Inscription
   - classe Session: getter des infos de la session + CRUD de Inscription
   - class Inscription: setter et getter des infos de la personne qui s'inscrit
  
  Controller:
   - Détails des choix possibles du menu avec appel des méthodes de la Vue et du Model
  
  Vue:
   - Méthodes pour les différents menus, les messages d'erreur, les input et les affichages
  
  
  
  
  
  
2.Question :
  - Division si éclatée nécessaire ?
  - Dois-je faire des controller pour toutes mes classes ?
  
  
