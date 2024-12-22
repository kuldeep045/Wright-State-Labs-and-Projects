# Catacomb Crawler

## project description

Catacomb Crawler is a game in which hero enters a catacomb  and has numbers of room. Random rooms may contain monsters. The target is to reach the exit door located on diagonally opposite corner.

This game was build utilizing the concepts of Object Oriented Programming.

## Project Guide

At the start of game you will be asked the name of Hero and then size of catacomb. The size of catacomb will be the number of rooms on either side of catacomb as you enter. There will be one monster for every 6 rooms. example, if you select 7 as size of catacomb then 7 rooms will be on either side and 7 monster will be placed in random rooms.

You will be asked to move in any direction, if you are at corner and still want to move towards wall you won't be able to do so. Else, you will move from one room to another. On moving from one room to another you will lose 2 points from hero health. If monster is in the adjacent room user will be warned. If in same room hero and monster will fight and on death of monster the monster will be removed in the catacomb. The current health and the status of nearby monsters will be shown on every step.

### Additional feature,

If your `health is less than 50` than you will be provided with `one chance` to see the location of monsters and yourself. if there are more than one monsters in same room than also you will be able to see only one monster.

##### map guide
- M  -  monster
- H  -  Hero
- \*  -  rooms


```
show map
```

you will see a map similar to this for catacomb size 5

```
H    M    *    *    *   

*    *    *    *    M   

*    M    *    *    *   

*    *    *    M    *   

*    M    *    *    *  
```

On reaching the exit door the hero will escape the catacomb.




### Dependencies

To play this game, you need to have the following installed on your system:
- **JDK**: Includes the Java Development Kit and Compiler.
- **IDE** *(optional)*: VS Code with the Java extension or IntelliJ IDEA is recommended.


### How to run the project

### Option 1: Using an IDE

1. Open the project folder in your favorite IDE.
2. Open the `Main.java` file.
3. Run the project using the Java debugger or any available tools.

### Option 2: Without an IDE

1. Open the project folder in PowerShell or any terminal.
2. Run the following command:
   ```
    java Main.java
    ```


## Lessons learned
- **OOPS CONCEPT** : I better get hands on with the concept of `object oriented programming`
- **Getter and Setter** : I learnt to work with the getter and setter function to access and manipulate the private variable.
- **ArrayList manipulation** : I learnt to manipulate the array lists in different way like `access` and `remove` certain element from array list.

### bugs detangled
- while removing the dead monster I felt a bit difficulty
- while adding an additional feature to show map I faced difficulty too but reading all the notes provided and working for long time I solved them.