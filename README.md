Compile with: javac artifacts.java Main.java masterpiece.java paintings.java sculptures.java
Execute with: java Main <arg1> <arg2> (<arg3>)

Executed with arguments such as: 
    5 naturalism bad
    5 naturalism
    8 impressionism excellent
    8 imprassionism
    6 naturalism good
    9 expressionism bad
    9 blabla bad (fails successfully)
    8 naturalism hahaha (fails succesfully)
    25T naturalism bad (fails succesfully)

Κλασεις:

Εχω χρησιμοποιησει μονο τις κλασεις που ειναι απαραιτητες. Με την artifacts και την masterpiece να εχουν pure virtual συναρτηση evaluate. Επισης οι getInfo() ειναι virtual. Δεν θεωρω οτι εχω κανει κατι παραπανησιο ή πολυπλοκο οσο αφορα τις κλασεις και τις συναρτησεις που εχουν μεσα τους οποτε δεν εχω πολλα να πω. Να σημειωθει μονο οτι στην evaluate της sculptures χωρις ορισμα condition θεωρησα το παραδειγμα που ελεγε "Αν η τιμή προσδιορίζεται ως good, η τιμή excellent δεν είναι αποδεκτή" θερωρησα οτι θελει το condition του object να ναι ιδιο με του ορισματος στην ουσια αφου δεν το διευκρυνιζε. Ετσι και στην ιδια συναρτηση της paintings θεωρησα οτι πρεπει το condition του object να ειναι ιδιο ή καλυτερο απο το condition του ορισματος.

Main και λειτουργια προγραμματος:

Εκανα μια μικρη τροποποιηση για να αξιοποιηθει κι η evaluate χωρις ορισμα condition. Επετρεψα να δινει στην γραμμη εντολων ο χρηστης μονο το Ν και το ρευμα και μονο αν θελει δινει και την κατασταση. Οποτε και αν το βαλει θα καλεσθει η μια evaluate αλλιως η αλλη. Αρα εφτιαξα και δευτερη auction για να γινει αυτο.