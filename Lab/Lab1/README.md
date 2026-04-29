tekst zadatka za prvu lab vezbu iz Java:  

Na programskom jeziku Java, u paketu prevoz kreirati apstraktnu klasu Auto sa celobrojnim atributom konjaža, celobrojnim atributom obrtniMoment, celobrojnim atributom klase redniBroj 
i metodom double brutalnost(), klasu SUSAuto (skraćeno od "sa unutrašnjim sagorevanjem") i klasu ElektričniAuto.
Obe klase automobila nasleđuju fabričku klasu Auto i implementiraju bibliotečki interfejs Comparable parametrizovanim tako da omogućava poređenje automobila po brutalnosti. 
Klasa SUSauto ima atribut koji govori o tipu goriva (dizel ili benzin), a klasa ElektričniAuto ima kapacitet baterije. Konstruktori obe ove klase upisuju podatke auta u tekstualnu datoteku 
čije ime je redni broj auta (inkrementira se pri svakom kreiranju novog auta). Brutalnost električnog automobila dobija se proizvodom konjaže i obrtnog momenta kome se doda kapacitet baterije, 
a brutalnost SUS automobila dobija se proizvodom konjaže i obrtnog momenta povećanim za 30% ukoliko je dizel, odnosno 50% ukoliko je benzinac.
 
U istom paketu kreirati klasu Garaža koja čuva automobile u objektu tipa ArrayList parametrizovanom na odgovarajući način, koji ima metod za ubacivanje auta u garažu i metod megatest koji 
brutalnost najbrutalnijeg automobila upisuje u binarnu datoteku "bruteforce.bin". Kao pravilo svi atributi bi trebalo da budu privatni osim ako to iz nekog razloga, u nekom slučaju, nije moguće.
