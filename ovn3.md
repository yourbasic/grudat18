# Övning 3 grudat18 (EJ KLAR)
### Deadline: 20/4 kl 10.00

Samtliga uppgifter på kursen ska lämnas in på ditt [Githubkonto på KTH](https://gits-15.sys.kth.se/grudat18).
Gör (minst) en fil per uppgift och lägg filerna i katalogen /grudat18/ovn3.
Utgå från mallarna i [/grudat18/ovn0/](https://github.com/yourbasic/grudat18/tree/master/ovn0).

Du väljer själv vilket av programspråken Python, Go eller Java du vill använda.
**Observera att all kod på den här kursen ska dokumenteras och testas.**

Vid övningen ska du vara beredd att muntligt presentera och diskutera
dina lösningar och din programkod.

## Betyg G

### 3.1 Fakultet i repris

Skriv en rekursiv fakultetsfunktion och bevisa att den är korrekt med hjälp av induktion.

Glöm inte testkoden.

> Beware of bugs in the above code; I have only proved it correct, not tried it.
- Donald Knuth

### 3.2 Typvärde

[Typvärdet](https://sv.wikipedia.org/wiki/Typv%C3%A4rde) (mode)
i ett statistiskt datamaterial är det värde som förekommer flest gånger.
Skriv en funktion som beräknar typvärdet för en vektor med heltal.
Om flera värden är lika vanliga skall funktionen ge det minsta av dem.

Tidskomplexiteten för algoritmen ska vara *O*(*n*&nbsp;log&nbsp;*n*).

### 3.3 Negativt och positivt

Skriv en funktion som ändrar ordningen på en lista med tal så att de negativa talen kommer först.
Talen behöver inte vara sorterade, du behöver endast samla alla negativa tal för sig.
Algoritmen ska använda högst *O*(1) extra utrymme och du får inte använda någon sorteringsalgoritm.

Använd en **loopinvariant** för att förklara hur koden fungerar.

Räkna också ut tidskomplexiteten för din algoritm.

## Betyg VG

För betyg VG ska du göra samma uppgifter som för betyg G,
men med det extra kravet att algoritmerna i **uppgift 3.2 och 3.3** ska ha *O*(*n*) tidskomplexitet.
(Det räcker med förväntad tid, men värstafall går förstås också bra.)
