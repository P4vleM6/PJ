NAPOMENA:
Svaki od zadataka treba rešiti korišćenjem ili interfejsa ili apstraktne klase,
u zavisnosti od sadržine zadatka. U svim klasama iskoristiti svojstva
(properties) za javni pristup atributima klase, dok sami atributi ostaju
privatni ili zaštićeni. Svaka od klasa koja se kreira treba da sadrži
konstruktor u kome će se postavljati vrednosti svih atributa. Sve zadatke
implementirati na programskom jeziku C#.

Grupa 2
Projektovati sistem za sređivanje spiska literature na kraju neke knjige ili članka u
časopisu. Klasa Literatura treba da sadrži listu stavki iz literature. Stavka u literaturi
može da predstavlja knjigu i za nju se čuva naziv, lista autora, mesto i godina izdanja.
Stavka u literaturi može da predstavlja članak iz časopisa i za njega se čuva naziv
časopisa, naziv članka, lista autora, mesto i godina izdanja. Stavka u literaturi može da
bude i web stranica i za nju se čuva samo adresa (link) i godina objavljivanja.
U klasi Literatura definisati konstantu maxStavke. Baciti NemaMesta izuzetak ukoliko se
proba dodavanje nove Stavke u Literaturu, a Literatura je već popunjena. Jedna stavka
treba da vraća svoju godinu objavljivanja i da vraća tekst koji sadrži sve bitne podatke o
njoj. Klasa Literatura treba da omogući sortiranje stavki po godini izdanja u rastućem ili
opadajućem redosledu, sortiranje stavki po njihovoj tekstualnoj reprezentaciji u
rastućem ili opadajućem redosledu (po abecedi) i prikaz svih stavki na standardnom
izlazu. Omogućiti čitanje i upis svih informacija o Literaturi korišćenjem klase
StreamReader, odnosno StreamWriter.
U Main metodi kreirati instancu klase Literatura sa određenim brojem stavki, sortirati
stavke po tekstu u rastućem redosledu i prikazati sve stavke iz literature. Dalje treba
testirati metode za rad sa fajlovima u Main metodi, tako što se prvo upiše instanca klase
Literatura u fajl, a nakon toga se pročita sadržaj fajla i smesti u novi objekat klase
Literatura. Kada je sadržaj fajla pročitan štampati sve podatke o Literaturi na standardni
izlaz da biste demonstrirali da sve metode rade. Čitanje iz fajla i upisivanje u fajl ne sme
biti obavljeno u Main-u, već u odgovarajućim funkcijama koje treba pozvati u Main-u.
Prilikom rada sa fajlovima voditi računa o zatvaranju tokova.
