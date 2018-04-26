# Övning 6 grudat18 (ej klar)
### Deadline: 9/5 kl 13.00

> Some people, when confronted with a problem, think “I know, I'll use regular expressions.” Now they have two problems.

Reguljära uttryck och deras varianter är mycket praktiska vid vardaglig programmering. På denna övning
ska du konstruera reguljära uttryck för lite olika strängsökningsproblem.

- Vid övningen ska du som vanligt vara beredd att muntligt presentera och diskutera dina lösningar och din programkod.
- Den här gången ska du testa dina lösningar på [Kattis](https://kth.kattis.com/help)
  innan du lämnar in dem på ditt githubkonto.
- I din skriftliga inlämning ska du enbart lämna in de reguljära uttrycken (inte Pythonkoden)
  tillsammans med en kort **beskrivning** som förklarar hur uttrycken fungerar.

### Kattis

#### Uppgift [kth.progp.s1](https://kth.kattis.com/problems/kth.progp.s1)

Dina funktioner måste ligga i en fil som heter s1.py annars kommer du få Run Time Error (“ImportError”) i Kattis.
Använd kodskelettet [s1.py](s1.py), i vilket ett flertal funktioner definieras.
Alla funktionerna i skelettet returnerar en tom sträng,
men de ska i din lösning returnera strängar som innehåller olika
regex för att lösa de olika deluppgifterna nedan.
T.ex. ska alltså den första funktionen, dna(), returnera
ett regex för att matcha DNA-sekvenser.
Kodskelettet innehåller även lite kod för att testa din lösning,
se kommentarer i kodskelettet för hur du kan gå tillväga med detta.

I två av uppgifterna ska det reguljära uttryck du konstruerar bero på en söksträng som skickas som
indata. Här kan du behöva skriva lite Python-kod.

De uttryck du konstruerar får vara högst 250 tecken långa (detta är en generöst tilltagen gräns),
förutom i de två uppgifterna som tar en söksträng som indata.
Om du i någon av de andra uppgifterna returnerar
ett för långt uttryck så kommer din inskickning att få ett Run Time Error i Kattis.
I de två uppgifterna med en söksträng som indata finns ingen specifik övre gräns
på hur långt ditt uttryck får vara, men om det är för långt och komplicerat
kommer din lösning att få Time Limit Exceeded.

I uppgifter där kravet är att hela strängen ska uppfylla något villkor så måste du använda
de speciella symbolerna ^ och $. Du kan läsa mer
om dessa, samt om vilken regex-funktionalitet som finns i Python i allmänhet,
i [dokumentationen för Pythons re-bibliotek](https://docs.python.org/2/library/re.html).

Uppgifterna är sorterade efter kursledarens åsikt om deras svårighetsgrad, och Kattis
kommer att testa uppgifterna i samma ordning. När du är klar med första uppgiften
kan du alltså skicka in din lösning och se om du klarar alla testfall som hör
till första uppgiften, och så vidare.

## Betyg G

### 1. DNA

Skriv ett regex som matchar en sträng om och endast om den är en DNA-sekvens, dvs bara består
av tecknen ACGT (endast stora bokstäver, ej acgt).

### 2. Sorterade tal

Skriv ett regex som matchar en sträng över tecknen 0-9 om och endast om tecknen strängen
är sorterade i fallande ordning. Till exempel ska “42”, “9876543210”, och “000” matchas, men
“4711”, “11119”, “123”, och “777a” inte matchas.

### 3. Sök efter given sträng – del 1

Skriv ett regex som matchar en sträng s om och endast en given söksträng x förekommer som
delsträng i s. Om söksträngen x är “progp” ska alltså t.ex. strängarna “popororpoprogpepor” och
“progprogp” matchas, men inte “PROGP”, “programmeringsparadigm”, eller “inda”. Du kan anta
att indatasträngen x bara består av bokstäver och siffror.

### 4. Sök efter given sträng – del 2

I den här uppgiften kan du ha användning av metoden [string.join](https://docs.python.org/2/library/stdtypes.html#str.join) ([exempel](http://www.tutorialspoint.com/python/string_join.htm)).
Skriv ett regex som matchar en sträng s om och endast en given söksträng x förekommer som
delsekvens i s, dvs om vi genom att ta bort några tecken ur s kan bilda x. Om söksträngen x är
“progp” ska alltså alla strängar som matchade i exemplet för del 1 fortfarande matcha, men nu ska
även t.ex. “programmeringsparadigm” och “p r o g p” matcha (men inte “inda” eller “poprg”). Du
kan anta att indatasträngen x bara består av bokstäver och siffror.

## Betyg VG

### 5. Ekvationer utan parenteser

Eftersom reguljära uttryck (och även regex) inte kan användas för att kolla om en uppsättning
parenteser är balanserade så kan vi inte skriva regex för att matcha allmänna ekvationer. Men vi
kan skriva ett regex för att matcha aritmetiska uttryck och ekvationer som inte tillåts innehålla
parenteser, och det ska vi göra nu.

De aritmetiska uttrycken vi vill matcha består av ett eller flera heltal, åtskiljda av någon av operatorerna
för de fyra räknesätten: +, -, *, /. Heltalen kan ha inledande nollor (matchande exempel
4 nedan). I början av ett uttryck kan det finnas ett plus- eller minustecken för att explicit säga att
första talet är positivt eller negativt (matchande exempel 2, 3, 5 nedan), men vi tillåter inte detta på
tal i mitten av uttryck (icke-matchande exempel 2 nedan). En ekvation är två uttryck separerade
av ett likhetstecken. Bara ett likhetstecken kan förekomma (icke-matchande exempel 4 nedan).

```
Strängar som ska matchas    Strängar som inte ska matchas

1589+232                    5*x
-12*53+1-2/5                18/-35
18=+17/25                   *23
000=0                       7=7=7
+1+2+3=-5*2/3               3.14159265358
```

## Valfria extrauppgifter (påverkar ej betyg)

### 6. Parenteser med begränsat djup

Reguljära uttryck kan inte användas för att beskriva balanserade parentesuttryck i allmänhet, men
om vi begränsar oss till parentesuttryck med begränsat djup kan vi göra det. Med “djupet” för
ett parentesuttryck menar vi det maximala antalet nästlade parentespar. Djupet för “()” är 1, och
djupet för “()(()(()))” är 3.

Skriv ett regex för att känna igen balanserade parentesuttryck som har djup högst 5. Till exempel
ska strängarna “()()()”, “((((()))))”, “(()((()))())” matcha, men strängarna “())()”, “(((((())))))” och
“(x)” inte matcha.

Tänk på att “(” och “)” har speciell betydelse i regex, och att du måste använda “\(” och “\)” för
att matcha vänster- och höger-parentestecken.

### 7. Sorterade tal igen

Skriv ett regex som matchar en sträng över tecknen 0-9 om och endast om det finns tre intillliggande
siffror någonstans i talet som är sorterade i strikt stigande ordning. Till exempel ska
“123”, “9876456000”, “123456789” och “91370” matcha, men “111”, “415263”, “xyz123xyz” ska inte matchas.

(Tips: börja med att skriva ett reguljärt uttryck för tre siffror i stigande ordning där den mittersta
siffran är t.ex. “4”, och fundera sedan på hur detta kan användas.)

