# Övning 4 grudat18 (ej klar)
### Deadline: 27/4 kl 8.00

Samtliga uppgifter på kursen ska lämnas in på ditt [Githubkonto på KTH](https://gits-15.sys.kth.se/grudat18).
Gör (minst) en fil per uppgift och lägg filerna i katalogen /grudat18/ovn4.
Utgå från mallarna i [/grudat18/ovn0/](https://github.com/yourbasic/grudat18/tree/master/ovn0).

Du väljer själv vilket av programspråken Python, Go eller Java du vill använda.
**Observera att all kod på den här kursen ska dokumenteras och testas.**

Vid övningen ska du vara beredd att muntligt presentera och diskutera
dina lösningar och din programkod.

## Betyg G

### 1 Tidskomplexitet för rekursiva funktioner

Beräkna tidskomplexiteten för funktionerna <code>Pow</code> och <code>Sum</code>.

<pre><code>// Pow returns 2**n, where n >= 0.
func Pow(n int) int {
	if n == 0 {
		return 1
	}
	x := Pow(n/2)
	if n%2 == 0 {
		return x * x
	}
	return 2 * x * x
}
</code></pre>

<pre><code>// Sum returns the sum of the elements in a.
func Sum(a []int) int {
	n := len(a)
	if n == 0 {
		return 0
	}
	if n == 1 {
		return a[0]
	}
	return Sum(a[:n/2]) + Sum(a[n/2:])
}
</code></pre>

## Betyg VG

