# M335-GeoQuiz

## Idee
Meine Idee war es ein Flaggen Quiz zu erstellen, da ich Spass an Geography hatte und mir nichts anderes in den Sinn kam zu machen. 

## Umsetzung
Damit ich alle Flaggen und Länder habe wollte ich ein library oder eine JSON Datei bei der alles schon drinnen ist damit ich mir die Zeit ersparre dies selber zu machen, ich fand für dies auf Github eine JSON Datei die genau so war wie ich es wollte, den Link dazu habe ich leider nicht mehr. 

## TestProtokoll
| Identifikation  | Vorbereitung  | Schritt für Schritt vorgehen  | Erwartetes Resultat  | Effektives Resultat  | Zeitpunkt |
|---|---|---|---|---| --- |
| 1 | Die App läuft und man sieht den Start Bildschirm.  | Der User wählt die Anzahl Spieler aus (2-4), wenn er Multiplayer auswählt. Sobald er dies getan hat sollten auch die richtige Anzahl unten erscheinen wo er jedem den Namen geben kann.   | Ein User kann die Anzahl Spieler eingeben und seinen Namen. Die App sollte dies korrekt handhaben.  | Der User kann zwar seinen Namen angeben wird aber von der App nie benutzt.  | 19 März 2024 15:00 | 
| 2 | Die Anzahl Spieler wurde schon gewählt.  | Nach dem der User das obig genannte gemacht hat. Kann er das Quiz starten.  | Wenn die Zeit von dem ersten Spieler abgelaufen ist, ist der nächste Spieler an der Reihe. Wenn es keine Spieler mehr gibt, kommt man zum Podest.  | Wenn man zwei Spieler ausgewählt hat wird nach dem ersten Spieler, nach dem seine Zeit abgelaufen ist, die Zeit zurückgestellt. Wenn der auch der zweite keine Zeit mehr hat kommt man zum Podest. Das akutell noch leer ist. | 19 März 2024 15:00 | 
| 3 | Der User hat bereits gespielt  | Nach dem jeder das Quiz durchgeführt hat sollte automatisch das Podest kommen.  | Der Name wird richtig im Podest angezeigt  | Das Podest wird nie angezeigt man kommt einfach auf eine leere seite  | 19 März 2024 15:00 | 
## Reflexion
### Gutes
Ich habe irgendwie nicht das Gefühl das ich etwas überhaupt richtig gemacht habe. Ich sollte nächstes Mal eifnach mehr über Sachen überlegen und schauen wie ich das am besten lösen kann anstatt einfach drauf los gehen und auszuprobieren bis es geht. 

### Schlechtes
Damit die Flagge angezeigt wird, brauchte ich sehr lange, da die Bilder SVGs wahren und das anderst gehandhabt wird. Ich würde nächstes Mal keine SVG Bilder aus dem Internet nehmen, das hätte mir wahrscheinlich eine ernorme Zeitersparnis gegeben. Und wie oben schon gesagt ich habe einfach drauf los probiert ich sollte mir für Sachen mehr Zeit nehmen. Auch hätte ich die Struktur des Codes verbessern können. Ich glaube der Code ist schwer zu lesen und ich könnte in wenn ich ihn in einem Jahr wieder anschaue, selber nicht mehr verstehen. 
