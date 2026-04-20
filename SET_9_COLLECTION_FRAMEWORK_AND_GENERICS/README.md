# SET_09_COLLECTION_FRAMEWORK_AND_GENERICS

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 29: Student Marks (ArrayList)
**Problem Statement:**
Write a Java program that uses an ArrayList<Integer> to store marks of students. Add at least 5 marks, display them, and find the highest and lowest marks using Collections.max() and Collections.min().

**Sample Output:**
```text
Enter 5 marks:
85 92 76 88 95
Marks:
85
92
76
88
95
Highest Marks: 95
Lowest Marks: 76

```

---

## Practical 30: Word Frequency (HashMap)
**Problem Statement:**
Write a program that accepts a sentence from the user and counts the frequency of each word using a HashMap<String, Integer>.

**Sample Output:**
```text
Enter a sentence:
Java is fun and Java is powerful
Word Frequency:
Java -> 2
is -> 2
fun -> 1
and -> 1
powerful -> 1


```

---

## Practical 31: Music Playlist (LinkedList)
**Problem Statement:**
Simulate a Music Playlist using LinkedList<String>. Operations include adding songs, displaying the playlist, playing the first song (remove from front), and skipping the last song (remove from end).

**Sample Output:**
```text
Enter 5 songs:
Song A
Song B
Song C
Song D
Song E
Playlist: [Song A, Song B, Song C, Song D, Song E]
Playing first song: Song A
After playing: [Song B, Song C, Song D, Song E]
Skipping last song: Song E
After skipping: [Song B, Song C, Song D]


```

## Practical 32: Generic Search Method
**Problem Statement:**
Write a generic method searchElement that accepts a LinkedList<T> and an element T to search. Test it with both Integer and String types.

**Sample Output:**
```text
Enter number of roll numbers: 3
Enter roll numbers:
101 102 103
Enter roll number to search: 102
Found: true

Enter number of names: 2
Enter names:
Alice Bob
Enter name to search: Charlie
Found: false


```