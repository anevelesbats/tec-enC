Version en langage C du projet "tec". 

1) Compilation
  dans le répertoire racine:
  % make

  Cette commande compile les source dans la répertoire racine (fichiers .o)
  et produit l'exécutable simple. 

2) Exécution
  dans le répertoire racine:
  % ./simple

3) Source
   Dans le répertoire racine : 
    - simple.c un scénario de test de recette qui sert d'exemple
      de client à la partie tec.

   Dans le répertoire tec : 
   - deux fichiers sources : autobus.c et ps_standard.c 
   - trois fichiers en-tête :
     + autobus.h et ps_standard.h déclarent les fonctions 
       de tec utilisées par le client (ici simple.c).
     + __internes.h déclare les fonctions internes de tec 
       que le client n'a pas à connaître et à utiliser.

     
  
