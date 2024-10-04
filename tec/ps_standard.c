#include <stdio.h>
#include <stdlib.h>

static const char const *version __attribute__((unused))="Vers: 2.1";

#include "autobus.h"
#include "ps_standard.h"
#include "__internes.h"

struct ps_standard* ps__creer(char *nom, long arret_destination, int indecis) {
  struct ps_standard* st = malloc(sizeof(struct ps_standard));
    st->nom = nom;
    st->etat = 0;
    st->destination = arret_destination;
    st->indecis = indecis;
    return st;
}

void ps__liberer(struct ps_standard *p) {
  free(p);
}

void ps__monter_dans(struct ps_standard *p, struct autobus *a) {
  if (p->indecis == true)
  {
    if (ab__a_place_debout(a))
    {
      __ab__montee_demander_debout(a, p);
    }
  }
  else
  {
    if (ab__a_place_assise(a))
      __ab__montee_demander_assis(a, p);
    else if (ab__a_place_debout(a))
      __ab__montee_demander_debout(a, p);
  }
}

char *ps__nom(const struct ps_standard *p) {
  return p->nom;
}

bool ps__est_dehors(const struct ps_standard *p) {
  return !ps__est_assis(p) && !ps__est_debout(p);
}

bool ps__est_assis(const struct ps_standard *p) {
  return p->etat == 2;
}

bool ps__est_debout(const struct ps_standard *p) {
  return p->etat == 1;
}

void etat_passager(struct ps_standard *p, int val_p){
  if (val_p == 1){
    p->etat = 1;
  }
  else if (val_p == 2)
  {
    p->etat = 2;
  }
  else
  {
    p->etat = 0;
  }
  
}

void ps__affiche_etat(struct ps_standard *p) {
  printf("%s <", p->nom);
  if (p->etat == 2)
    printf("assis");
  else if (p->etat == 1)
    printf("debout");
  else if (p->etat ==0)
    printf("endehors");
  printf(">\n");
}

void ps__toggle_place(struct ps_standard *p, struct autobus *a)
{
  if (p->etat == 1)
  {
    __ab__arret_demander_assis(a, p);
  }
  else if (p->etat == 2)
  {
    __ab__arret_demander_debout(a, p);
  }
  else
  {
    __ab__arret_demander_sortie(a, p);
  }
}


// fonctions internes
void __ps__nouvel_arret(struct ps_standard *p, 
			   struct autobus *a, int numero_arret) {
          
  if (p->destination <= numero_arret)
    __ab__arret_demander_sortie(a, p);
  else{
    if (p->indecis == true)
  {
    ps__toggle_place(p, a);
  }
  
  }
}

